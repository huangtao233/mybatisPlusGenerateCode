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
public class Dictionary extends Model<Dictionary> {

    private static final long serialVersionUID = 1L;

    /**
     * 字典ID
     */
	@TableId(value="DIC_ID", type= IdType.AUTO)
	private Integer dicId;
    /**
     * 字典量（目前没用）
     */
	@TableField("DIC_VALUE")
	private Integer dicValue;
    /**
     * 字典值中文eg：黑
     */
	@TableField("DIC_STRING")
	private String dicString;
    /**
     * 父类字典ID,0为顶级
     */
	@TableField("PARENT_ID")
	private Integer parentId;


	public Integer getDicId() {
		return dicId;
	}

	public Dictionary setDicId(Integer dicId) {
		this.dicId = dicId;
		return this;
	}

	public Integer getDicValue() {
		return dicValue;
	}

	public Dictionary setDicValue(Integer dicValue) {
		this.dicValue = dicValue;
		return this;
	}

	public String getDicString() {
		return dicString;
	}

	public Dictionary setDicString(String dicString) {
		this.dicString = dicString;
		return this;
	}

	public Integer getParentId() {
		return parentId;
	}

	public Dictionary setParentId(Integer parentId) {
		this.parentId = parentId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.dicId;
	}

}
