package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huangtao
 * @since 2019-08-30
 */
public class Orders extends Model<Orders> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单ID
     */
	@TableId(value="ORDER_ID", type= IdType.AUTO)
	private Integer orderId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
    /**
     * 收货地址和联系电话
     */
	@TableField("ADDRESS")
	private String address;
    /**
     * 订单状态（0未付款，1未发货，2已发货，3待评价，4交易完成，5已取消）
     */
	@TableField("ORDER_STATUS")
	private Integer orderStatus;
    /**
     * 订单总价
     */
	@TableField("TOTAL_PRICE")
	private Double totalPrice;
    /**
     * 订单生成时间
     */
	@TableField("GENERATE_TIME")
	private Date generateTime;
    /**
     * 订单付款时间
     */
	@TableField("PAY_TIME")
	private Date payTime;
    /**
     * 订单发货时间
     */
	@TableField("DELIVERY_TIME")
	private Date deliveryTime;
    /**
     * 订单成交时间（即收货时间）
     */
	@TableField("COMPLETED_TIME")
	private Date completedTime;
    /**
     * 订单留言
     */
	@TableField("ORDER_REMARK")
	private String orderRemark;
    /**
     * 0:都显示1:卖家删除2:买家删除
     */
	@TableField("VIEW_STATUS")
	private Integer viewStatus;
    /**
     * 物流单号
     */
	@TableField("TRACKING_NUM")
	private String trackingNum;
    /**
     * VIP打折后的价格
     */
	@TableField("VIP_TOTAL_PRICE")
	private Double vipTotalPrice;
    /**
     * VIP折扣
     */
	@TableField("VIP_DISCOUNT")
	private Double vipDiscount;


	public Integer getOrderId() {
		return orderId;
	}

	public Orders setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public Orders setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public Orders setAddress(String address) {
		this.address = address;
		return this;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public Orders setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
		return this;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public Orders setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
		return this;
	}

	public Date getGenerateTime() {
		return generateTime;
	}

	public Orders setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
		return this;
	}

	public Date getPayTime() {
		return payTime;
	}

	public Orders setPayTime(Date payTime) {
		this.payTime = payTime;
		return this;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public Orders setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
		return this;
	}

	public Date getCompletedTime() {
		return completedTime;
	}

	public Orders setCompletedTime(Date completedTime) {
		this.completedTime = completedTime;
		return this;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public Orders setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
		return this;
	}

	public Integer getViewStatus() {
		return viewStatus;
	}

	public Orders setViewStatus(Integer viewStatus) {
		this.viewStatus = viewStatus;
		return this;
	}

	public String getTrackingNum() {
		return trackingNum;
	}

	public Orders setTrackingNum(String trackingNum) {
		this.trackingNum = trackingNum;
		return this;
	}

	public Double getVipTotalPrice() {
		return vipTotalPrice;
	}

	public Orders setVipTotalPrice(Double vipTotalPrice) {
		this.vipTotalPrice = vipTotalPrice;
		return this;
	}

	public Double getVipDiscount() {
		return vipDiscount;
	}

	public Orders setVipDiscount(Double vipDiscount) {
		this.vipDiscount = vipDiscount;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.orderId;
	}

}
