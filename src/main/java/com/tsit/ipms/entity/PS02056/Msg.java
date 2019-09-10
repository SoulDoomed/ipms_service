package com.tsit.ipms.entity.PS02056;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  SurgeryOperIndexNo;

  private String  SurgeryOperCode;

  private String  SurgeryOperName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  CchiCode;

  private String  CchiName;

  private String  CountryCode;

  private String  CountryName;

  private String  SurgeryClassCode;

  private String  SurgeryClassName;

  private String  NOTE;

  private String  InvalidFlag;

  private String  InvalidFlagName;

  private String  VersionNumber;

  public String getCreateUser(){
      return CreateUser;
}
  @XmlElement(name = "CREATE_USER")
  public void setCreateUser(String createUser) {
      this.CreateUser = createUser;
  }

  public String getCreateTime(){
      return CreateTime;
}
  @XmlElement(name = "CREATE_TIME")
  public void setCreateTime(String createTime) {
      this.CreateTime = createTime;
  }

  public String getUpdateUser(){
      return UpdateUser;
}
  @XmlElement(name = "UPDATE_USER")
  public void setUpdateUser(String updateUser) {
      this.UpdateUser = updateUser;
  }

  public String getUpdateTime(){
      return UpdateTime;
}
  @XmlElement(name = "UPDATE_TIME")
  public void setUpdateTime(String updateTime) {
      this.UpdateTime = updateTime;
  }

  public String getSurgeryOperIndexNo(){
      return SurgeryOperIndexNo;
}
  @XmlElement(name = "SURGERY_OPER_INDEX_NO")
  public void setSurgeryOperIndexNo(String surgeryOperIndexNo) {
      this.SurgeryOperIndexNo = surgeryOperIndexNo;
  }

  public String getSurgeryOperCode(){
      return SurgeryOperCode;
}
  @XmlElement(name = "SURGERY_OPER_CODE")
  public void setSurgeryOperCode(String surgeryOperCode) {
      this.SurgeryOperCode = surgeryOperCode;
  }

  public String getSurgeryOperName(){
      return SurgeryOperName;
}
  @XmlElement(name = "SURGERY_OPER_NAME")
  public void setSurgeryOperName(String surgeryOperName) {
      this.SurgeryOperName = surgeryOperName;
  }

  public String getPinyinCode(){
      return PinyinCode;
}
  @XmlElement(name = "PINYIN_CODE")
  public void setPinyinCode(String pinyinCode) {
      this.PinyinCode = pinyinCode;
  }

  public String getWubiCode(){
      return WubiCode;
}
  @XmlElement(name = "WUBI_CODE")
  public void setWubiCode(String wubiCode) {
      this.WubiCode = wubiCode;
  }

  public String getCchiCode(){
      return CchiCode;
}
  @XmlElement(name = "CCHI_CODE")
  public void setCchiCode(String cchiCode) {
      this.CchiCode = cchiCode;
  }

  public String getCchiName(){
      return CchiName;
}
  @XmlElement(name = "CCHI_NAME")
  public void setCchiName(String cchiName) {
      this.CchiName = cchiName;
  }

  public String getCountryCode(){
      return CountryCode;
}
  @XmlElement(name = "COUNTRY_CODE")
  public void setCountryCode(String countryCode) {
      this.CountryCode = countryCode;
  }

  public String getCountryName(){
      return CountryName;
}
  @XmlElement(name = "COUNTRY_NAME")
  public void setCountryName(String countryName) {
      this.CountryName = countryName;
  }

  public String getSurgeryClassCode(){
      return SurgeryClassCode;
}
  @XmlElement(name = "SURGERY_CLASS_CODE")
  public void setSurgeryClassCode(String surgeryClassCode) {
      this.SurgeryClassCode = surgeryClassCode;
  }

  public String getSurgeryClassName(){
      return SurgeryClassName;
}
  @XmlElement(name = "SURGERY_CLASS_NAME")
  public void setSurgeryClassName(String surgeryClassName) {
      this.SurgeryClassName = surgeryClassName;
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

  public String getInvalidFlagName(){
      return InvalidFlagName;
}
  @XmlElement(name = "INVALID_FLAG_NAME")
  public void setInvalidFlagName(String invalidFlagName) {
      this.InvalidFlagName = invalidFlagName;
  }

  public String getVersionNumber(){
      return VersionNumber;
}
  @XmlElement(name = "VERSION_NUMBER")
  public void setVersionNumber(String versionNumber) {
      this.VersionNumber = versionNumber;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "CreateUser=" + CreateUser +
              "CreateTime=" + CreateTime +
              "UpdateUser=" + UpdateUser +
              "UpdateTime=" + UpdateTime +
              "SurgeryOperIndexNo=" + SurgeryOperIndexNo +
              "SurgeryOperCode=" + SurgeryOperCode +
              "SurgeryOperName=" + SurgeryOperName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "CchiCode=" + CchiCode +
              "CchiName=" + CchiName +
              "CountryCode=" + CountryCode +
              "CountryName=" + CountryName +
              "SurgeryClassCode=" + SurgeryClassCode +
              "SurgeryClassName=" + SurgeryClassName +
              "NOTE=" + NOTE +
              "InvalidFlag=" + InvalidFlag +
              "InvalidFlagName=" + InvalidFlagName +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}