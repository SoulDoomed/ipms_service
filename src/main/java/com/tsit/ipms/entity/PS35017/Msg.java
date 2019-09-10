package com.tsit.ipms.entity.PS35017;

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

  private String  EmpiId;

  private String  ElectrRequisitionNo;

  private String  OrderNo;

  private String  OrderGroupNo;

  private String  ReportNo;

  private String  SampleNo;

  private String  ApplyDate;

  private String  TestPromptDate;

  private String  TestItemCode;

  private String  TestItemName;

  private String  TestPromptResultValue;

  private String  ReferenceRanges;

  private String  TestPromptReason;

  private String  TestPromptContent;

  private String  TestPromptExecutResult;

  private String  PromptDeptIndexNo;

  private String  PromptDeptCode;

  private String  PromptDeptName;

  private String  PromptDrIndexNo;

  private String  PromptDrCode;

  private String  PromptDrName;

  private String  PromptReceiveDeptIndexNo;

  private String  PromptReceiveDeptCode;

  private String  PromptReceiveDeptName;

  private String  PromptReceiveDrIndexNo;

  private String  PromptReceiveDrCode;

  private String  PromptReceiveDrName;

  private String  ClinicDiagCode;

  private String  ClinicDiagName;

  private String  RecordDate;

  private String  UpdateDate;

  private String  InvalidFlag;

  private String  CriticalFlag;

  private String  ReportTypeCode;

  private String  ReportTypeName;

  private String  BarCodeNo;

  private String  ReportDate;

  private String  ResultStatus;

  private String  PatIndexNo;

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

  public String getEmpiId(){
      return EmpiId;
}
  @XmlElement(name = "EMPI_ID")
  public void setEmpiId(String empiId) {
      this.EmpiId = empiId;
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

  public String getSampleNo(){
      return SampleNo;
}
  @XmlElement(name = "SAMPLE_NO")
  public void setSampleNo(String sampleNo) {
      this.SampleNo = sampleNo;
  }

  public String getApplyDate(){
      return ApplyDate;
}
  @XmlElement(name = "APPLY_DATE")
  public void setApplyDate(String applyDate) {
      this.ApplyDate = applyDate;
  }

  public String getTestPromptDate(){
      return TestPromptDate;
}
  @XmlElement(name = "TEST_PROMPT_DATE")
  public void setTestPromptDate(String testPromptDate) {
      this.TestPromptDate = testPromptDate;
  }

  public String getTestItemCode(){
      return TestItemCode;
}
  @XmlElement(name = "TEST_ITEM_CODE")
  public void setTestItemCode(String testItemCode) {
      this.TestItemCode = testItemCode;
  }

  public String getTestItemName(){
      return TestItemName;
}
  @XmlElement(name = "TEST_ITEM_NAME")
  public void setTestItemName(String testItemName) {
      this.TestItemName = testItemName;
  }

  public String getTestPromptResultValue(){
      return TestPromptResultValue;
}
  @XmlElement(name = "TEST_PROMPT_RESULT_VALUE")
  public void setTestPromptResultValue(String testPromptResultValue) {
      this.TestPromptResultValue = testPromptResultValue;
  }

  public String getReferenceRanges(){
      return ReferenceRanges;
}
  @XmlElement(name = "REFERENCE_RANGES")
  public void setReferenceRanges(String referenceRanges) {
      this.ReferenceRanges = referenceRanges;
  }

  public String getTestPromptReason(){
      return TestPromptReason;
}
  @XmlElement(name = "TEST_PROMPT_REASON")
  public void setTestPromptReason(String testPromptReason) {
      this.TestPromptReason = testPromptReason;
  }

  public String getTestPromptContent(){
      return TestPromptContent;
}
  @XmlElement(name = "TEST_PROMPT_CONTENT")
  public void setTestPromptContent(String testPromptContent) {
      this.TestPromptContent = testPromptContent;
  }

  public String getTestPromptExecutResult(){
      return TestPromptExecutResult;
}
  @XmlElement(name = "TEST_PROMPT_EXECUT_RESULT")
  public void setTestPromptExecutResult(String testPromptExecutResult) {
      this.TestPromptExecutResult = testPromptExecutResult;
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

  public String getPromptReceiveDeptIndexNo(){
      return PromptReceiveDeptIndexNo;
}
  @XmlElement(name = "PROMPT_RECEIVE_DEPT_INDEX_NO")
  public void setPromptReceiveDeptIndexNo(String promptReceiveDeptIndexNo) {
      this.PromptReceiveDeptIndexNo = promptReceiveDeptIndexNo;
  }

  public String getPromptReceiveDeptCode(){
      return PromptReceiveDeptCode;
}
  @XmlElement(name = "PROMPT_RECEIVE_DEPT_CODE")
  public void setPromptReceiveDeptCode(String promptReceiveDeptCode) {
      this.PromptReceiveDeptCode = promptReceiveDeptCode;
  }

  public String getPromptReceiveDeptName(){
      return PromptReceiveDeptName;
}
  @XmlElement(name = "PROMPT_RECEIVE_DEPT_NAME")
  public void setPromptReceiveDeptName(String promptReceiveDeptName) {
      this.PromptReceiveDeptName = promptReceiveDeptName;
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

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }

  public String getCriticalFlag(){
      return CriticalFlag;
}
  @XmlElement(name = "CRITICAL_FLAG")
  public void setCriticalFlag(String criticalFlag) {
      this.CriticalFlag = criticalFlag;
  }

  public String getReportTypeCode(){
      return ReportTypeCode;
}
  @XmlElement(name = "REPORT_TYPE_CODE")
  public void setReportTypeCode(String reportTypeCode) {
      this.ReportTypeCode = reportTypeCode;
  }

  public String getReportTypeName(){
      return ReportTypeName;
}
  @XmlElement(name = "REPORT_TYPE_NAME")
  public void setReportTypeName(String reportTypeName) {
      this.ReportTypeName = reportTypeName;
  }

  public String getBarCodeNo(){
      return BarCodeNo;
}
  @XmlElement(name = "BAR_CODE_NO")
  public void setBarCodeNo(String barCodeNo) {
      this.BarCodeNo = barCodeNo;
  }

  public String getReportDate(){
      return ReportDate;
}
  @XmlElement(name = "REPORT_DATE")
  public void setReportDate(String reportDate) {
      this.ReportDate = reportDate;
  }

  public String getResultStatus(){
      return ResultStatus;
}
  @XmlElement(name = "RESULT_STATUS")
  public void setResultStatus(String resultStatus) {
      this.ResultStatus = resultStatus;
  }

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
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
              "EmpiId=" + EmpiId +
              "ElectrRequisitionNo=" + ElectrRequisitionNo +
              "OrderNo=" + OrderNo +
              "OrderGroupNo=" + OrderGroupNo +
              "ReportNo=" + ReportNo +
              "SampleNo=" + SampleNo +
              "ApplyDate=" + ApplyDate +
              "TestPromptDate=" + TestPromptDate +
              "TestItemCode=" + TestItemCode +
              "TestItemName=" + TestItemName +
              "TestPromptResultValue=" + TestPromptResultValue +
              "ReferenceRanges=" + ReferenceRanges +
              "TestPromptReason=" + TestPromptReason +
              "TestPromptContent=" + TestPromptContent +
              "TestPromptExecutResult=" + TestPromptExecutResult +
              "PromptDeptIndexNo=" + PromptDeptIndexNo +
              "PromptDeptCode=" + PromptDeptCode +
              "PromptDeptName=" + PromptDeptName +
              "PromptDrIndexNo=" + PromptDrIndexNo +
              "PromptDrCode=" + PromptDrCode +
              "PromptDrName=" + PromptDrName +
              "PromptReceiveDeptIndexNo=" + PromptReceiveDeptIndexNo +
              "PromptReceiveDeptCode=" + PromptReceiveDeptCode +
              "PromptReceiveDeptName=" + PromptReceiveDeptName +
              "PromptReceiveDrIndexNo=" + PromptReceiveDrIndexNo +
              "PromptReceiveDrCode=" + PromptReceiveDrCode +
              "PromptReceiveDrName=" + PromptReceiveDrName +
              "ClinicDiagCode=" + ClinicDiagCode +
              "ClinicDiagName=" + ClinicDiagName +
              "RecordDate=" + RecordDate +
              "UpdateDate=" + UpdateDate +
              "InvalidFlag=" + InvalidFlag +
              "CriticalFlag=" + CriticalFlag +
              "ReportTypeCode=" + ReportTypeCode +
              "ReportTypeName=" + ReportTypeName +
              "BarCodeNo=" + BarCodeNo +
              "ReportDate=" + ReportDate +
              "ResultStatus=" + ResultStatus +
              "PatIndexNo=" + PatIndexNo +
           '}';
  }
}