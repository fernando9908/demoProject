package com.example.demo.dao;

import com.example.demo.po.Order;
import com.example.demo.po.OrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    long countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    List<Order> selectByExampleWithBLOBs(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    Order selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    int updateByPrimaryKey(Order record);
}