package com.tsit.ipms.entity.PS10021;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  InhospIndexNo;

  private String  InhospNo;

  private String  PatIndexNo;

  private String  PatInhospStatusCode;

  private String  OperStaffCode;

  private String  OperDate;

  private String  LastUpdateDate;

  private String  AdmitDeptCode;

  private String  AdmitWardCode;

  private String  EmpiId;

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

  public String getPatInhospStatusCode(){
      return PatInhospStatusCode;
}
  @XmlElement(name = "PAT_INHOSP_STATUS_CODE")
  public void setPatInhospStatusCode(String patInhospStatusCode) {
      this.PatInhospStatusCode = patInhospStatusCode;
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

  public String getLastUpdateDate(){
      return LastUpdateDate;
}
  @XmlElement(name = "LAST_UPDATE_DATE")
  public void setLastUpdateDate(String lastUpdateDate) {
      this.LastUpdateDate = lastUpdateDate;
  }

  public String getAdmitDeptCode(){
      return AdmitDeptCode;
}
  @XmlElement(name = "ADMIT_DEPT_CODE")
  public void setAdmitDeptCode(String admitDeptCode) {
      this.AdmitDeptCode = admitDeptCode;
  }

  public String getAdmitWardCode(){
      return AdmitWardCode;
}
  @XmlElement(name = "ADMIT_WARD_CODE")
  public void setAdmitWardCode(String admitWardCode) {
      this.AdmitWardCode = admitWardCode;
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
              "InhospIndexNo=" + InhospIndexNo +
              "InhospNo=" + InhospNo +
              "PatIndexNo=" + PatIndexNo +
              "PatInhospStatusCode=" + PatInhospStatusCode +
              "OperStaffCode=" + OperStaffCode +
              "OperDate=" + OperDate +
              "LastUpdateDate=" + LastUpdateDate +
              "AdmitDeptCode=" + AdmitDeptCode +
              "AdmitWardCode=" + AdmitWardCode +
              "EmpiId=" + EmpiId +
           '}';
  }
}