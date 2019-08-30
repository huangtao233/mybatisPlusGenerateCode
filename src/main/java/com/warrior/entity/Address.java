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
public class Address extends Model<Address> {

    private static final long serialVersionUID = 1L;

    /**
     * 地址ID
     */
	@TableId(value="ADDR_ID", type= IdType.AUTO)
	private Integer addrId;
    /**
     * 地址
     */
	@TableField("ADDR_CONTENT")
	private String addrContent;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
    /**
     * 真实姓名
     */
	@TableField("TRUE_NAME")
	private String trueName;
    /**
     * 手机
     */
	@TableField("TELEPHONE")
	private String telephone;
    /**
     * 1默认地址，0非默认
     */
	@TableField("IS_DEFAULT")
	private Integer isDefault;


	public Integer getAddrId() {
		return addrId;
	}

	public Address setAddrId(Integer addrId) {
		this.addrId = addrId;
		return this;
	}

	public String getAddrContent() {
		return addrContent;
	}

	public Address setAddrContent(String addrContent) {
		this.addrContent = addrContent;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public Address setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getTrueName() {
		return trueName;
	}

	public Address setTrueName(String trueName) {
		this.trueName = trueName;
		return this;
	}

	public String getTelephone() {
		return telephone;
	}

	public Address setTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public Address setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.addrId;
	}

}
