package com.xemoo.pojo.questionnaire;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QuestionSummaryUser implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 432486414353696381L;
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 问卷id
	 */
	private Long qsId;
	
	/**
	 * 用户id
	 */
	private Long userId;
	
	/**
	 * 发礼状态 0:未审核 1：不发礼  2：已发礼
	 */
	private Integer giftState;
	
	/**
	 * 个人礼金
	 */
	private BigDecimal privateGift;
	
	/**
	 * 送友礼金
	 */
	private BigDecimal friendGift;
	
	/**
	 * 创建时间
	 */
	private Date create;
	
	/**
	 * 修改时间
	 */
	private Date modify;
	
	/**
	 * 记录状态  1:有效 0：无效
	 */
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getQsId() {
		return qsId;
	}

	public void setQsId(Long qsId) {
		this.qsId = qsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getGiftState() {
		return giftState;
	}

	public void setGiftState(Integer giftState) {
		this.giftState = giftState;
	}

	public BigDecimal getPrivateGift() {
		return privateGift;
	}

	public void setPrivateGift(BigDecimal privateGift) {
		this.privateGift = privateGift;
	}

	public BigDecimal getFriendGift() {
		return friendGift;
	}

	public void setFriendGift(BigDecimal friendGift) {
		this.friendGift = friendGift;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public Date getModify() {
		return modify;
	}

	public void setModify(Date modify) {
		this.modify = modify;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((create == null) ? 0 : create.hashCode());
		result = prime * result
				+ ((friendGift == null) ? 0 : friendGift.hashCode());
		result = prime * result
				+ ((giftState == null) ? 0 : giftState.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modify == null) ? 0 : modify.hashCode());
		result = prime * result
				+ ((privateGift == null) ? 0 : privateGift.hashCode());
		result = prime * result + ((qsId == null) ? 0 : qsId.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionSummaryUser other = (QuestionSummaryUser) obj;
		if (create == null) {
			if (other.create != null)
				return false;
		} else if (!create.equals(other.create))
			return false;
		if (friendGift == null) {
			if (other.friendGift != null)
				return false;
		} else if (!friendGift.equals(other.friendGift))
			return false;
		if (giftState == null) {
			if (other.giftState != null)
				return false;
		} else if (!giftState.equals(other.giftState))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modify == null) {
			if (other.modify != null)
				return false;
		} else if (!modify.equals(other.modify))
			return false;
		if (privateGift == null) {
			if (other.privateGift != null)
				return false;
		} else if (!privateGift.equals(other.privateGift))
			return false;
		if (qsId == null) {
			if (other.qsId != null)
				return false;
		} else if (!qsId.equals(other.qsId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuestionSummaryUser [id=" + id + ", qsId=" + qsId + ", userId="
				+ userId + ", giftState=" + giftState + ", privateGift="
				+ privateGift + ", friendGift=" + friendGift + ", create="
				+ create + ", modify=" + modify + ", status=" + status + "]";
	}
	
}
