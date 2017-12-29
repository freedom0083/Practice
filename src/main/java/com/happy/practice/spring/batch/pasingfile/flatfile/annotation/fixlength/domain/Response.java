package com.happy.practice.spring.batch.pasingfile.flatfile.annotation.fixlength.domain;

import java.util.Date;

public class Response {
    private long id;
    private long amount;
    private long batchId;
    private long sourceRowIdx;
    private long idDDReq;
    private int idCategory;
    private int pairedToDdRequest;
    private int businessId;
    private int ddFlag;
    private Date requestDate;
    private Date insertTime;
    private String contractNbr;
    private String returnCode;
    private String ddFlagBatch;
    private String gcType;
    private String ddReqSn;
    private String dealInfo;
    private String payerBankCode;
    private String payerBankReginCode;
    private String payerBankName;
    private String payerAccType;
    private String payerAccCompanyType;
    private String payerAccNo;
    private String payerAccName;
    private String payerIdCardType;
    private String payerIdCardNo;
    private String currencyType;
    private String ddSign;
    private String transSN;
    private String remark;
    private String sysRefCode;
    private String resultInfo;
    private String accBankCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getBatchId() {
        return batchId;
    }

    public void setBatchId(long batchId) {
        this.batchId = batchId;
    }

    public long getSourceRowIdx() {
        return sourceRowIdx;
    }

    public void setSourceRowIdx(long sourceRowIdx) {
        this.sourceRowIdx = sourceRowIdx;
    }

    public long getIdDDReq() {
        return idDDReq;
    }

    public void setIdDDReq(long idDDReq) {
        this.idDDReq = idDDReq;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public int getPairedToDdRequest() {
        return pairedToDdRequest;
    }

    public void setPairedToDdRequest(int pairedToDdRequest) {
        this.pairedToDdRequest = pairedToDdRequest;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public int getDdFlag() {
        return ddFlag;
    }

    public void setDdFlag(int ddFlag) {
        this.ddFlag = ddFlag;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getContractNbr() {
        return contractNbr;
    }

    public void setContractNbr(String contractNbr) {
        this.contractNbr = contractNbr;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getDdFlagBatch() {
        return ddFlagBatch;
    }

    public void setDdFlagBatch(String ddFlagBatch) {
        this.ddFlagBatch = ddFlagBatch;
    }

    public String getGcType() {
        return gcType;
    }

    public void setGcType(String gcType) {
        this.gcType = gcType;
    }

    public String getDdReqSn() {
        return ddReqSn;
    }

    public void setDdReqSn(String ddReqSn) {
        this.ddReqSn = ddReqSn;
    }

    public String getDealInfo() {
        return dealInfo;
    }

    public void setDealInfo(String dealInfo) {
        this.dealInfo = dealInfo;
    }

    public String getPayerBankCode() {
        return payerBankCode;
    }

    public void setPayerBankCode(String payerBankCode) {
        this.payerBankCode = payerBankCode;
    }

    public String getPayerBankReginCode() {
        return payerBankReginCode;
    }

    public void setPayerBankReginCode(String payerBankReginCode) {
        this.payerBankReginCode = payerBankReginCode;
    }

    public String getPayerBankName() {
        return payerBankName;
    }

    public void setPayerBankName(String payerBankName) {
        this.payerBankName = payerBankName;
    }

    public String getPayerAccType() {
        return payerAccType;
    }

    public void setPayerAccType(String payerAccType) {
        this.payerAccType = payerAccType;
    }

    public String getPayerAccCompanyType() {
        return payerAccCompanyType;
    }

    public void setPayerAccCompanyType(String payerAccCompanyType) {
        this.payerAccCompanyType = payerAccCompanyType;
    }

    public String getPayerAccNo() {
        return payerAccNo;
    }

    public void setPayerAccNo(String payerAccNo) {
        this.payerAccNo = payerAccNo;
    }

    public String getPayerAccName() {
        return payerAccName;
    }

    public void setPayerAccName(String payerAccName) {
        this.payerAccName = payerAccName;
    }

    public String getPayerIdCardType() {
        return payerIdCardType;
    }

    public void setPayerIdCardType(String payerIdCardType) {
        this.payerIdCardType = payerIdCardType;
    }

    public String getPayerIdCardNo() {
        return payerIdCardNo;
    }

    public void setPayerIdCardNo(String payerIdCardNo) {
        this.payerIdCardNo = payerIdCardNo;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getDdSign() {
        return ddSign;
    }

    public void setDdSign(String ddSign) {
        this.ddSign = ddSign;
    }

    public String getTransSN() {
        return transSN;
    }

    public void setTransSN(String transSN) {
        this.transSN = transSN;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSysRefCode() {
        return sysRefCode;
    }

    public void setSysRefCode(String sysRefCode) {
        this.sysRefCode = sysRefCode;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }

    public String getAccBankCode() {
        return accBankCode;
    }

    public void setAccBankCode(String accBankCode) {
        this.accBankCode = accBankCode;
    }
}
