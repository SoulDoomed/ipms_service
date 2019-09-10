package com.tsit.ipms.entity.PS40008;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  PatIndexNo;

  private String  InhospNo;

  private String  InhospNum;

  private String  PatName;

  private String  WardCode;

  private String  TestPoint;

  private String  DataRecordDate;

  private String  SignsCode;

  private String  SignsName;

  private String  BloodGlucoseNumerical;

  private String  BloodGlucoseString;

  private String  BloodGlucoseCateg;

  private String  SignsUnit;

  private String  NOTE;

  private String  RecordNurseCode;

  private String  RecordNurseName;

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

  public String getInhospNum(){
      return InhospNum;
}
  @XmlElement(name = "INHOSP_NUM")
  public void setInhospNum(String inhospNum) {
      this.InhospNum = inhospNum;
  }

  public String getPatName(){
      return PatName;
}
  @XmlElement(name = "PAT_NAME")
  public void setPatName(String patName) {
      this.PatName = patName;
  }

  public String getWardCode(){
      return WardCode;
}
  @XmlElement(name = "WARD_CODE")
  public void setWardCode(String wardCode) {
      this.WardCode = wardCode;
  }

  public String getTestPoint(){
      return TestPoint;
}
  @XmlElement(name = "TEST_POINT")
  public void setTestPoint(String testPoint) {
      this.TestPoint = testPoint;
  }

  public String getDataRecordDate(){
      return DataRecordDate;
}
  @XmlElement(name = "DATA_RECORD_DATE")
  public void setDataRecordDate(String dataRecordDate) {
      this.DataRecordDate = dataRecordDate;
  }

  public String getSignsCode(){
      return SignsCode;
}
  @XmlElement(name = "SIGNS_CODE")
  public void setSignsCode(String signsCode) {
      this.SignsCode = signsCode;
  }

  public String getSignsName(){
      return SignsName;
}
  @XmlElement(name = "SIGNS_NAME")
  public void setSignsName(String signsName) {
      this.SignsName = signsName;
  }

  public String getBloodGlucoseNumerical(){
      return BloodGlucoseNumerical;
}
  @XmlElement(name = "BLOOD_GLUCOSE_NUMERICAL")
  public void setBloodGlucoseNumerical(String bloodGlucoseNumerical) {
      this.BloodGlucoseNumerical = bloodGlucoseNumerical;
  }

  public String getBloodGlucoseString(){
      return BloodGlucoseString;
}
  @XmlElement(name = "BLOOD_GLUCOSE_STRING")
  public void setBloodGlucoseString(String bloodGlucoseString) {
      this.BloodGlucoseString = bloodGlucoseString;
  }

  public String getBloodGlucoseCateg(){
      return BloodGlucoseCateg;
}
  @XmlElement(name = "BLOOD_GLUCOSE_CATEG")
  public void setBloodGlucoseCateg(String bloodGlucoseCateg) {
      this.BloodGlucoseCateg = bloodGlucoseCateg;
  }

  public String getSignsUnit(){
      return SignsUnit;
}
  @XmlElement(name = "SIGNS_UNIT")
  public void setSignsUnit(String signsUnit) {
      this.SignsUnit = signsUnit;
  }

  public String getNOTE(){
      return NOTE;
}
  @XmlElement(name = "NOTE")
  public void setNOTE(String nOTE) {
      this.NOTE = nOTE;
  }

  public String getRecordNurseCode(){
      return RecordNurseCode;
}
  @XmlElement(name = "RECORD_NURSE_CODE")
  public void setRecordNurseCode(String recordNurseCode) {
      this.RecordNurseCode = recordNurseCode;
  }

  public String getRecordNurseName(){
      return RecordNurseName;
}
  @XmlElement(name = "RECORD_NURSE_NAME")
  public void setRecordNurseName(String recordNurseName) {
      this.RecordNurseName = recordNurseName;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "PatIndexNo=" + PatIndexNo +
              "InhospNo=" + InhospNo +
              "InhospNum=" + InhospNum +
              "PatName=" + PatName +
              "WardCode=" + WardCode +
              "TestPoint=" + TestPoint +
              "DataRecordDate=" + DataRecordDate +
              "SignsCode=" + SignsCode +
              "SignsName=" + SignsName +
              "BloodGlucoseNumerical=" + BloodGlucoseNumerical +
              "BloodGlucoseString=" + BloodGlucoseString +
              "BloodGlucoseCateg=" + BloodGlucoseCateg +
              "SignsUnit=" + SignsUnit +
              "NOTE=" + NOTE +
              "RecordNurseCode=" + RecordNurseCode +
              "RecordNurseName=" + RecordNurseName +
           '}';
  }
}