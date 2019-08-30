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
@TableName("cos_value")
public class CosValue extends Model<CosValue> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 用户模板ID
     */
	@TableField("TEMPLATE_ID")
	private Integer templateId;
    /**
     * 鞋类ID
     */
	@TableField("SHOE_COUNT_ID")
	private Integer shoeCountId;
    /**
     * 两者计算后的cos值
     */
	@TableField("COS_VALUE")
	private Double cosValue;


	public Integer getId() {
		return id;
	}

	public CosValue setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public CosValue setTemplateId(Integer templateId) {
		this.templateId = templateId;
		return this;
	}

	public Integer getShoeCountId() {
		return shoeCountId;
	}

	public CosValue setShoeCountId(Integer shoeCountId) {
		this.shoeCountId = shoeCountId;
		return this;
	}

	public Double getCosValue() {
		return cosValue;
	}

	public CosValue setCosValue(Double cosValue) {
		this.cosValue = cosValue;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
