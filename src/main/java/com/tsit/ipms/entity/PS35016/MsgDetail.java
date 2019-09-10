package com.tsit.ipms.entity.PS35016;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  TestItemCode;

  private String  TestItemName;

  private String  TestItemEnglishName;

  private String  TestResultValue;

  private String  TestResultValueUnit;

  private String  ReferenceRanges;

  private String  NormalFlag;

  private String  SampleTypeCode;

  private String  SampleTypeName;

  private String  NOTE;

  private String  InvalidFlag;

  private String  TestItemSort;

  private String  MicrobeName;

  private String  BacterialColonyCount;

  private String  SmearResult;

  private String  MIC;

  private String  DIAMETER;

  private String  EquipmentCode;

  private String  EquipmentName;

  private String  AntibioticsName;

  private String  TestQualitativeResult;

  private String  ResultStatus;

  private String  CriticalValueFlag;

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

  public String getTestItemEnglishName(){
      return TestItemEnglishName;
}
  @XmlElement(name = "TEST_ITEM_ENGLISH_NAME")
  public void setTestItemEnglishName(String testItemEnglishName) {
      this.TestItemEnglishName = testItemEnglishName;
  }

  public String getTestResultValue(){
      return TestResultValue;
}
  @XmlElement(name = "TEST_RESULT_VALUE")
  public void setTestResultValue(String testResultValue) {
      this.TestResultValue = testResultValue;
  }

  public String getTestResultValueUnit(){
      return TestResultValueUnit;
}
  @XmlElement(name = "TEST_RESULT_VALUE_UNIT")
  public void setTestResultValueUnit(String testResultValueUnit) {
      this.TestResultValueUnit = testResultValueUnit;
  }

  public String getReferenceRanges(){
      return ReferenceRanges;
}
  @XmlElement(name = "REFERENCE_RANGES")
  public void setReferenceRanges(String referenceRanges) {
      this.ReferenceRanges = referenceRanges;
  }

  public String getNormalFlag(){
      return NormalFlag;
}
  @XmlElement(name = "NORMAL_FLAG")
  public void setNormalFlag(String normalFlag) {
      this.NormalFlag = normalFlag;
  }

  public String getSampleTypeCode(){
      return SampleTypeCode;
}
  @XmlElement(name = "SAMPLE_TYPE_CODE")
  public void setSampleTypeCode(String sampleTypeCode) {
      this.SampleTypeCode = sampleTypeCode;
  }

  public String getSampleTypeName(){
      return SampleTypeName;
}
  @XmlElement(name = "SAMPLE_TYPE_NAME")
  public void setSampleTypeName(String sampleTypeName) {
      this.SampleTypeName = sampleTypeName;
  }

  public String getNOTE(){
      return NOTE;
}
  @XmlElement(name = "NOTE")
  public void setNOTE(String nOTE) {
      this.NOTE = nOTE;
  }

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }

  public String getTestItemSort(){
      return TestItemSort;
}
  @XmlElement(name = "TEST_ITEM_SORT")
  public void setTestItemSort(String testItemSort) {
      this.TestItemSort = testItemSort;
  }

  public String getMicrobeName(){
      return MicrobeName;
}
  @XmlElement(name = "MICROBE_NAME")
  public void setMicrobeName(String microbeName) {
      this.MicrobeName = microbeName;
  }

  public String getBacterialColonyCount(){
      return BacterialColonyCount;
}
  @XmlElement(name = "BACTERIAL_COLONY_COUNT")
  public void setBacterialColonyCount(String bacterialColonyCount) {
      this.BacterialColonyCount = bacterialColonyCount;
  }

  public String getSmearResult(){
      return SmearResult;
}
  @XmlElement(name = "SMEAR_RESULT")
  public void setSmearResult(String smearResult) {
      this.SmearResult = smearResult;
  }

  public String getMIC(){
      return MIC;
}
  @XmlElement(name = "MIC")
  public void setMIC(String mIC) {
      this.MIC = mIC;
  }

  public String getDIAMETER(){
      return DIAMETER;
}
  @XmlElement(name = "DIAMETER")
  public void setDIAMETER(String dIAMETER) {
      this.DIAMETER = dIAMETER;
  }

  public String getEquipmentCode(){
      return EquipmentCode;
}
  @XmlElement(name = "EQUIPMENT_CODE")
  public void setEquipmentCode(String equipmentCode) {
      this.EquipmentCode = equipmentCode;
  }

  public String getEquipmentName(){
      return EquipmentName;
}
  @XmlElement(name = "EQUIPMENT_NAME")
  public void setEquipmentName(String equipmentName) {
      this.EquipmentName = equipmentName;
  }

  public String getAntibioticsName(){
      return AntibioticsName;
}
  @XmlElement(name = "ANTIBIOTICS_NAME")
  public void setAntibioticsName(String antibioticsName) {
      this.AntibioticsName = antibioticsName;
  }

  public String getTestQualitativeResult(){
      return TestQualitativeResult;
}
  @XmlElement(name = "TEST_QUALITATIVE_RESULT")
  public void setTestQualitativeResult(String testQualitativeResult) {
      this.TestQualitativeResult = testQualitativeResult;
  }

  public String getResultStatus(){
      return ResultStatus;
}
  @XmlElement(name = "RESULT_STATUS")
  public void setResultStatus(String resultStatus) {
      this.ResultStatus = resultStatus;
  }

  public String getCriticalValueFlag(){
      return CriticalValueFlag;
}
  @XmlElement(name = "CRITICAL_VALUE_FLAG")
  public void setCriticalValueFlag(String criticalValueFlag) {
      this.CriticalValueFlag = criticalValueFlag;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "TestItemCode=" + TestItemCode +
              "TestItemName=" + TestItemName +
              "TestItemEnglishName=" + TestItemEnglishName +
              "TestResultValue=" + TestResultValue +
              "TestResultValueUnit=" + TestResultValueUnit +
              "ReferenceRanges=" + ReferenceRanges +
              "NormalFlag=" + NormalFlag +
              "SampleTypeCode=" + SampleTypeCode +
              "SampleTypeName=" + SampleTypeName +
              "NOTE=" + NOTE +
              "InvalidFlag=" + InvalidFlag +
              "TestItemSort=" + TestItemSort +
              "MicrobeName=" + MicrobeName +
              "BacterialColonyCount=" + BacterialColonyCount +
              "SmearResult=" + SmearResult +
              "MIC=" + MIC +
              "DIAMETER=" + DIAMETER +
              "EquipmentCode=" + EquipmentCode +
              "EquipmentName=" + EquipmentName +
              "AntibioticsName=" + AntibioticsName +
              "TestQualitativeResult=" + TestQualitativeResult +
              "ResultStatus=" + ResultStatus +
              "CriticalValueFlag=" + CriticalValueFlag +
           '}';
  }
}