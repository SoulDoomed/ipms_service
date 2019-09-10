package com.tsit.ipms.entity.PS15009;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OuthospNo;

  private String  PatIndexNo;

  private String  DealNo;

  private String  OperStaffCode;

  private String  OperDate;

  private String  OperStatus;

  private String  InvoiceNo;

  private String  ChargeWin;

  private String  OrigDealNo;

  public String getOuthospNo(){
      return OuthospNo;
}
  @XmlElement(name = "OUTHOSP_NO")
  public void setOuthospNo(String outhospNo) {
      this.OuthospNo = outhospNo;
  }

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getDealNo(){
      return DealNo;
}
  @XmlElement(name = "DEAL_NO")
  public void setDealNo(String dealNo) {
      this.DealNo = dealNo;
  }

  public String getOperStaffCode(){
      return OperStaffCode;
}
  @XmlElement(name = "OPER_STAFF_CODE")
  public void setOperStaffCode(String operStaffCode) {
      this.OperStaffCode = operStaffCode;
  }

  public String getOperDate(){
      return OperDate;
}
  @XmlElement(name = "OPER_DATE")
  public void setOperDate(String operDate) {
      this.OperDate = operDate;
  }

  public String getOperStatus(){
      return OperStatus;
}
  @XmlElement(name = "OPER_STATUS")
  public void setOperStatus(String operStatus) {
      this.OperStatus = operStatus;
  }

  public String getInvoiceNo(){
      return InvoiceNo;
}
  @XmlElement(name = "INVOICE_NO")
  public void setInvoiceNo(String invoiceNo) {
      this.InvoiceNo = invoiceNo;
  }

  public String getChargeWin(){
      return ChargeWin;
}
  @XmlElement(name = "CHARGE_WIN")
  public void setChargeWin(String chargeWin) {
      this.ChargeWin = chargeWin;
  }

  public String getOrigDealNo(){
      return OrigDealNo;
}
  @XmlElement(name = "ORIG_DEAL_NO")
  public void setOrigDealNo(String origDealNo) {
      this.OrigDealNo = origDealNo;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "OuthospNo=" + OuthospNo +
              "PatIndexNo=" + PatIndexNo +
              "DealNo=" + DealNo +
              "OperStaffCode=" + OperStaffCode +
              "OperDate=" + OperDate +
              "OperStatus=" + OperStatus +
              "InvoiceNo=" + InvoiceNo +
              "ChargeWin=" + ChargeWin +
              "OrigDealNo=" + OrigDealNo +
           '}';
  }
}