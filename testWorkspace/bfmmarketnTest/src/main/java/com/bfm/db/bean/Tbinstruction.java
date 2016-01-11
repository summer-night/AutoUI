package com.bfm.db.bean;

// Generated 2015-12-8 13:28:50 by Hibernate Tools 3.4.0.CR1

/**
 * Tbinstruction generated by hbm2java
 */
public class Tbinstruction implements java.io.Serializable {

	private TbinstructionId id;
	private int transDate;
	private String lockFlag;
	private int indexLastModify;
	private String flowInstanceId;
	private String fundNo;
	private String assetNo;
	private String combiNo;
	private String marketNo;
	private String instructionType;
	private int beginDate;
	private int endDate;
	private int beginTime;
	private int endTime;
	private int directDate;
	private int directTime;
	private String directOperator;
	private String summary;
	private int modifyDate;
	private int modifyTime;
	private String modifyOperator;
	private String modifyReason;
	private int checkDate;
	private int checkTime;
	private String checkOperator;
	private String checkRefuseReason;
	private int cancelDate;
	private int cancelTime;
	private String cancelOperator;
	private String cancelReason;
	private int cancelCheckDate;
	private int cancelCheckTime;
	private String cancelCheckOperator;
	private String cancelCheckRefuseReason;
	private String executeOperator;
	private String instructionStatus;
	private String checkStatus;
	private String approveStatus;
	private String cancelCheckStatus;
	private String entrustExecuteStatus;
	private String dealExecuteStatus;
	private String businClass;
	private int transTime;
	private String approveNoStatus;
	private String approveNo;
	private String virtualInstr;
	private String instructionRelatedNo;
	private String branchNo;
	private String strategy;
	private String reserve1;
	private String reserve2;

	public Tbinstruction() {
	}

	public Tbinstruction(TbinstructionId id, int transDate,
			String lockFlag, int indexLastModify, String flowInstanceId,
			String fundNo, String assetNo, String combiNo, String marketNo,
			String instructionType, int beginDate, int endDate,
			int beginTime, int endTime, int directDate,
			int directTime, String directOperator, String summary,
			int modifyDate, int modifyTime,
			String modifyOperator, String modifyReason, int checkDate,
			int checkTime, String checkOperator,
			String checkRefuseReason, int cancelDate,
			int cancelTime, String cancelOperator, String cancelReason,
			int cancelCheckDate, int cancelCheckTime,
			String cancelCheckOperator, String cancelCheckRefuseReason,
			String executeOperator, String instructionStatus,
			String checkStatus, String approveStatus, String cancelCheckStatus,
			String entrustExecuteStatus, String dealExecuteStatus,
			String businClass, int transTime, String approveNoStatus,
			String approveNo, String virtualInstr, String instructionRelatedNo,
			String branchNo, String strategy, String reserve1, String reserve2) {
		this.id = id;
		this.transDate = transDate;
		this.lockFlag = lockFlag;
		this.indexLastModify = indexLastModify;
		this.flowInstanceId = flowInstanceId;
		this.fundNo = fundNo;
		this.assetNo = assetNo;
		this.combiNo = combiNo;
		this.marketNo = marketNo;
		this.instructionType = instructionType;
		this.beginDate = beginDate;
		this.endDate = endDate;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.directDate = directDate;
		this.directTime = directTime;
		this.directOperator = directOperator;
		this.summary = summary;
		this.modifyDate = modifyDate;
		this.modifyTime = modifyTime;
		this.modifyOperator = modifyOperator;
		this.modifyReason = modifyReason;
		this.checkDate = checkDate;
		this.checkTime = checkTime;
		this.checkOperator = checkOperator;
		this.checkRefuseReason = checkRefuseReason;
		this.cancelDate = cancelDate;
		this.cancelTime = cancelTime;
		this.cancelOperator = cancelOperator;
		this.cancelReason = cancelReason;
		this.cancelCheckDate = cancelCheckDate;
		this.cancelCheckTime = cancelCheckTime;
		this.cancelCheckOperator = cancelCheckOperator;
		this.cancelCheckRefuseReason = cancelCheckRefuseReason;
		this.executeOperator = executeOperator;
		this.instructionStatus = instructionStatus;
		this.checkStatus = checkStatus;
		this.approveStatus = approveStatus;
		this.cancelCheckStatus = cancelCheckStatus;
		this.entrustExecuteStatus = entrustExecuteStatus;
		this.dealExecuteStatus = dealExecuteStatus;
		this.businClass = businClass;
		this.transTime = transTime;
		this.approveNoStatus = approveNoStatus;
		this.approveNo = approveNo;
		this.virtualInstr = virtualInstr;
		this.instructionRelatedNo = instructionRelatedNo;
		this.branchNo = branchNo;
		this.strategy = strategy;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
	}

	public TbinstructionId getId() {
		return this.id;
	}

	public void setId(TbinstructionId id) {
		this.id = id;
	}

	public int getTransDate() {
		return this.transDate;
	}

	public void setTransDate(int transDate) {
		this.transDate = transDate;
	}

	public String getLockFlag() {
		return this.lockFlag;
	}

	public void setLockFlag(String lockFlag) {
		this.lockFlag = lockFlag;
	}

	public int getIndexLastModify() {
		return this.indexLastModify;
	}

	public void setIndexLastModify(int indexLastModify) {
		this.indexLastModify = indexLastModify;
	}

	public String getFlowInstanceId() {
		return this.flowInstanceId;
	}

	public void setFlowInstanceId(String flowInstanceId) {
		this.flowInstanceId = flowInstanceId;
	}

	public String getFundNo() {
		return this.fundNo;
	}

	public void setFundNo(String fundNo) {
		this.fundNo = fundNo;
	}

	public String getAssetNo() {
		return this.assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getCombiNo() {
		return this.combiNo;
	}

	public void setCombiNo(String combiNo) {
		this.combiNo = combiNo;
	}

	public String getMarketNo() {
		return this.marketNo;
	}

	public void setMarketNo(String marketNo) {
		this.marketNo = marketNo;
	}

	public String getInstructionType() {
		return this.instructionType;
	}

	public void setInstructionType(String instructionType) {
		this.instructionType = instructionType;
	}

	public int getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(int beginDate) {
		this.beginDate = beginDate;
	}

	public int getEndDate() {
		return this.endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	public int getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(int beginTime) {
		this.beginTime = beginTime;
	}

	public int getEndTime() {
		return this.endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getDirectDate() {
		return this.directDate;
	}

	public void setDirectDate(int directDate) {
		this.directDate = directDate;
	}

	public int getDirectTime() {
		return this.directTime;
	}

	public void setDirectTime(int directTime) {
		this.directTime = directTime;
	}

	public String getDirectOperator() {
		return this.directOperator;
	}

	public void setDirectOperator(String directOperator) {
		this.directOperator = directOperator;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(int modifyDate) {
		this.modifyDate = modifyDate;
	}

	public int getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(int modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyOperator() {
		return this.modifyOperator;
	}

	public void setModifyOperator(String modifyOperator) {
		this.modifyOperator = modifyOperator;
	}

	public String getModifyReason() {
		return this.modifyReason;
	}

	public void setModifyReason(String modifyReason) {
		this.modifyReason = modifyReason;
	}

	public int getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(int checkDate) {
		this.checkDate = checkDate;
	}

	public int getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(int checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckOperator() {
		return this.checkOperator;
	}

	public void setCheckOperator(String checkOperator) {
		this.checkOperator = checkOperator;
	}

	public String getCheckRefuseReason() {
		return this.checkRefuseReason;
	}

	public void setCheckRefuseReason(String checkRefuseReason) {
		this.checkRefuseReason = checkRefuseReason;
	}

	public int getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(int cancelDate) {
		this.cancelDate = cancelDate;
	}

	public int getCancelTime() {
		return this.cancelTime;
	}

	public void setCancelTime(int cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getCancelOperator() {
		return this.cancelOperator;
	}

	public void setCancelOperator(String cancelOperator) {
		this.cancelOperator = cancelOperator;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public int getCancelCheckDate() {
		return this.cancelCheckDate;
	}

	public void setCancelCheckDate(int cancelCheckDate) {
		this.cancelCheckDate = cancelCheckDate;
	}

	public int getCancelCheckTime() {
		return this.cancelCheckTime;
	}

	public void setCancelCheckTime(int cancelCheckTime) {
		this.cancelCheckTime = cancelCheckTime;
	}

	public String getCancelCheckOperator() {
		return this.cancelCheckOperator;
	}

	public void setCancelCheckOperator(String cancelCheckOperator) {
		this.cancelCheckOperator = cancelCheckOperator;
	}

	public String getCancelCheckRefuseReason() {
		return this.cancelCheckRefuseReason;
	}

	public void setCancelCheckRefuseReason(String cancelCheckRefuseReason) {
		this.cancelCheckRefuseReason = cancelCheckRefuseReason;
	}

	public String getExecuteOperator() {
		return this.executeOperator;
	}

	public void setExecuteOperator(String executeOperator) {
		this.executeOperator = executeOperator;
	}

	public String getInstructionStatus() {
		return this.instructionStatus;
	}

	public void setInstructionStatus(String instructionStatus) {
		this.instructionStatus = instructionStatus;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getCancelCheckStatus() {
		return this.cancelCheckStatus;
	}

	public void setCancelCheckStatus(String cancelCheckStatus) {
		this.cancelCheckStatus = cancelCheckStatus;
	}

	public String getEntrustExecuteStatus() {
		return this.entrustExecuteStatus;
	}

	public void setEntrustExecuteStatus(String entrustExecuteStatus) {
		this.entrustExecuteStatus = entrustExecuteStatus;
	}

	public String getDealExecuteStatus() {
		return this.dealExecuteStatus;
	}

	public void setDealExecuteStatus(String dealExecuteStatus) {
		this.dealExecuteStatus = dealExecuteStatus;
	}

	public String getBusinClass() {
		return this.businClass;
	}

	public void setBusinClass(String businClass) {
		this.businClass = businClass;
	}

	public int getTransTime() {
		return this.transTime;
	}

	public void setTransTime(int transTime) {
		this.transTime = transTime;
	}

	public String getApproveNoStatus() {
		return this.approveNoStatus;
	}

	public void setApproveNoStatus(String approveNoStatus) {
		this.approveNoStatus = approveNoStatus;
	}

	public String getApproveNo() {
		return this.approveNo;
	}

	public void setApproveNo(String approveNo) {
		this.approveNo = approveNo;
	}

	public String getVirtualInstr() {
		return this.virtualInstr;
	}

	public void setVirtualInstr(String virtualInstr) {
		this.virtualInstr = virtualInstr;
	}

	public String getInstructionRelatedNo() {
		return this.instructionRelatedNo;
	}

	public void setInstructionRelatedNo(String instructionRelatedNo) {
		this.instructionRelatedNo = instructionRelatedNo;
	}

	public String getBranchNo() {
		return this.branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public String getStrategy() {
		return this.strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

}
