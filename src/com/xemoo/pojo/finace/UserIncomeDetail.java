package com.xemoo.pojo.finace;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 打款交易流水
 * @author xiangzhiwei
 *
 */
public class UserIncomeDetail implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -6098474649346917974L;
	
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 打款金额
	 */
	private BigDecimal amount;
	
	/**
	 * 申请时间
	 */
	private Date reqTime;
	
	/**
	 * 打款时间
	 */
	private Date operTime;
	
	/**
	 * 状态
	 */
	private Integer state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getReqTime() {
		return reqTime;
	}

	public void setReqTime(Date reqTime) {
		this.reqTime = reqTime;
	}

	public Date getOperTime() {
		return operTime;
	}

	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((operTime == null) ? 0 : operTime.hashCode());
		result = prime * result + ((reqTime == null) ? 0 : reqTime.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
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
		UserIncomeDetail other = (UserIncomeDetail) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (operTime == null) {
			if (other.operTime != null)
				return false;
		} else if (!operTime.equals(other.operTime))
			return false;
		if (reqTime == null) {
			if (other.reqTime != null)
				return false;
		} else if (!reqTime.equals(other.reqTime))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserIncomeDetail [id=" + id + ", amount=" + amount
				+ ", reqTime=" + reqTime + ", operTime=" + operTime
				+ ", state=" + state + "]";
	}
	
	
}
