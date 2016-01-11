package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * TbinvestindexdataId generated by hbm2java
 */
public class TbinvestindexdataId implements java.io.Serializable {

	private String combiNo;
	private String indexId;
	private String dateType;
	private BigDecimal transDate;
	private BigDecimal value;
	private String reserve;
	private String reserve2;
	private String reserve3;

	public TbinvestindexdataId() {
	}

	public TbinvestindexdataId(String combiNo, String indexId, String dateType,
			BigDecimal transDate, BigDecimal value, String reserve,
			String reserve2, String reserve3) {
		this.combiNo = combiNo;
		this.indexId = indexId;
		this.dateType = dateType;
		this.transDate = transDate;
		this.value = value;
		this.reserve = reserve;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
	}

	public String getCombiNo() {
		return this.combiNo;
	}

	public void setCombiNo(String combiNo) {
		this.combiNo = combiNo;
	}

	public String getIndexId() {
		return this.indexId;
	}

	public void setIndexId(String indexId) {
		this.indexId = indexId;
	}

	public String getDateType() {
		return this.dateType;
	}

	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public BigDecimal getTransDate() {
		return this.transDate;
	}

	public void setTransDate(BigDecimal transDate) {
		this.transDate = transDate;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TbinvestindexdataId))
			return false;
		TbinvestindexdataId castOther = (TbinvestindexdataId) other;

		return ((this.getCombiNo() == castOther.getCombiNo()) || (this
				.getCombiNo() != null && castOther.getCombiNo() != null && this
				.getCombiNo().equals(castOther.getCombiNo())))
				&& ((this.getIndexId() == castOther.getIndexId()) || (this
						.getIndexId() != null && castOther.getIndexId() != null && this
						.getIndexId().equals(castOther.getIndexId())))
				&& ((this.getDateType() == castOther.getDateType()) || (this
						.getDateType() != null
						&& castOther.getDateType() != null && this
						.getDateType().equals(castOther.getDateType())))
				&& ((this.getTransDate() == castOther.getTransDate()) || (this
						.getTransDate() != null
						&& castOther.getTransDate() != null && this
						.getTransDate().equals(castOther.getTransDate())))
				&& ((this.getValue() == castOther.getValue()) || (this
						.getValue() != null && castOther.getValue() != null && this
						.getValue().equals(castOther.getValue())))
				&& ((this.getReserve() == castOther.getReserve()) || (this
						.getReserve() != null && castOther.getReserve() != null && this
						.getReserve().equals(castOther.getReserve())))
				&& ((this.getReserve2() == castOther.getReserve2()) || (this
						.getReserve2() != null
						&& castOther.getReserve2() != null && this
						.getReserve2().equals(castOther.getReserve2())))
				&& ((this.getReserve3() == castOther.getReserve3()) || (this
						.getReserve3() != null
						&& castOther.getReserve3() != null && this
						.getReserve3().equals(castOther.getReserve3())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCombiNo() == null ? 0 : this.getCombiNo().hashCode());
		result = 37 * result
				+ (getIndexId() == null ? 0 : this.getIndexId().hashCode());
		result = 37 * result
				+ (getDateType() == null ? 0 : this.getDateType().hashCode());
		result = 37 * result
				+ (getTransDate() == null ? 0 : this.getTransDate().hashCode());
		result = 37 * result
				+ (getValue() == null ? 0 : this.getValue().hashCode());
		result = 37 * result
				+ (getReserve() == null ? 0 : this.getReserve().hashCode());
		result = 37 * result
				+ (getReserve2() == null ? 0 : this.getReserve2().hashCode());
		result = 37 * result
				+ (getReserve3() == null ? 0 : this.getReserve3().hashCode());
		return result;
	}

}
