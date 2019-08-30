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
public class Message extends Model<Message> {

    private static final long serialVersionUID = 1L;

    /**
     * 站内通知ID
     */
	@TableId(value="MESSAGE_ID", type= IdType.AUTO)
	private Integer messageId;
    /**
     * 用户ID
     */
	@TableField("USER_ID")
	private Integer userId;
    /**
     * 通知内容
     */
	@TableField("MESSAGE_CONTENT")
	private String messageContent;
    /**
     * 0未读1已读
     */
	@TableField("IS_READ")
	private Integer isRead;
    /**
     * 通知时间
     */
	@TableField("MESSAGE_TIME")
	private Date messageTime;


	public Integer getMessageId() {
		return messageId;
	}

	public Message setMessageId(Integer messageId) {
		this.messageId = messageId;
		return this;
	}

	public Integer getUserId() {
		return userId;
	}

	public Message setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public Message setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		return this;
	}

	public Integer getIsRead() {
		return isRead;
	}

	public Message setIsRead(Integer isRead) {
		this.isRead = isRead;
		return this;
	}

	public Date getMessageTime() {
		return messageTime;
	}

	public Message setMessageTime(Date messageTime) {
		this.messageTime = messageTime;
		return this;
	}

	@Override
	protected Serializable pkVal() {
		return this.messageId;
	}

}
