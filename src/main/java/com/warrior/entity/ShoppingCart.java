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
@TableName("shopping_cart")
public class ShoppingCart extends Model<ShoppingCart> {

    private static final long serialVersionUID = 1L;

    /**
     * 购物车ID
     */
	@TableId(value="CART_ID", type= IdType.AUTO)
	private Integer cartId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
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


	public Integer getCartId() {
		return cartId;
	}

	public ShoppingCart setCartId(Integer cartId) {
		this.cartId = cartId;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public ShoppingCart setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public Integer getShoeId() {
		return shoeId;
	}

	public ShoppingCart setShoeId(Integer shoeId) {
		this.shoeId = shoeId;
		return this;
	}

	public Integer getCount() {
		return count;
	}

	public ShoppingCart setCount(Integer count) {
		this.count = count;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.cartId;
	}

}
