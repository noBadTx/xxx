package com.xemoo.pojo.finace;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 用户账户账本
 * @author xiangzhiwei
 *
 */
public class UserBalance implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3801923794058708700L;
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 用户id
	 */
	private Long userId;
	
	/**
	 * 我的余额
	 */
	private BigDecimal amount;
	
	/**
	 * 送友余额
	 */
	private BigDecimal giftAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getGiftAmount() {
		return giftAmount;
	}

	public void setGiftAmount(BigDecimal giftAmount) {
		this.giftAmount = giftAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((giftAmount == null) ? 0 : giftAmount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UserBalance other = (UserBalance) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (giftAmount == null) {
			if (other.giftAmount != null)
				return false;
		} else if (!giftAmount.equals(other.giftAmount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "UserBalance [id=" + id + ", userId=" + userId + ", amount="
				+ amount + ", giftAmount=" + giftAmount + "]";
	}
	
	
}
