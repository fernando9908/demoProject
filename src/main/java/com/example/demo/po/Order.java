package com.example.demo.po;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TB_ORDER
 */
public class Order {
    /**
     * Database Column Remarks:
     *   id,自增主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   云课用户id - 家长
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.yunke_parent_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Long yunkeParentUserId;

    /**
     * Database Column Remarks:
     *   云课用户Id - 学生
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.yunke_student_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Long yunkeStudentUserId;

    /**
     * Database Column Remarks:
     *   订单类型（1:链接 2:商品）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.order_type
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Byte orderType;

    /**
     * Database Column Remarks:
     *   订单来源（1:手动 2:支付）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.order_from
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Byte orderFrom;

    /**
     * Database Column Remarks:
     *   链接id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.link_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Long linkId;

    /**
     * Database Column Remarks:
     *   购买数量（名额数）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.pay_number
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Long payNumber;

    /**
     * Database Column Remarks:
     *   支付时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.pay_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private LocalDateTime payTime;

    /**
     * Database Column Remarks:
     *   支付金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.pay_price
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private BigDecimal payPrice;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.create_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private LocalDateTime createTime;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.update_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private LocalDateTime updateTime;

    /**
     * Database Column Remarks:
     *   订单状态(1：未支付 2：支付完成 3：支付失败 4：填报完成 5：审核完成 6：已退款 7：已报名)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   是否删除 (0:否   1是)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.is_delete
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Byte isDelete;

    /**
     * Database Column Remarks:
     *   评价状态（0：未评价，1：已评价）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.comment_status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private Byte commentStatus;

    /**
     * Database Column Remarks:
     *   商品id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.goods_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private String goodsId;

    /**
     * Database Column Remarks:
     *   课表id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.class_schedule_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private String classScheduleId;

    /**
     * Database Column Remarks:
     *   订单id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.order_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private String orderId;

    /**
     * Database Column Remarks:
     *   支付手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.pay_telephone
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private String payTelephone;

    /**
     * Database Column Remarks:
     *   链接快照
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_ORDER.link_snapshot
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    private String linkSnapshot;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.id
     *
     * @return the value of TB_ORDER.id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.id
     *
     * @param id the value for TB_ORDER.id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.yunke_parent_user_id
     *
     * @return the value of TB_ORDER.yunke_parent_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Long getYunkeParentUserId() {
        return yunkeParentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.yunke_parent_user_id
     *
     * @param yunkeParentUserId the value for TB_ORDER.yunke_parent_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setYunkeParentUserId(Long yunkeParentUserId) {
        this.yunkeParentUserId = yunkeParentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.yunke_student_user_id
     *
     * @return the value of TB_ORDER.yunke_student_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Long getYunkeStudentUserId() {
        return yunkeStudentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.yunke_student_user_id
     *
     * @param yunkeStudentUserId the value for TB_ORDER.yunke_student_user_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setYunkeStudentUserId(Long yunkeStudentUserId) {
        this.yunkeStudentUserId = yunkeStudentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.order_type
     *
     * @return the value of TB_ORDER.order_type
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.order_type
     *
     * @param orderType the value for TB_ORDER.order_type
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.order_from
     *
     * @return the value of TB_ORDER.order_from
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Byte getOrderFrom() {
        return orderFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.order_from
     *
     * @param orderFrom the value for TB_ORDER.order_from
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setOrderFrom(Byte orderFrom) {
        this.orderFrom = orderFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.link_id
     *
     * @return the value of TB_ORDER.link_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Long getLinkId() {
        return linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.link_id
     *
     * @param linkId the value for TB_ORDER.link_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.pay_number
     *
     * @return the value of TB_ORDER.pay_number
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Long getPayNumber() {
        return payNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.pay_number
     *
     * @param payNumber the value for TB_ORDER.pay_number
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setPayNumber(Long payNumber) {
        this.payNumber = payNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.pay_time
     *
     * @return the value of TB_ORDER.pay_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public LocalDateTime getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.pay_time
     *
     * @param payTime the value for TB_ORDER.pay_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.pay_price
     *
     * @return the value of TB_ORDER.pay_price
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public BigDecimal getPayPrice() {
        return payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.pay_price
     *
     * @param payPrice the value for TB_ORDER.pay_price
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.create_time
     *
     * @return the value of TB_ORDER.create_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.create_time
     *
     * @param createTime the value for TB_ORDER.create_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.update_time
     *
     * @return the value of TB_ORDER.update_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.update_time
     *
     * @param updateTime the value for TB_ORDER.update_time
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.status
     *
     * @return the value of TB_ORDER.status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.status
     *
     * @param status the value for TB_ORDER.status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.is_delete
     *
     * @return the value of TB_ORDER.is_delete
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.is_delete
     *
     * @param isDelete the value for TB_ORDER.is_delete
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.comment_status
     *
     * @return the value of TB_ORDER.comment_status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public Byte getCommentStatus() {
        return commentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.comment_status
     *
     * @param commentStatus the value for TB_ORDER.comment_status
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setCommentStatus(Byte commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.goods_id
     *
     * @return the value of TB_ORDER.goods_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.goods_id
     *
     * @param goodsId the value for TB_ORDER.goods_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.class_schedule_id
     *
     * @return the value of TB_ORDER.class_schedule_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public String getClassScheduleId() {
        return classScheduleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.class_schedule_id
     *
     * @param classScheduleId the value for TB_ORDER.class_schedule_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setClassScheduleId(String classScheduleId) {
        this.classScheduleId = classScheduleId == null ? null : classScheduleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.order_id
     *
     * @return the value of TB_ORDER.order_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.order_id
     *
     * @param orderId the value for TB_ORDER.order_id
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.pay_telephone
     *
     * @return the value of TB_ORDER.pay_telephone
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public String getPayTelephone() {
        return payTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.pay_telephone
     *
     * @param payTelephone the value for TB_ORDER.pay_telephone
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setPayTelephone(String payTelephone) {
        this.payTelephone = payTelephone == null ? null : payTelephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_ORDER.link_snapshot
     *
     * @return the value of TB_ORDER.link_snapshot
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public String getLinkSnapshot() {
        return linkSnapshot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_ORDER.link_snapshot
     *
     * @param linkSnapshot the value for TB_ORDER.link_snapshot
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    public void setLinkSnapshot(String linkSnapshot) {
        this.linkSnapshot = linkSnapshot == null ? null : linkSnapshot.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getYunkeParentUserId() == null ? other.getYunkeParentUserId() == null : this.getYunkeParentUserId().equals(other.getYunkeParentUserId()))
            && (this.getYunkeStudentUserId() == null ? other.getYunkeStudentUserId() == null : this.getYunkeStudentUserId().equals(other.getYunkeStudentUserId()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getOrderFrom() == null ? other.getOrderFrom() == null : this.getOrderFrom().equals(other.getOrderFrom()))
            && (this.getLinkId() == null ? other.getLinkId() == null : this.getLinkId().equals(other.getLinkId()))
            && (this.getPayNumber() == null ? other.getPayNumber() == null : this.getPayNumber().equals(other.getPayNumber()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getPayPrice() == null ? other.getPayPrice() == null : this.getPayPrice().equals(other.getPayPrice()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getCommentStatus() == null ? other.getCommentStatus() == null : this.getCommentStatus().equals(other.getCommentStatus()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getClassScheduleId() == null ? other.getClassScheduleId() == null : this.getClassScheduleId().equals(other.getClassScheduleId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPayTelephone() == null ? other.getPayTelephone() == null : this.getPayTelephone().equals(other.getPayTelephone()))
            && (this.getLinkSnapshot() == null ? other.getLinkSnapshot() == null : this.getLinkSnapshot().equals(other.getLinkSnapshot()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_ORDER
     *
     * @mbg.generated Sun Nov 13 13:41:41 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getYunkeParentUserId() == null) ? 0 : getYunkeParentUserId().hashCode());
        result = prime * result + ((getYunkeStudentUserId() == null) ? 0 : getYunkeStudentUserId().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getOrderFrom() == null) ? 0 : getOrderFrom().hashCode());
        result = prime * result + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        result = prime * result + ((getPayNumber() == null) ? 0 : getPayNumber().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getPayPrice() == null) ? 0 : getPayPrice().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getCommentStatus() == null) ? 0 : getCommentStatus().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getClassScheduleId() == null) ? 0 : getClassScheduleId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPayTelephone() == null) ? 0 : getPayTelephone().hashCode());
        result = prime * result + ((getLinkSnapshot() == null) ? 0 : getLinkSnapshot().hashCode());
        return result;
    }
}