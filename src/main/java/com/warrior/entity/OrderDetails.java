package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author huangtao
 * @since 2019-08-30
 */
@TableName("order_details")
public class OrderDetails extends Model<OrderDetails> {

    private static final long serialVersionUID = 1L;

    /**
     * 详情ID
     */
	@TableId(value="DETAIL_ID", type= IdType.AUTO)
	private Integer detailId;
    /**
     * 订单ID
     */
	@TableField("ORDER_ID")
	private Integer orderId;
    /**
     * 鞋子ID
     */
	@TableField("SHOE_ID")
	private Integer shoeId;
    /**
     * 购买数量
     */
	@TableField("COUNT")
	private Integer count;
    /**
     * 总价
     */
	@TableField("PRICE")
	private Double price;


	public Integer getDetailId() {
		return detailId;
	}

	public OrderDetails setDetailId(Integer detailId) {
		this.detailId = detailId;
		return this;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public OrderDetails setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public Integer getShoeId() {
		return shoeId;
	}

	public OrderDetails setShoeId(Integer shoeId) {
		this.shoeId = shoeId;
		return this;
	}

	public Integer getCount() {
		return count;
	}

	public OrderDetails setCount(Integer count) {
		this.count = count;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public OrderDetails setPrice(Double price) {
		this.price = price;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.detailId;
	}

}
