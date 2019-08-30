package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Shoes extends Model<Shoes> {

    private static final long serialVersionUID = 1L;

    /**
     * 鞋子ID
     */
	@TableId(value="SHOE_ID", type= IdType.AUTO)
	private Integer shoeId;
    /**
     * 鞋子名字
     */
	@TableField("SHOE_NAME")
	private String shoeName;
    /**
     * 鞋子单价
     */
	@TableField("PRICE")
	private Double price;
    /**
     * 尺码大小
     */
	@TableField("SIZE")
	private Integer size;
    /**
     * 库存
     */
	@TableField("REST_COUNT")
	private Integer restCount;
    /**
     * 一款鞋的总销量ID
     */
	@TableField("SHOE_COUNT_ID")
	private Integer shoeCountId;
    /**
     * 版本号
     */
	@TableField("VERSION")
	private Integer version;


	public Integer getShoeId() {
		return shoeId;
	}

	public Shoes setShoeId(Integer shoeId) {
		this.shoeId = shoeId;
		return this;
	}

	public String getShoeName() {
		return shoeName;
	}

	public Shoes setShoeName(String shoeName) {
		this.shoeName = shoeName;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public Shoes setPrice(Double price) {
		this.price = price;
		return this;
	}

	public Integer getSize() {
		return size;
	}

	public Shoes setSize(Integer size) {
		this.size = size;
		return this;
	}

	public Integer getRestCount() {
		return restCount;
	}

	public Shoes setRestCount(Integer restCount) {
		this.restCount = restCount;
		return this;
	}

	public Integer getShoeCountId() {
		return shoeCountId;
	}

	public Shoes setShoeCountId(Integer shoeCountId) {
		this.shoeCountId = shoeCountId;
		return this;
	}

	public Integer getVersion() {
		return version;
	}

	public Shoes setVersion(Integer version) {
		this.version = version;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.shoeId;
	}

}
