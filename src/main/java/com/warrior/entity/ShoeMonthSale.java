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
@TableName("shoe_month_sale")
public class ShoeMonthSale extends Model<ShoeMonthSale> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 鞋类ID
     */
	@TableField("SHOE_COUNT_ID")
	private Integer shoeCountId;
    /**
     * 年份
     */
	@TableField("YEAR")
	private Integer year;
    /**
     * 月份
     */
	@TableField("MONTH")
	private Integer month;
    /**
     * 月销
     */
	@TableField("SALE_COUNT")
	private Integer saleCount;


	public Integer getId() {
		return id;
	}

	public ShoeMonthSale setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getShoeCountId() {
		return shoeCountId;
	}

	public ShoeMonthSale setShoeCountId(Integer shoeCountId) {
		this.shoeCountId = shoeCountId;
		return this;
	}

	public Integer getYear() {
		return year;
	}

	public ShoeMonthSale setYear(Integer year) {
		this.year = year;
		return this;
	}

	public Integer getMonth() {
		return month;
	}

	public ShoeMonthSale setMonth(Integer month) {
		this.month = month;
		return this;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public ShoeMonthSale setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
