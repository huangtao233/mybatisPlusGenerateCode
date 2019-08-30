package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
	@TableId(value="USER_ID", type= IdType.AUTO)
	private Integer userId;
    /**
     * 用户名
     */
	@TableField("USER_NAME")
	private String userName;
    /**
     * 密码
     */
	@TableField("PASSWORD")
	private String password;
    /**
     * 手机
     */
	@TableField("TELEPHONE")
	private String telephone;
    /**
     * 0买家，1卖家
     */
	@TableField("USER_ROLE")
	private Integer userRole;
    /**
     * 邮箱
     */
	@TableField("EMAIL")
	private String email;
    /**
     * 0男1女
     */
	@TableField("GENDER")
	private Integer gender;
    /**
     * 1是vip,0非VIP
     */
	@TableField("IS_VIP")
	private Integer isVip;
    /**
     * VIP到期时间
     */
	@TableField("VIP_LEFT_DATE")
	private Date vipLeftDate;


	public Integer getUserId() {
		return userId;
	}

	public Userinfo setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public Userinfo setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Userinfo setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getTelephone() {
		return telephone;
	}

	public Userinfo setTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public Userinfo setUserRole(Integer userRole) {
		this.userRole = userRole;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Userinfo setEmail(String email) {
		this.email = email;
		return this;
	}

	public Integer getGender() {
		return gender;
	}

	public Userinfo setGender(Integer gender) {
		this.gender = gender;
		return this;
	}

	public Integer getIsVip() {
		return isVip;
	}

	public Userinfo setIsVip(Integer isVip) {
		this.isVip = isVip;
		return this;
	}

	public Date getVipLeftDate() {
		return vipLeftDate;
	}

	public Userinfo setVipLeftDate(Date vipLeftDate) {
		this.vipLeftDate = vipLeftDate;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

}
