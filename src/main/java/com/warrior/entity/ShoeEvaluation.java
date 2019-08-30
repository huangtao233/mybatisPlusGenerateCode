package com.warrior.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
@TableName("shoe_evaluation")
public class ShoeEvaluation extends Model<ShoeEvaluation> {

    private static final long serialVersionUID = 1L;

    /**
     * 评价ID
     */
	@TableId(value="EVA_ID", type= IdType.AUTO)
	private Integer evaId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
    /**
     * 鞋子ID
     */
	@TableField("SHOE_ID")
	private Integer shoeId;
    /**
     * 评价时间
     */
	@TableField("EVA_TIME")
	private Date evaTime;
    /**
     * 评价内容
     */
	@TableField("EVA_CONTENT")
	private String evaContent;
    /**
     * 顶级评论ID(根ID)顶级评论的rootId是null,这个类似字典的树形，同一个rootId就是同一个评价底下的
     */
	@TableField("ROOT_ID")
	private Integer rootId;
    /**
     * 回复对象ID，0为一级评论
     */
	@TableField("TO_USERID")
	private Integer toUserid;
    /**
     * 1好评，2中评，3差评
     */
	@TableField("EVA_TYPE")
	private Integer evaType;
    /**
     * 评价图片
     */
	@TableField("EVA_IMG")
	private String evaImg;
    /**
     * 0待审核，1审核通过，2审核拒绝，3申诉中，4申诉通过，5申诉拒绝
     */
	@TableField("EVA_STATUS")
	private Integer evaStatus;
    /**
     * 卖家审核驳回理由
     */
	@TableField("REJECT_REASON")
	private String rejectReason;
    /**
     * 买家申诉理由
     */
	@TableField("APPEAL_REASON")
	private String appealReason;
    /**
     * 申诉驳回理由
     */
	@TableField("REJECT_AGAIN_REASON")
	private String rejectAgainReason;


	public Integer getEvaId() {
		return evaId;
	}

	public ShoeEvaluation setEvaId(Integer evaId) {
		this.evaId = evaId;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public ShoeEvaluation setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public Integer getShoeId() {
		return shoeId;
	}

	public ShoeEvaluation setShoeId(Integer shoeId) {
		this.shoeId = shoeId;
		return this;
	}

	public Date getEvaTime() {
		return evaTime;
	}

	public ShoeEvaluation setEvaTime(Date evaTime) {
		this.evaTime = evaTime;
		return this;
	}

	public String getEvaContent() {
		return evaContent;
	}

	public ShoeEvaluation setEvaContent(String evaContent) {
		this.evaContent = evaContent;
		return this;
	}

	public Integer getRootId() {
		return rootId;
	}

	public ShoeEvaluation setRootId(Integer rootId) {
		this.rootId = rootId;
		return this;
	}

	public Integer getToUserid() {
		return toUserid;
	}

	public ShoeEvaluation setToUserid(Integer toUserid) {
		this.toUserid = toUserid;
		return this;
	}

	public Integer getEvaType() {
		return evaType;
	}

	public ShoeEvaluation setEvaType(Integer evaType) {
		this.evaType = evaType;
		return this;
	}

	public String getEvaImg() {
		return evaImg;
	}

	public ShoeEvaluation setEvaImg(String evaImg) {
		this.evaImg = evaImg;
		return this;
	}

	public Integer getEvaStatus() {
		return evaStatus;
	}

	public ShoeEvaluation setEvaStatus(Integer evaStatus) {
		this.evaStatus = evaStatus;
		return this;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public ShoeEvaluation setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
		return this;
	}

	public String getAppealReason() {
		return appealReason;
	}

	public ShoeEvaluation setAppealReason(String appealReason) {
		this.appealReason = appealReason;
		return this;
	}

	public String getRejectAgainReason() {
		return rejectAgainReason;
	}

	public ShoeEvaluation setRejectAgainReason(String rejectAgainReason) {
		this.rejectAgainReason = rejectAgainReason;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.evaId;
	}

}
