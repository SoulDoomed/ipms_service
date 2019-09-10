package com.tsit.ipms.entity.PS02040;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  DictCode;

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  FrequencyIndexNo;

  private String  FrequencyCode;

  private String  FrequencyName;

  private String  FrequencyExecutTimeName;

  private String  TS;

  private String  DAYS;

  private String  WEEKS;

  private String  MONTHS;

  private String  InvalidFlag;

  private String  InvalidFlagName;

  private String  VersionNumber;

  public String getDictCode(){
      return DictCode;
}
  @XmlElement(name = "DICT_CODE")
  public void setDictCode(String dictCode) {
      this.DictCode = dictCode;
  }

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

  public String getFrequencyIndexNo(){
      return FrequencyIndexNo;
}
  @XmlElement(name = "FREQUENCY_INDEX_NO")
  public void setFrequencyIndexNo(String frequencyIndexNo) {
      this.FrequencyIndexNo = frequencyIndexNo;
  }

  public String getFrequencyCode(){
      return FrequencyCode;
}
  @XmlElement(name = "FREQUENCY_CODE")
  public void setFrequencyCode(String frequencyCode) {
      this.FrequencyCode = frequencyCode;
  }

  public String getFrequencyName(){
      return FrequencyName;
}
  @XmlElement(name = "FREQUENCY_NAME")
  public void setFrequencyName(String frequencyName) {
      this.FrequencyName = frequencyName;
  }

  public String getFrequencyExecutTimeName(){
      return FrequencyExecutTimeName;
}
  @XmlElement(name = "FREQUENCY_EXECUT_TIME_NAME")
  public void setFrequencyExecutTimeName(String frequencyExecutTimeName) {
      this.FrequencyExecutTimeName = frequencyExecutTimeName;
  }

  public String getTS(){
      return TS;
}
  @XmlElement(name = "TS")
  public void setTS(String tS) {
      this.TS = tS;
  }

  public String getDAYS(){
      return DAYS;
}
  @XmlElement(name = "DAYS")
  public void setDAYS(String dAYS) {
      this.DAYS = dAYS;
  }

  public String getWEEKS(){
      return WEEKS;
}
  @XmlElement(name = "WEEKS")
  public void setWEEKS(String wEEKS) {
      this.WEEKS = wEEKS;
  }

  public String getMONTHS(){
      return MONTHS;
}
  @XmlElement(name = "MONTHS")
  public void setMONTHS(String mONTHS) {
      this.MONTHS = mONTHS;
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
              "DictCode=" + DictCode +
              "CreateUser=" + CreateUser +
              "CreateTime=" + CreateTime +
              "UpdateUser=" + UpdateUser +
              "UpdateTime=" + UpdateTime +
              "FrequencyIndexNo=" + FrequencyIndexNo +
              "FrequencyCode=" + FrequencyCode +
              "FrequencyName=" + FrequencyName +
              "FrequencyExecutTimeName=" + FrequencyExecutTimeName +
              "TS=" + TS +
              "DAYS=" + DAYS +
              "WEEKS=" + WEEKS +
              "MONTHS=" + MONTHS +
              "InvalidFlag=" + InvalidFlag +
              "InvalidFlagName=" + InvalidFlagName +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}