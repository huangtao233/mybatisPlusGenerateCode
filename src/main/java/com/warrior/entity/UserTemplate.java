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
@TableName("user_template")
public class UserTemplate extends Model<UserTemplate> {

    private static final long serialVersionUID = 1L;

    /**
     * 模板ID
     */
	@TableId(value="TEMPLATE_ID", type= IdType.AUTO)
	private Integer templateId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
    /**
     * 模板名字
     */
	@TableField("TEMPLATE_NAME")
	private String templateName;
    /**
     * 1默认，0非默认
     */
	@TableField("IS_DEFAULT")
	private Integer isDefault;


	public Integer getTemplateId() {
		return templateId;
	}

	public UserTemplate setTemplateId(Integer templateId) {
		this.templateId = templateId;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public UserTemplate setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getTemplateName() {
		return templateName;
	}

	public UserTemplate setTemplateName(String templateName) {
		this.templateName = templateName;
		return this;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public UserTemplate setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.templateId;
	}

}
