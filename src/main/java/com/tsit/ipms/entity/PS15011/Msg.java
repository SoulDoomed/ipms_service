package com.tsit.ipms.entity.PS15011;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  InhospIndexNo;

  private String  InhospNo;

  private String  PatIndexNo;

  private String  OperDate;

  private String  OperStaffCode;

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

  public String getOperDate(){
      return OperDate;
}
  @XmlElement(name = "OPER_DATE")
  public void setOperDate(String operDate) {
      this.OperDate = operDate;
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




  @Override
  public String toString() {
      return "MsgDetail{" +
              "InhospIndexNo=" + InhospIndexNo +
              "InhospNo=" + InhospNo +
              "PatIndexNo=" + PatIndexNo +
              "OperDate=" + OperDate +
              "OperStaffCode=" + OperStaffCode +
              "EmpiId=" + EmpiId +
           '}';
  }
}