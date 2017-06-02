package com.mapper.generate;

import com.entity.UserRoleRelation;
import com.entity.UserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int countByExample(UserRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int deleteByExample(UserRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int deleteByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int insert(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int insertSelective(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    List<UserRoleRelation> selectByExample(UserRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    UserRoleRelation selectByPrimaryKey(Integer userRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserRoleRelation record, @Param("example") UserRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByExample(@Param("record") UserRoleRelation record, @Param("example") UserRoleRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByPrimaryKeySelective(UserRoleRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role_relation
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    int updateByPrimaryKey(UserRoleRelation record);
}