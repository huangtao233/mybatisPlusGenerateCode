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
@TableName("system_prop")
public class SystemProp extends Model<SystemProp> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	@TableId(value="ID", type= IdType.AUTO)
	private Integer id;
    /**
     * 系统属性名
     */
	@TableField("PROP_NAME")
	private String propName;
    /**
     * 系统属性值
     */
	@TableField("PROP_VALUE")
	private String propValue;
    /**
     * 备注
     */
	@TableField("PROP_REMARK")
	private String propRemark;


	public Integer getId() {
		return id;
	}

	public SystemProp setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getPropName() {
		return propName;
	}

	public SystemProp setPropName(String propName) {
		this.propName = propName;
		return this;
	}

	public String getPropValue() {
		return propValue;
	}

	public SystemProp setPropValue(String propValue) {
		this.propValue = propValue;
		return this;
	}

	public String getPropRemark() {
		return propRemark;
	}

	public SystemProp setPropRemark(String propRemark) {
		this.propRemark = propRemark;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
