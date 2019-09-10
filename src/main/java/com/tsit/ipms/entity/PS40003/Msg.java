package com.tsit.ipms.entity.PS40003;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  InhospNum;

  private String  PatIndexNo;

  private String  PatNo;

  private String  SignsRecordNo;

  private String  TEMPERATURE;

  private String  SystolicPressure;

  private String  DiastolicPressure;

  private String  BreathingRate;

  private String  PulseRate;

  private String  WEIGHT;

  private String  SignsInforStatus;

  private String  MeasureDate;

  private String  InvalidFlag;

  public String getInhospNum(){
      return InhospNum;
}
  @XmlElement(name = "INHOSP_NUM")
  public void setInhospNum(String inhospNum) {
      this.InhospNum = inhospNum;
  }

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getPatNo(){
      return PatNo;
}
  @XmlElement(name = "PAT_NO")
  public void setPatNo(String patNo) {
      this.PatNo = patNo;
  }

  public String getSignsRecordNo(){
      return SignsRecordNo;
}
  @XmlElement(name = "SIGNS_RECORD_NO")
  public void setSignsRecordNo(String signsRecordNo) {
      this.SignsRecordNo = signsRecordNo;
  }

  public String getTEMPERATURE(){
      return TEMPERATURE;
}
  @XmlElement(name = "TEMPERATURE")
  public void setTEMPERATURE(String tEMPERATURE) {
      this.TEMPERATURE = tEMPERATURE;
  }

  public String getSystolicPressure(){
      return SystolicPressure;
}
  @XmlElement(name = "SYSTOLIC_PRESSURE")
  public void setSystolicPressure(String systolicPressure) {
      this.SystolicPressure = systolicPressure;
  }

  public String getDiastolicPressure(){
      return DiastolicPressure;
}
  @XmlElement(name = "DIASTOLIC_PRESSURE")
  public void setDiastolicPressure(String diastolicPressure) {
      this.DiastolicPressure = diastolicPressure;
  }

  public String getBreathingRate(){
      return BreathingRate;
}
  @XmlElement(name = "BREATHING_RATE")
  public void setBreathingRate(String breathingRate) {
      this.BreathingRate = breathingRate;
  }

  public String getPulseRate(){
      return PulseRate;
}
  @XmlElement(name = "PULSE_RATE")
  public void setPulseRate(String pulseRate) {
      this.PulseRate = pulseRate;
  }

  public String getWEIGHT(){
      return WEIGHT;
}
  @XmlElement(name = "WEIGHT")
  public void setWEIGHT(String wEIGHT) {
      this.WEIGHT = wEIGHT;
  }

  public String getSignsInforStatus(){
      return SignsInforStatus;
}
  @XmlElement(name = "SIGNS_INFOR_STATUS")
  public void setSignsInforStatus(String signsInforStatus) {
      this.SignsInforStatus = signsInforStatus;
  }

  public String getMeasureDate(){
      return MeasureDate;
}
  @XmlElement(name = "MEASURE_DATE")
  public void setMeasureDate(String measureDate) {
      this.MeasureDate = measureDate;
  }

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "InhospNum=" + InhospNum +
              "PatIndexNo=" + PatIndexNo +
              "PatNo=" + PatNo +
              "SignsRecordNo=" + SignsRecordNo +
              "TEMPERATURE=" + TEMPERATURE +
              "SystolicPressure=" + SystolicPressure +
              "DiastolicPressure=" + DiastolicPressure +
              "BreathingRate=" + BreathingRate +
              "PulseRate=" + PulseRate +
              "WEIGHT=" + WEIGHT +
              "SignsInforStatus=" + SignsInforStatus +
              "MeasureDate=" + MeasureDate +
              "InvalidFlag=" + InvalidFlag +
           '}';
  }
}