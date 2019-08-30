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
@TableName("shoe_sale_count")
public class ShoeSaleCount extends Model<ShoeSaleCount> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	@TableId(value="SHOE_COUNT_ID", type= IdType.AUTO)
	private Integer shoeCountId;
    /**
     * 一款鞋的名字
     */
	@TableField("SHOE_NAME")
	private String shoeName;
    /**
     * 一款鞋的总销量
     */
	@TableField("TYPE_SALE_COUNT")
	private Integer typeSaleCount;
    /**
     * 浏览量
     */
	@TableField("VIEW_COUNT")
	private Integer viewCount;
    /**
     * 上架日期
     */
	@TableField("PUT_AWAY_TIME")
	private Date putAwayTime;
    /**
     * 图片路径
     */
	@TableField("IMG_PATH")
	private String imgPath;
    /**
     * 细节图片路径
     */
	@TableField("IMG_BIG_PATH")
	private String imgBigPath;
    /**
     * 排行榜分数
     */
	@TableField("RANK_SCORE")
	private Double rankScore;
    /**
     * 鞋子介绍
     */
	@TableField("REMARK")
	private String remark;
    /**
     * 商品状态（0下架1上架）
     */
	@TableField("STATUS")
	private Integer status;
    /**
     * 示例价格
     */
	@TableField("VIEW_PRICE")
	private Double viewPrice;
    /**
     * 好评数
     */
	@TableField("EVA_GOOD")
	private Integer evaGood;
    /**
     * 中评数
     */
	@TableField("EVA_MEDIUM")
	private Integer evaMedium;
    /**
     * 差评数
     */
	@TableField("EVA_BAD")
	private Integer evaBad;
    /**
     * 1为删除，0未删除
     */
	@TableField("IS_DELETE")
	private Integer isDelete;


	public Integer getShoeCountId() {
		return shoeCountId;
	}

	public ShoeSaleCount setShoeCountId(Integer shoeCountId) {
		this.shoeCountId = shoeCountId;
		return this;
	}

	public String getShoeName() {
		return shoeName;
	}

	public ShoeSaleCount setShoeName(String shoeName) {
		this.shoeName = shoeName;
		return this;
	}

	public Integer getTypeSaleCount() {
		return typeSaleCount;
	}

	public ShoeSaleCount setTypeSaleCount(Integer typeSaleCount) {
		this.typeSaleCount = typeSaleCount;
		return this;
	}

	public Integer getViewCount() {
		return viewCount;
	}

	public ShoeSaleCount setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
		return this;
	}

	public Date getPutAwayTime() {
		return putAwayTime;
	}

	public ShoeSaleCount setPutAwayTime(Date putAwayTime) {
		this.putAwayTime = putAwayTime;
		return this;
	}

	public String getImgPath() {
		return imgPath;
	}

	public ShoeSaleCount setImgPath(String imgPath) {
		this.imgPath = imgPath;
		return this;
	}

	public String getImgBigPath() {
		return imgBigPath;
	}

	public ShoeSaleCount setImgBigPath(String imgBigPath) {
		this.imgBigPath = imgBigPath;
		return this;
	}

	public Double getRankScore() {
		return rankScore;
	}

	public ShoeSaleCount setRankScore(Double rankScore) {
		this.rankScore = rankScore;
		return this;
	}

	public String getRemark() {
		return remark;
	}

	public ShoeSaleCount setRemark(String remark) {
		this.remark = remark;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public ShoeSaleCount setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Double getViewPrice() {
		return viewPrice;
	}

	public ShoeSaleCount setViewPrice(Double viewPrice) {
		this.viewPrice = viewPrice;
		return this;
	}

	public Integer getEvaGood() {
		return evaGood;
	}

	public ShoeSaleCount setEvaGood(Integer evaGood) {
		this.evaGood = evaGood;
		return this;
	}

	public Integer getEvaMedium() {
		return evaMedium;
	}

	public ShoeSaleCount setEvaMedium(Integer evaMedium) {
		this.evaMedium = evaMedium;
		return this;
	}

	public Integer getEvaBad() {
		return evaBad;
	}

	public ShoeSaleCount setEvaBad(Integer evaBad) {
		this.evaBad = evaBad;
		return this;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public ShoeSaleCount setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.shoeCountId;
	}

}
