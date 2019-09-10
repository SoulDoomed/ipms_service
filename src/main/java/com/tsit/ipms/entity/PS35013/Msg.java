package com.tsit.ipms.entity.PS35013;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  ElectrRequisitionNo;

  private String  OperDate;

  private String  OperStaffIndexNo;

  private String  RequisitionStatus;

  private String  NOTE;

  private String  ExecutDeptCode;

  private String  PatTypeCode;

  public String getElectrRequisitionNo(){
      return ElectrRequisitionNo;
}
  @XmlElement(name = "ELECTR_REQUISITION_NO")
  public void setElectrRequisitionNo(String electrRequisitionNo) {
      this.ElectrRequisitionNo = electrRequisitionNo;
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

  public String getExecutDeptCode(){
      return ExecutDeptCode;
}
  @XmlElement(name = "EXECUT_DEPT_CODE")
  public void setExecutDeptCode(String executDeptCode) {
      this.ExecutDeptCode = executDeptCode;
  }

  public String getPatTypeCode(){
      return PatTypeCode;
}
  @XmlElement(name = "PAT_TYPE_CODE")
  public void setPatTypeCode(String patTypeCode) {
      this.PatTypeCode = patTypeCode;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "ElectrRequisitionNo=" + ElectrRequisitionNo +
              "OperDate=" + OperDate +
              "OperStaffIndexNo=" + OperStaffIndexNo +
              "RequisitionStatus=" + RequisitionStatus +
              "NOTE=" + NOTE +
              "ExecutDeptCode=" + ExecutDeptCode +
              "PatTypeCode=" + PatTypeCode +
           '}';
  }
}