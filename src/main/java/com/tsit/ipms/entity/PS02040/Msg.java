package com.tsit.ipms.entity.PS02040;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  ItemId;

  private String  DoseFrequencyCode;

  private String  DoseFrequencyName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  NOTE;

  private String  InalidFlag;

  private String  InalidFlagName;

  private String  NationalStandardCode;

  private String  FrequencyChineseName;

  private String  FrequencyNum;

  private String  FrequencyInterval;

  private String  FrequencyIntervalUnit;

  private String  ExecutTime;

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

  public String getItemId(){
      return ItemId;
}
  @XmlElement(name = "ITEM_ID")
  public void setItemId(String itemId) {
      this.ItemId = itemId;
  }

  public String getDoseFrequencyCode(){
      return DoseFrequencyCode;
}
  @XmlElement(name = "DOSE_FREQUENCY_CODE")
  public void setDoseFrequencyCode(String doseFrequencyCode) {
      this.DoseFrequencyCode = doseFrequencyCode;
  }

  public String getDoseFrequencyName(){
      return DoseFrequencyName;
}
  @XmlElement(name = "DOSE_FREQUENCY_NAME")
  public void setDoseFrequencyName(String doseFrequencyName) {
      this.DoseFrequencyName = doseFrequencyName;
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

  public String getNOTE(){
      return NOTE;
}
  @XmlElement(name = "NOTE")
  public void setNOTE(String nOTE) {
      this.NOTE = nOTE;
  }

  public String getInalidFlag(){
      return InalidFlag;
}
  @XmlElement(name = "INALID_FLAG")
  public void setInalidFlag(String inalidFlag) {
      this.InalidFlag = inalidFlag;
  }

  public String getInalidFlagName(){
      return InalidFlagName;
}
  @XmlElement(name = "INALID_FLAG_NAME")
  public void setInalidFlagName(String inalidFlagName) {
      this.InalidFlagName = inalidFlagName;
  }

  public String getNationalStandardCode(){
      return NationalStandardCode;
}
  @XmlElement(name = "NATIONAL_STANDARD_CODE")
  public void setNationalStandardCode(String nationalStandardCode) {
      this.NationalStandardCode = nationalStandardCode;
  }

  public String getFrequencyChineseName(){
      return FrequencyChineseName;
}
  @XmlElement(name = "FREQUENCY_CHINESE_NAME")
  public void setFrequencyChineseName(String frequencyChineseName) {
      this.FrequencyChineseName = frequencyChineseName;
  }

  public String getFrequencyNum(){
      return FrequencyNum;
}
  @XmlElement(name = "FREQUENCY_NUM")
  public void setFrequencyNum(String frequencyNum) {
      this.FrequencyNum = frequencyNum;
  }

  public String getFrequencyInterval(){
      return FrequencyInterval;
}
  @XmlElement(name = "FREQUENCY_INTERVAL")
  public void setFrequencyInterval(String frequencyInterval) {
      this.FrequencyInterval = frequencyInterval;
  }

  public String getFrequencyIntervalUnit(){
      return FrequencyIntervalUnit;
}
  @XmlElement(name = "FREQUENCY_INTERVAL_UNIT")
  public void setFrequencyIntervalUnit(String frequencyIntervalUnit) {
      this.FrequencyIntervalUnit = frequencyIntervalUnit;
  }

  public String getExecutTime(){
      return ExecutTime;
}
  @XmlElement(name = "EXECUT_TIME")
  public void setExecutTime(String executTime) {
      this.ExecutTime = executTime;
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
              "ItemId=" + ItemId +
              "DoseFrequencyCode=" + DoseFrequencyCode +
              "DoseFrequencyName=" + DoseFrequencyName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "NOTE=" + NOTE +
              "InalidFlag=" + InalidFlag +
              "InalidFlagName=" + InalidFlagName +
              "NationalStandardCode=" + NationalStandardCode +
              "FrequencyChineseName=" + FrequencyChineseName +
              "FrequencyNum=" + FrequencyNum +
              "FrequencyInterval=" + FrequencyInterval +
              "FrequencyIntervalUnit=" + FrequencyIntervalUnit +
              "ExecutTime=" + ExecutTime +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}