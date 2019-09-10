package com.tsit.ipms.entity.PS15012;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  InhospIndexNo;

  private String  InhospNo;

  private String  PatIndexNo;

  private String  InvoiceNo;

  private String  PatName;

  private String  CurrDeptCode;

  private String  CurrWardCode;

  private String  MfsMethodCode;

  private String  MfsMethodName;

  private String  MedicareCategCode;

  private String  MedicareCategName;

  private String  MedicalTotalFee;

  private String  SelfExpenseFee;

  private String  SelfPaymentFee;

  private String  MedicarePayMoney;

  private String  SelfPayMoney;

  private String  DiscountMoney;

  private String  ReliefMoney;

  private String  RoundingMoney;

  private String  ArrearageFlag;

  private String  ArrearageMoney;

  private String  ArrearageSettlementAuthorizer;

  private String  ActualInhospDays;

  private String  OperStaffCode;

  private String  EmpiId;

  private String  OperDate;

  public String getInhospIndexNo(){
      return InhospIndexNo;
}
  @XmlElement(name = "INHOSP_INDEX_NO")
  public void setInhospIndexNo(String inhospIndexNo) {
      this.InhospIndexNo = inhospIndexNo;
  }

  public String getInhospNo(){
      return InhospNo;
}
  @XmlElement(name = "INHOSP_NO")
  public void setInhospNo(String inhospNo) {
      this.InhospNo = inhospNo;
  }

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getInvoiceNo(){
      return InvoiceNo;
}
  @XmlElement(name = "INVOICE_NO")
  public void setInvoiceNo(String invoiceNo) {
      this.InvoiceNo = invoiceNo;
  }

  public String getPatName(){
      return PatName;
}
  @XmlElement(name = "PAT_NAME")
  public void setPatName(String patName) {
      this.PatName = patName;
  }

  public String getCurrDeptCode(){
      return CurrDeptCode;
}
  @XmlElement(name = "CURR_DEPT_CODE")
  public void setCurrDeptCode(String currDeptCode) {
      this.CurrDeptCode = currDeptCode;
  }

  public String getCurrWardCode(){
      return CurrWardCode;
}
  @XmlElement(name = "CURR_WARD_CODE")
  public void setCurrWardCode(String currWardCode) {
      this.CurrWardCode = currWardCode;
  }

  public String getMfsMethodCode(){
      return MfsMethodCode;
}
  @XmlElement(name = "MFS_METHOD_CODE")
  public void setMfsMethodCode(String mfsMethodCode) {
      this.MfsMethodCode = mfsMethodCode;
  }

  public String getMfsMethodName(){
      return MfsMethodName;
}
  @XmlElement(name = "MFS_METHOD_NAME")
  public void setMfsMethodName(String mfsMethodName) {
      this.MfsMethodName = mfsMethodName;
  }

  public String getMedicareCategCode(){
      return MedicareCategCode;
}
  @XmlElement(name = "MEDICARE_CATEG_CODE")
  public void setMedicareCategCode(String medicareCategCode) {
      this.MedicareCategCode = medicareCategCode;
  }

  public String getMedicareCategName(){
      return MedicareCategName;
}
  @XmlElement(name = "MEDICARE_CATEG_NAME")
  public void setMedicareCategName(String medicareCategName) {
      this.MedicareCategName = medicareCategName;
  }

  public String getMedicalTotalFee(){
      return MedicalTotalFee;
}
  @XmlElement(name = "MEDICAL_TOTAL_FEE")
  public void setMedicalTotalFee(String medicalTotalFee) {
      this.MedicalTotalFee = medicalTotalFee;
  }

  public String getSelfExpenseFee(){
      return SelfExpenseFee;
}
  @XmlElement(name = "SELF_EXPENSE_FEE")
  public void setSelfExpenseFee(String selfExpenseFee) {
      this.SelfExpenseFee = selfExpenseFee;
  }

  public String getSelfPaymentFee(){
      return SelfPaymentFee;
}
  @XmlElement(name = "SELF_PAYMENT_FEE")
  public void setSelfPaymentFee(String selfPaymentFee) {
      this.SelfPaymentFee = selfPaymentFee;
  }

  public String getMedicarePayMoney(){
      return MedicarePayMoney;
}
  @XmlElement(name = "MEDICARE_PAY_MONEY")
  public void setMedicarePayMoney(String medicarePayMoney) {
      this.MedicarePayMoney = medicarePayMoney;
  }

  public String getSelfPayMoney(){
      return SelfPayMoney;
}
  @XmlElement(name = "SELF_PAY_MONEY")
  public void setSelfPayMoney(String selfPayMoney) {
      this.SelfPayMoney = selfPayMoney;
  }

  public String getDiscountMoney(){
      return DiscountMoney;
}
  @XmlElement(name = "DISCOUNT_MONEY")
  public void setDiscountMoney(String discountMoney) {
      this.DiscountMoney = discountMoney;
  }

  public String getReliefMoney(){
      return ReliefMoney;
}
  @XmlElement(name = "RELIEF_MONEY")
  public void setReliefMoney(String reliefMoney) {
      this.ReliefMoney = reliefMoney;
  }

  public String getRoundingMoney(){
      return RoundingMoney;
}
  @XmlElement(name = "ROUNDING_MONEY")
  public void setRoundingMoney(String roundingMoney) {
      this.RoundingMoney = roundingMoney;
  }

  public String getArrearageFlag(){
      return ArrearageFlag;
}
  @XmlElement(name = "ARREARAGE_FLAG")
  public void setArrearageFlag(String arrearageFlag) {
      this.ArrearageFlag = arrearageFlag;
  }

  public String getArrearageMoney(){
      return ArrearageMoney;
}
  @XmlElement(name = "ARREARAGE_MONEY")
  public void setArrearageMoney(String arrearageMoney) {
      this.ArrearageMoney = arrearageMoney;
  }

  public String getArrearageSettlementAuthorizer(){
      return ArrearageSettlementAuthorizer;
}
  @XmlElement(name = "ARREARAGE_SETTLEMENT_AUTHORIZER")
  public void setArrearageSettlementAuthorizer(String arrearageSettlementAuthorizer) {
      this.ArrearageSettlementAuthorizer = arrearageSettlementAuthorizer;
  }

  public String getActualInhospDays(){
      return ActualInhospDays;
}
  @XmlElement(name = "ACTUAL_INHOSP_DAYS")
  public void setActualInhospDays(String actualInhospDays) {
      this.ActualInhospDays = actualInhospDays;
  }

  public String getOperStaffCode(){
      return OperStaffCode;
}
  @XmlElement(name = "OPER_STAFF_CODE")
  public void setOperStaffCode(String operStaffCode) {
      this.OperStaffCode = operStaffCode;
  }

  public String getEmpiId(){
      return EmpiId;
}
  @XmlElement(name = "EMPI_ID")
  public void setEmpiId(String empiId) {
      this.EmpiId = empiId;
  }

  public String getOperDate(){
      return OperDate;
}
  @XmlElement(name = "OPER_DATE")
  public void setOperDate(String operDate) {
      this.OperDate = operDate;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "InhospIndexNo=" + InhospIndexNo +
              "InhospNo=" + InhospNo +
              "PatIndexNo=" + PatIndexNo +
              "InvoiceNo=" + InvoiceNo +
              "PatName=" + PatName +
              "CurrDeptCode=" + CurrDeptCode +
              "CurrWardCode=" + CurrWardCode +
              "MfsMethodCode=" + MfsMethodCode +
              "MfsMethodName=" + MfsMethodName +
              "MedicareCategCode=" + MedicareCategCode +
              "MedicareCategName=" + MedicareCategName +
              "MedicalTotalFee=" + MedicalTotalFee +
              "SelfExpenseFee=" + SelfExpenseFee +
              "SelfPaymentFee=" + SelfPaymentFee +
              "MedicarePayMoney=" + MedicarePayMoney +
              "SelfPayMoney=" + SelfPayMoney +
              "DiscountMoney=" + DiscountMoney +
              "ReliefMoney=" + ReliefMoney +
              "RoundingMoney=" + RoundingMoney +
              "ArrearageFlag=" + ArrearageFlag +
              "ArrearageMoney=" + ArrearageMoney +
              "ArrearageSettlementAuthorizer=" + ArrearageSettlementAuthorizer +
              "ActualInhospDays=" + ActualInhospDays +
              "OperStaffCode=" + OperStaffCode +
              "EmpiId=" + EmpiId +
              "OperDate=" + OperDate +
           '}';
  }
}