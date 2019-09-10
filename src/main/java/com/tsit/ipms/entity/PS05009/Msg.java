package com.tsit.ipms.entity.PS05009;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OperDate;

  private String  OperStatus;

  private String  OperStaffIndexNo;

  private String  OperStaffCode;

  private String  OperStaffName;

  private String  DispenDeptIndexNo;

  private String  DispenDeptCode;

  private String  DispenDeptName;

  private String  ReturnWardCode;

  private String  ReturnWardName;

  private String  OrderReturnStorageNo;

  private String  BackReason;

  private String  PatIndexNo;

  private String  InhospNo;

  private String  PatName;

  private String  EmpiId;

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

  public String getOperStaffIndexNo(){
      return OperStaffIndexNo;
}
  @XmlElement(name = "OPER_STAFF_INDEX_NO")
  public void setOperStaffIndexNo(String operStaffIndexNo) {
      this.OperStaffIndexNo = operStaffIndexNo;
  }

  public String getOperStaffCode(){
      return OperStaffCode;
}
  @XmlElement(name = "OPER_STAFF_CODE")
  public void setOperStaffCode(String operStaffCode) {
      this.OperStaffCode = operStaffCode;
  }

  public String getOperStaffName(){
      return OperStaffName;
}
  @XmlElement(name = "OPER_STAFF_NAME")
  public void setOperStaffName(String operStaffName) {
      this.OperStaffName = operStaffName;
  }

  public String getDispenDeptIndexNo(){
      return DispenDeptIndexNo;
}
  @XmlElement(name = "DISPEN_DEPT_INDEX_NO")
  public void setDispenDeptIndexNo(String dispenDeptIndexNo) {
      this.DispenDeptIndexNo = dispenDeptIndexNo;
  }

  public String getDispenDeptCode(){
      return DispenDeptCode;
}
  @XmlElement(name = "DISPEN_DEPT_CODE")
  public void setDispenDeptCode(String dispenDeptCode) {
      this.DispenDeptCode = dispenDeptCode;
  }

  public String getDispenDeptName(){
      return DispenDeptName;
}
  @XmlElement(name = "DISPEN_DEPT_NAME")
  public void setDispenDeptName(String dispenDeptName) {
      this.DispenDeptName = dispenDeptName;
  }

  public String getReturnWardCode(){
      return ReturnWardCode;
}
  @XmlElement(name = "RETURN_WARD_CODE")
  public void setReturnWardCode(String returnWardCode) {
      this.ReturnWardCode = returnWardCode;
  }

  public String getReturnWardName(){
      return ReturnWardName;
}
  @XmlElement(name = "RETURN_WARD_NAME")
  public void setReturnWardName(String returnWardName) {
      this.ReturnWardName = returnWardName;
  }

  public String getOrderReturnStorageNo(){
      return OrderReturnStorageNo;
}
  @XmlElement(name = "ORDER_RETURN_STORAGE_NO")
  public void setOrderReturnStorageNo(String orderReturnStorageNo) {
      this.OrderReturnStorageNo = orderReturnStorageNo;
  }

  public String getBackReason(){
      return BackReason;
}
  @XmlElement(name = "BACK_REASON")
  public void setBackReason(String backReason) {
      this.BackReason = backReason;
  }

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getInhospNo(){
      return InhospNo;
}
  @XmlElement(name = "INHOSP_NO")
  public void setInhospNo(String inhospNo) {
      this.InhospNo = inhospNo;
  }

  public String getPatName(){
      return PatName;
}
  @XmlElement(name = "PAT_NAME")
  public void setPatName(String patName) {
      this.PatName = patName;
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
              "OperDate=" + OperDate +
              "OperStatus=" + OperStatus +
              "OperStaffIndexNo=" + OperStaffIndexNo +
              "OperStaffCode=" + OperStaffCode +
              "OperStaffName=" + OperStaffName +
              "DispenDeptIndexNo=" + DispenDeptIndexNo +
              "DispenDeptCode=" + DispenDeptCode +
              "DispenDeptName=" + DispenDeptName +
              "ReturnWardCode=" + ReturnWardCode +
              "ReturnWardName=" + ReturnWardName +
              "OrderReturnStorageNo=" + OrderReturnStorageNo +
              "BackReason=" + BackReason +
              "PatIndexNo=" + PatIndexNo +
              "InhospNo=" + InhospNo +
              "PatName=" + PatName +
              "EmpiId=" + EmpiId +
           '}';
  }
}