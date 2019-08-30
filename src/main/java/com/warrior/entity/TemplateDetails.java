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
@TableName("template_details")
public class TemplateDetails extends Model<TemplateDetails> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 属性的字典ID的父类字典ID
     */
	@TableField("DIC_PARENT_ID")
	private Integer dicParentId;
    /**
     * 模板回答的属性的字典ID
     */
	@TableField("DIC_ID")
	private Integer dicId;
    /**
     * 模板ID，区分问题
     */
	@TableField("TEMPLATE_ID")
	private Integer templateId;


	public Integer getId() {
		return id;
	}

	public TemplateDetails setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getDicParentId() {
		return dicParentId;
	}

	public TemplateDetails setDicParentId(Integer dicParentId) {
		this.dicParentId = dicParentId;
		return this;
	}

	public Integer getDicId() {
		return dicId;
	}

	public TemplateDetails setDicId(Integer dicId) {
		this.dicId = dicId;
		return this;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public TemplateDetails setTemplateId(Integer templateId) {
		this.templateId = templateId;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
