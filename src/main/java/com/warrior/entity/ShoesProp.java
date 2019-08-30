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
@TableName("shoes_prop")
public class ShoesProp extends Model<ShoesProp> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="PROP_ID", type= IdType.AUTO)
	private Integer propId;
    /**
     * 鞋子总类ID
     */
	@TableField("SHOE_COUNT_ID")
	private Integer shoeCountId;
    /**
     * 关联字典父项ID
     */
	@TableField("DIC_PARENT_ID")
	private Integer dicParentId;
    /**
     * 关联字典子项ID
     */
	@TableField("DIC_ID")
	private Integer dicId;


	public Integer getPropId() {
		return propId;
	}

	public ShoesProp setPropId(Integer propId) {
		this.propId = propId;
		return this;
	}

	public Integer getShoeCountId() {
		return shoeCountId;
	}

	public ShoesProp setShoeCountId(Integer shoeCountId) {
		this.shoeCountId = shoeCountId;
		return this;
	}

	public Integer getDicParentId() {
		return dicParentId;
	}

	public ShoesProp setDicParentId(Integer dicParentId) {
		this.dicParentId = dicParentId;
		return this;
	}

	public Integer getDicId() {
		return dicId;
	}

	public ShoesProp setDicId(Integer dicId) {
		this.dicId = dicId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.propId;
	}

}
