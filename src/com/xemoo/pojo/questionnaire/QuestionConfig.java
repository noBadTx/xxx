package com.xemoo.pojo.questionnaire;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class QuestionConfig implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3343765899278016616L;

	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 问卷id
	 */
	private Long qsId;
	
	/**
	 * 优秀礼金
	 */
	private BigDecimal amountExcellent;
	
	/**
	 * 良好礼金
	 */
	private BigDecimal amountFine;
	
	/**
	 * 送友礼金
	 */
	private BigDecimal amountFriend;
	
	/**
	 * 创建时间
	 */
	private Date create;

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

	public BigDecimal getAmountExcellent() {
		return amountExcellent;
	}

	public void setAmountExcellent(BigDecimal amountExcellent) {
		this.amountExcellent = amountExcellent;
	}

	public BigDecimal getAmountFine() {
		return amountFine;
	}

	public void setAmountFine(BigDecimal amountFine) {
		this.amountFine = amountFine;
	}

	public BigDecimal getAmountFrind() {
		return amountFriend;
	}

	public void setAmountFrind(BigDecimal amountFrind) {
		this.amountFriend = amountFrind;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((amountExcellent == null) ? 0 : amountExcellent.hashCode());
		result = prime * result
				+ ((amountFine == null) ? 0 : amountFine.hashCode());
		result = prime * result
				+ ((amountFriend == null) ? 0 : amountFriend.hashCode());
		result = prime * result + ((create == null) ? 0 : create.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((qsId == null) ? 0 : qsId.hashCode());
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
		QuestionConfig other = (QuestionConfig) obj;
		if (amountExcellent == null) {
			if (other.amountExcellent != null)
				return false;
		} else if (!amountExcellent.equals(other.amountExcellent))
			return false;
		if (amountFine == null) {
			if (other.amountFine != null)
				return false;
		} else if (!amountFine.equals(other.amountFine))
			return false;
		if (amountFriend == null) {
			if (other.amountFriend != null)
				return false;
		} else if (!amountFriend.equals(other.amountFriend))
			return false;
		if (create == null) {
			if (other.create != null)
				return false;
		} else if (!create.equals(other.create))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (qsId == null) {
			if (other.qsId != null)
				return false;
		} else if (!qsId.equals(other.qsId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QuestionConfig [id=" + id + ", qsId=" + qsId
				+ ", amountExcellent=" + amountExcellent + ", amountFine="
				+ amountFine + ", amountFrind=" + amountFriend + ", create="
				+ create + "]";
	}
	
	
}