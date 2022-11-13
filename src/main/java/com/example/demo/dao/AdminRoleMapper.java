package com.example.demo.dao;

import com.example.demo.po.AdminRole;
import com.example.demo.po.AdminRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    long countByExample(AdminRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int deleteByExample(AdminRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int insert(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int insertSelective(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    List<AdminRole> selectByExample(AdminRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    AdminRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByExampleSelective(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByExample(@Param("record") AdminRole record, @Param("example") AdminRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByPrimaryKeySelective(AdminRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ADMIN_ROLE
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByPrimaryKey(AdminRole record);
}