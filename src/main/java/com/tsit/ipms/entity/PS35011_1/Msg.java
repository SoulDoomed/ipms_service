package com.tsit.ipms.entity.PS35011_1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  ElectrRequisitionNo;

  private String  OrderNo;

  private String  ApplyDeptCode;

  private String  OperDate;

  private String  OperStaffIndexNo;

  private String  RequisitionStatus;

  private String  NOTE;

  private String  BarCodeNo;

  public String getElectrRequisitionNo(){
      return ElectrRequisitionNo;
}
  @XmlElement(name = "ELECTR_REQUISITION_NO")
  public void setElectrRequisitionNo(String electrRequisitionNo) {
      this.ElectrRequisitionNo = electrRequisitionNo;
  }

  public String getOrderNo(){
      return OrderNo;
}
  @XmlElement(name = "ORDER_NO")
  public void setOrderNo(String orderNo) {
      this.OrderNo = orderNo;
  }

  public String getApplyDeptCode(){
      return ApplyDeptCode;
}
  @XmlElement(name = "APPLY_DEPT_CODE")
  public void setApplyDeptCode(String applyDeptCode) {
      this.ApplyDeptCode = applyDeptCode;
  }

  public String getOperDate(){
      return OperDate;
}
  @XmlElement(name = "OPER_DATE")
  public void setOperDate(String operDate) {
      this.OperDate = operDate;
  }

  public String getOperStaffIndexNo(){
      return OperStaffIndexNo;
}
  @XmlElement(name = "OPER_STAFF_INDEX_NO")
  public void setOperStaffIndexNo(String operStaffIndexNo) {
      this.OperStaffIndexNo = operStaffIndexNo;
  }

  public String getRequisitionStatus(){
      return RequisitionStatus;
}
  @XmlElement(name = "REQUISITION_STATUS")
  public void setRequisitionStatus(String requisitionStatus) {
      this.RequisitionStatus = requisitionStatus;
  }

  public String getNOTE(){
      return NOTE;
}
  @XmlElement(name = "NOTE")
  public void setNOTE(String nOTE) {
      this.NOTE = nOTE;
  }

  public String getBarCodeNo(){
      return BarCodeNo;
}
  @XmlElement(name = "BAR_CODE_NO")
  public void setBarCodeNo(String barCodeNo) {
      this.BarCodeNo = barCodeNo;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "ElectrRequisitionNo=" + ElectrRequisitionNo +
              "OrderNo=" + OrderNo +
              "ApplyDeptCode=" + ApplyDeptCode +
              "OperDate=" + OperDate +
              "OperStaffIndexNo=" + OperStaffIndexNo +
              "RequisitionStatus=" + RequisitionStatus +
              "NOTE=" + NOTE +
              "BarCodeNo=" + BarCodeNo +
           '}';
  }
}