package com.tsit.ipms.entity.PS25010;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OuthospIndexNo;

  private String  VisitCardNo;

  private String  OuthospNo;

  private String  InhospIndexNo;

  private String  MrNo;

  private String  AnamnesisNo;

  private String  InhospNum;

  private String  InhospNo;

  private String  PatIndexNo;

  private String  ElectrRequisitionNo;

  private String  OrderNo;

  private String  OrderGroupNo;

  private String  ReportNo;

  private String  ApplyDate;

  private String  ExamPromptDate;

  private String  ExamItemCode;

  private String  ExamItemName;

  private String  ExamPromptReason;

  private String  ExamPromptContent;

  private String  ExamPromptExecutResult;

  private String  PromptDeptIndexNo;

  private String  PromptDeptCode;

  private String  PromptDeptName;

  private String  PromptDrIndexNo;

  private String  PromptDrCode;

  private String  PromptDrName;

  private String  PromptReceiveDrIndexNo;

  private String  PromptReceiveDrCode;

  private String  PromptReceiveDrName;

  private String  ClinicDiagCode;

  private String  ClinicDiagName;

  private String  RecordDate;

  private String  UpdateDate;

  private String  CriticalFlag;

  public String getOuthospIndexNo(){
      return OuthospIndexNo;
}
  @XmlElement(name = "OUTHOSP_INDEX_NO")
  public void setOuthospIndexNo(String outhospIndexNo) {
      this.OuthospIndexNo = outhospIndexNo;
  }

  public String getVisitCardNo(){
      return VisitCardNo;
}
  @XmlElement(name = "VISIT_CARD_NO")
  public void setVisitCardNo(String visitCardNo) {
      this.VisitCardNo = visitCardNo;
  }

  public String getOuthospNo(){
      return OuthospNo;
}
  @XmlElement(name = "OUTHOSP_NO")
  public void setOuthospNo(String outhospNo) {
      this.OuthospNo = outhospNo;
  }

  public String getInhospIndexNo(){
      return InhospIndexNo;
}
  @XmlElement(name = "INHOSP_INDEX_NO")
  public void setInhospIndexNo(String inhospIndexNo) {
      this.InhospIndexNo = inhospIndexNo;
  }

  public String getMrNo(){
      return MrNo;
}
  @XmlElement(name = "MR_NO")
  public void setMrNo(String mrNo) {
      this.MrNo = mrNo;
  }

  public String getAnamnesisNo(){
      return AnamnesisNo;
}
  @XmlElement(name = "ANAMNESIS_NO")
  public void setAnamnesisNo(String anamnesisNo) {
      this.AnamnesisNo = anamnesisNo;
  }

  public String getInhospNum(){
      return InhospNum;
}
  @XmlElement(name = "INHOSP_NUM")
  public void setInhospNum(String inhospNum) {
      this.InhospNum = inhospNum;
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

  public String getOrderGroupNo(){
      return OrderGroupNo;
}
  @XmlElement(name = "ORDER_GROUP_NO")
  public void setOrderGroupNo(String orderGroupNo) {
      this.OrderGroupNo = orderGroupNo;
  }

  public String getReportNo(){
      return ReportNo;
}
  @XmlElement(name = "REPORT_NO")
  public void setReportNo(String reportNo) {
      this.ReportNo = reportNo;
  }

  public String getApplyDate(){
      return ApplyDate;
}
  @XmlElement(name = "APPLY_DATE")
  public void setApplyDate(String applyDate) {
      this.ApplyDate = applyDate;
  }

  public String getExamPromptDate(){
      return ExamPromptDate;
}
  @XmlElement(name = "EXAM_PROMPT_DATE")
  public void setExamPromptDate(String examPromptDate) {
      this.ExamPromptDate = examPromptDate;
  }

  public String getExamItemCode(){
      return ExamItemCode;
}
  @XmlElement(name = "EXAM_ITEM_CODE")
  public void setExamItemCode(String examItemCode) {
      this.ExamItemCode = examItemCode;
  }

  public String getExamItemName(){
      return ExamItemName;
}
  @XmlElement(name = "EXAM_ITEM_NAME")
  public void setExamItemName(String examItemName) {
      this.ExamItemName = examItemName;
  }

  public String getExamPromptReason(){
      return ExamPromptReason;
}
  @XmlElement(name = "EXAM_PROMPT_REASON")
  public void setExamPromptReason(String examPromptReason) {
      this.ExamPromptReason = examPromptReason;
  }

  public String getExamPromptContent(){
      return ExamPromptContent;
}
  @XmlElement(name = "EXAM_PROMPT_CONTENT")
  public void setExamPromptContent(String examPromptContent) {
      this.ExamPromptContent = examPromptContent;
  }

  public String getExamPromptExecutResult(){
      return ExamPromptExecutResult;
}
  @XmlElement(name = "EXAM_PROMPT_EXECUT_RESULT")
  public void setExamPromptExecutResult(String examPromptExecutResult) {
      this.ExamPromptExecutResult = examPromptExecutResult;
  }

  public String getPromptDeptIndexNo(){
      return PromptDeptIndexNo;
}
  @XmlElement(name = "PROMPT_DEPT_INDEX_NO")
  public void setPromptDeptIndexNo(String promptDeptIndexNo) {
      this.PromptDeptIndexNo = promptDeptIndexNo;
  }

  public String getPromptDeptCode(){
      return PromptDeptCode;
}
  @XmlElement(name = "PROMPT_DEPT_CODE")
  public void setPromptDeptCode(String promptDeptCode) {
      this.PromptDeptCode = promptDeptCode;
  }

  public String getPromptDeptName(){
      return PromptDeptName;
}
  @XmlElement(name = "PROMPT_DEPT_NAME")
  public void setPromptDeptName(String promptDeptName) {
      this.PromptDeptName = promptDeptName;
  }

  public String getPromptDrIndexNo(){
      return PromptDrIndexNo;
}
  @XmlElement(name = "PROMPT_DR_INDEX_NO")
  public void setPromptDrIndexNo(String promptDrIndexNo) {
      this.PromptDrIndexNo = promptDrIndexNo;
  }

  public String getPromptDrCode(){
      return PromptDrCode;
}
  @XmlElement(name = "PROMPT_DR_CODE")
  public void setPromptDrCode(String promptDrCode) {
      this.PromptDrCode = promptDrCode;
  }

  public String getPromptDrName(){
      return PromptDrName;
}
  @XmlElement(name = "PROMPT_DR_NAME")
  public void setPromptDrName(String promptDrName) {
      this.PromptDrName = promptDrName;
  }

  public String getPromptReceiveDrIndexNo(){
      return PromptReceiveDrIndexNo;
}
  @XmlElement(name = "PROMPT_RECEIVE_DR_INDEX_NO")
  public void setPromptReceiveDrIndexNo(String promptReceiveDrIndexNo) {
      this.PromptReceiveDrIndexNo = promptReceiveDrIndexNo;
  }

  public String getPromptReceiveDrCode(){
      return PromptReceiveDrCode;
}
  @XmlElement(name = "PROMPT_RECEIVE_DR_CODE")
  public void setPromptReceiveDrCode(String promptReceiveDrCode) {
      this.PromptReceiveDrCode = promptReceiveDrCode;
  }

  public String getPromptReceiveDrName(){
      return PromptReceiveDrName;
}
  @XmlElement(name = "PROMPT_RECEIVE_DR_NAME")
  public void setPromptReceiveDrName(String promptReceiveDrName) {
      this.PromptReceiveDrName = promptReceiveDrName;
  }

  public String getClinicDiagCode(){
      return ClinicDiagCode;
}
  @XmlElement(name = "CLINIC_DIAG_CODE")
  public void setClinicDiagCode(String clinicDiagCode) {
      this.ClinicDiagCode = clinicDiagCode;
  }

  public String getClinicDiagName(){
      return ClinicDiagName;
}
  @XmlElement(name = "CLINIC_DIAG_NAME")
  public void setClinicDiagName(String clinicDiagName) {
      this.ClinicDiagName = clinicDiagName;
  }

  public String getRecordDate(){
      return RecordDate;
}
  @XmlElement(name = "RECORD_DATE")
  public void setRecordDate(String recordDate) {
      this.RecordDate = recordDate;
  }

  public String getUpdateDate(){
      return UpdateDate;
}
  @XmlElement(name = "UPDATE_DATE")
  public void setUpdateDate(String updateDate) {
      this.UpdateDate = updateDate;
  }

  public String getCriticalFlag(){
      return CriticalFlag;
}
  @XmlElement(name = "CRITICAL_FLAG")
  public void setCriticalFlag(String criticalFlag) {
      this.CriticalFlag = criticalFlag;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "OuthospIndexNo=" + OuthospIndexNo +
              "VisitCardNo=" + VisitCardNo +
              "OuthospNo=" + OuthospNo +
              "InhospIndexNo=" + InhospIndexNo +
              "MrNo=" + MrNo +
              "AnamnesisNo=" + AnamnesisNo +
              "InhospNum=" + InhospNum +
              "InhospNo=" + InhospNo +
              "PatIndexNo=" + PatIndexNo +
              "ElectrRequisitionNo=" + ElectrRequisitionNo +
              "OrderNo=" + OrderNo +
              "OrderGroupNo=" + OrderGroupNo +
              "ReportNo=" + ReportNo +
              "ApplyDate=" + ApplyDate +
              "ExamPromptDate=" + ExamPromptDate +
              "ExamItemCode=" + ExamItemCode +
              "ExamItemName=" + ExamItemName +
              "ExamPromptReason=" + ExamPromptReason +
              "ExamPromptContent=" + ExamPromptContent +
              "ExamPromptExecutResult=" + ExamPromptExecutResult +
              "PromptDeptIndexNo=" + PromptDeptIndexNo +
              "PromptDeptCode=" + PromptDeptCode +
              "PromptDeptName=" + PromptDeptName +
              "PromptDrIndexNo=" + PromptDrIndexNo +
              "PromptDrCode=" + PromptDrCode +
              "PromptDrName=" + PromptDrName +
              "PromptReceiveDrIndexNo=" + PromptReceiveDrIndexNo +
              "PromptReceiveDrCode=" + PromptReceiveDrCode +
              "PromptReceiveDrName=" + PromptReceiveDrName +
              "ClinicDiagCode=" + ClinicDiagCode +
              "ClinicDiagName=" + ClinicDiagName +
              "RecordDate=" + RecordDate +
              "UpdateDate=" + UpdateDate +
              "CriticalFlag=" + CriticalFlag +
           '}';
  }
}