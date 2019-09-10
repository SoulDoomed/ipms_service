package com.tsit.ipms.entity.PS15031;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OuthospNo;

  private String  PatIndexNo;

  private String  OrigDealNo;

  private String  NewDealNo;

  private String  OrigInvoiceNo;

  private String  NewInvoiceNo;

  private String  InvoiceType;

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

  public String getOrigDealNo(){
      return OrigDealNo;
}
  @XmlElement(name = "ORIG_DEAL_NO")
  public void setOrigDealNo(String origDealNo) {
      this.OrigDealNo = origDealNo;
  }

  public String getNewDealNo(){
      return NewDealNo;
}
  @XmlElement(name = "NEW_DEAL_NO")
  public void setNewDealNo(String newDealNo) {
      this.NewDealNo = newDealNo;
  }

  public String getOrigInvoiceNo(){
      return OrigInvoiceNo;
}
  @XmlElement(name = "ORIG_INVOICE_NO")
  public void setOrigInvoiceNo(String origInvoiceNo) {
      this.OrigInvoiceNo = origInvoiceNo;
  }

  public String getNewInvoiceNo(){
      return NewInvoiceNo;
}
  @XmlElement(name = "NEW_INVOICE_NO")
  public void setNewInvoiceNo(String newInvoiceNo) {
      this.NewInvoiceNo = newInvoiceNo;
  }

  public String getInvoiceType(){
      return InvoiceType;
}
  @XmlElement(name = "INVOICE_TYPE")
  public void setInvoiceType(String invoiceType) {
      this.InvoiceType = invoiceType;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "OuthospNo=" + OuthospNo +
              "PatIndexNo=" + PatIndexNo +
              "OrigDealNo=" + OrigDealNo +
              "NewDealNo=" + NewDealNo +
              "OrigInvoiceNo=" + OrigInvoiceNo +
              "NewInvoiceNo=" + NewInvoiceNo +
              "InvoiceType=" + InvoiceType +
           '}';
  }
}