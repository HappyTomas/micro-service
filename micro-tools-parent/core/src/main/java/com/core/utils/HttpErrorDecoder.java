package com.core.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.core.exception.MicroException;
import com.core.exception.UnPermissionException;
import com.core.support.web.domain.ErrorResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import java.lang.reflect.Constructor;

public class HttpErrorDecoder {
    static Logger logger = LoggerFactory.getLogger(HttpErrorDecoder.class);

    private static Object tryParseObject(String body) {
        try {
            return JSON.parseObject(body);
        } catch (Exception e) {
            return body;
        }

    }

    public static MicroException decode(HttpStatus status, String body) {
        try {
            if (status == HttpStatus.INTERNAL_SERVER_ERROR && StringUtils.isNotBlank(body)) {
                Object pBody = tryParseObject(body);
                if (pBody instanceof String) {
                    return new MicroException(pBody.toString());
                }
                JSONObject jsonObj = JSON.parseObject(body);
                if (jsonObj.get("error_description") != null) {// 鉴权验证失败
                    return new MicroException("服务异常");
                }
                String message = jsonObj.get("message").toString();
                String code = jsonObj.get("code").toString();
                String exceptionPath = jsonObj.get("exception").toString();
                Class<?> exceptionClass = Class.forName(exceptionPath);
                Constructor<?> constructor = exceptionClass.getConstructor(new Class[]{String.class, String.class});
                return (MicroException) constructor.newInstance(new Object[]{message, code});
            } else if (status == HttpStatus.UNAUTHORIZED) {// 401
                return new UnPermissionException("无权访问");
            } else {
                return new MicroException("服务异常");
            }
        } catch (Exception e) {
            logger.warn("解析异常【body:{} ,status:{}】事件", status, body, e);
        }
        return new MicroException("服务异常");
    }

    public static ErrorResult decode(String body) {
        try {
            if (StringUtils.isBlank(body))
                return null;
            Object pBody = tryParseObject(body);
            if (pBody instanceof String)
                return null;
            ErrorResult errorResult = JSON.parseObject(body, ErrorResult.class);
            if (StringUtils.isNotBlank(errorResult.getException()))
                return errorResult;
            return null;
        } catch (Exception e) {
            logger.warn("解析Feign【body:{} 】事件", body, e);
        }
        return null;
    }
}
