package com.tsit.ipms.entity.PS15010;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  VisitCardNo;

  private String  InhospNo;

  private String  PatIndexNo;

  private String  ReceiptNo;

  private String  DealNo;

  private String  InvoiceNo;

  private String  ProspectivePayment;

  private String  OperStatus;

  private String  OiFlag;

  private String  RedemptionDealNo;

  private String  PayMethodCode;

  private String  PayDescr;

  private String  OperStaffCode;

  private String  RecordDate;

  private String  EmpiId;

  public String getVisitCardNo(){
      return VisitCardNo;
}
  @XmlElement(name = "VISIT_CARD_NO")
  public void setVisitCardNo(String visitCardNo) {
      this.VisitCardNo = visitCardNo;
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

  public String getReceiptNo(){
      return ReceiptNo;
}
  @XmlElement(name = "RECEIPT_NO")
  public void setReceiptNo(String receiptNo) {
      this.ReceiptNo = receiptNo;
  }

  public String getDealNo(){
      return DealNo;
}
  @XmlElement(name = "DEAL_NO")
  public void setDealNo(String dealNo) {
      this.DealNo = dealNo;
  }

  public String getInvoiceNo(){
      return InvoiceNo;
}
  @XmlElement(name = "INVOICE_NO")
  public void setInvoiceNo(String invoiceNo) {
      this.InvoiceNo = invoiceNo;
  }

  public String getProspectivePayment(){
      return ProspectivePayment;
}
  @XmlElement(name = "PROSPECTIVE_PAYMENT")
  public void setProspectivePayment(String prospectivePayment) {
      this.ProspectivePayment = prospectivePayment;
  }

  public String getOperStatus(){
      return OperStatus;
}
  @XmlElement(name = "OPER_STATUS")
  public void setOperStatus(String operStatus) {
      this.OperStatus = operStatus;
  }

  public String getOiFlag(){
      return OiFlag;
}
  @XmlElement(name = "OI_FLAG")
  public void setOiFlag(String oiFlag) {
      this.OiFlag = oiFlag;
  }

  public String getRedemptionDealNo(){
      return RedemptionDealNo;
}
  @XmlElement(name = "REDEMPTION_DEAL_NO")
  public void setRedemptionDealNo(String redemptionDealNo) {
      this.RedemptionDealNo = redemptionDealNo;
  }

  public String getPayMethodCode(){
      return PayMethodCode;
}
  @XmlElement(name = "PAY_METHOD_CODE")
  public void setPayMethodCode(String payMethodCode) {
      this.PayMethodCode = payMethodCode;
  }

  public String getPayDescr(){
      return PayDescr;
}
  @XmlElement(name = "PAY_DESCR")
  public void setPayDescr(String payDescr) {
      this.PayDescr = payDescr;
  }

  public String getOperStaffCode(){
      return OperStaffCode;
}
  @XmlElement(name = "OPER_STAFF_CODE")
  public void setOperStaffCode(String operStaffCode) {
      this.OperStaffCode = operStaffCode;
  }

  public String getRecordDate(){
      return RecordDate;
}
  @XmlElement(name = "RECORD_DATE")
  public void setRecordDate(String recordDate) {
      this.RecordDate = recordDate;
  }

  public String getEmpiId(){
      return EmpiId;
}
  @XmlElement(name = "EMPI_ID")
  public void setEmpiId(String empiId) {
      this.EmpiId = empiId;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "VisitCardNo=" + VisitCardNo +
              "InhospNo=" + InhospNo +
              "PatIndexNo=" + PatIndexNo +
              "ReceiptNo=" + ReceiptNo +
              "DealNo=" + DealNo +
              "InvoiceNo=" + InvoiceNo +
              "ProspectivePayment=" + ProspectivePayment +
              "OperStatus=" + OperStatus +
              "OiFlag=" + OiFlag +
              "RedemptionDealNo=" + RedemptionDealNo +
              "PayMethodCode=" + PayMethodCode +
              "PayDescr=" + PayDescr +
              "OperStaffCode=" + OperStaffCode +
              "RecordDate=" + RecordDate +
              "EmpiId=" + EmpiId +
           '}';
  }
}