package com.tsit.ipms.entity.PS02055;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  DiagIndexNo;

  private String  DiagCode;

  private String  DiagName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  CcdtCode;

  private String  CcdtName;

  private String  ProvinceDiagCode;

  private String  ProvinceDiagName;

  private String  CountryCode;

  private String  CountryName;

  private String  NOTE;

  private String  InvalidFlag;

  private String  InvalidFlagName;

  private String  MorphologyFlag;

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

  public String getDiagIndexNo(){
      return DiagIndexNo;
}
  @XmlElement(name = "DIAG_INDEX_NO")
  public void setDiagIndexNo(String diagIndexNo) {
      this.DiagIndexNo = diagIndexNo;
  }

  public String getDiagCode(){
      return DiagCode;
}
  @XmlElement(name = "DIAG_CODE")
  public void setDiagCode(String diagCode) {
      this.DiagCode = diagCode;
  }

  public String getDiagName(){
      return DiagName;
}
  @XmlElement(name = "DIAG_NAME")
  public void setDiagName(String diagName) {
      this.DiagName = diagName;
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

  public String getCcdtCode(){
      return CcdtCode;
}
  @XmlElement(name = "CCDT_CODE")
  public void setCcdtCode(String ccdtCode) {
      this.CcdtCode = ccdtCode;
  }

  public String getCcdtName(){
      return CcdtName;
}
  @XmlElement(name = "CCDT_NAME")
  public void setCcdtName(String ccdtName) {
      this.CcdtName = ccdtName;
  }

  public String getProvinceDiagCode(){
      return ProvinceDiagCode;
}
  @XmlElement(name = "PROVINCE_DIAG_CODE")
  public void setProvinceDiagCode(String provinceDiagCode) {
      this.ProvinceDiagCode = provinceDiagCode;
  }

  public String getProvinceDiagName(){
      return ProvinceDiagName;
}
  @XmlElement(name = "PROVINCE_DIAG_NAME")
  public void setProvinceDiagName(String provinceDiagName) {
      this.ProvinceDiagName = provinceDiagName;
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

  public String getMorphologyFlag(){
      return MorphologyFlag;
}
  @XmlElement(name = "MORPHOLOGY_FLAG")
  public void setMorphologyFlag(String morphologyFlag) {
      this.MorphologyFlag = morphologyFlag;
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
              "DiagIndexNo=" + DiagIndexNo +
              "DiagCode=" + DiagCode +
              "DiagName=" + DiagName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "CcdtCode=" + CcdtCode +
              "CcdtName=" + CcdtName +
              "ProvinceDiagCode=" + ProvinceDiagCode +
              "ProvinceDiagName=" + ProvinceDiagName +
              "CountryCode=" + CountryCode +
              "CountryName=" + CountryName +
              "NOTE=" + NOTE +
              "InvalidFlag=" + InvalidFlag +
              "InvalidFlagName=" + InvalidFlagName +
              "MorphologyFlag=" + MorphologyFlag +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}