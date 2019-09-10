package com.tsit.ipms.entity.PS02056;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  DictCode;

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  SurgeryOperIndexNo;

  private String  SurgeryOperCode;

  private String  SurgeryOperName;

  private String  ProvinceSurgeryOperCode;

  private String  ProvinceSurgeryOperName;

  private String  MainSurgeryFlag;

  private String  SurgeryCategCode;

  private String  SurgeryCategName;

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

  public String getProvinceSurgeryOperCode(){
      return ProvinceSurgeryOperCode;
}
  @XmlElement(name = "PROVINCE_SURGERY_OPER_CODE")
  public void setProvinceSurgeryOperCode(String provinceSurgeryOperCode) {
      this.ProvinceSurgeryOperCode = provinceSurgeryOperCode;
  }

  public String getProvinceSurgeryOperName(){
      return ProvinceSurgeryOperName;
}
  @XmlElement(name = "PROVINCE_SURGERY_OPER_NAME")
  public void setProvinceSurgeryOperName(String provinceSurgeryOperName) {
      this.ProvinceSurgeryOperName = provinceSurgeryOperName;
  }

  public String getMainSurgeryFlag(){
      return MainSurgeryFlag;
}
  @XmlElement(name = "MAIN_SURGERY_FLAG")
  public void setMainSurgeryFlag(String mainSurgeryFlag) {
      this.MainSurgeryFlag = mainSurgeryFlag;
  }

  public String getSurgeryCategCode(){
      return SurgeryCategCode;
}
  @XmlElement(name = "SURGERY_CATEG_CODE")
  public void setSurgeryCategCode(String surgeryCategCode) {
      this.SurgeryCategCode = surgeryCategCode;
  }

  public String getSurgeryCategName(){
      return SurgeryCategName;
}
  @XmlElement(name = "SURGERY_CATEG_NAME")
  public void setSurgeryCategName(String surgeryCategName) {
      this.SurgeryCategName = surgeryCategName;
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
              "SurgeryOperIndexNo=" + SurgeryOperIndexNo +
              "SurgeryOperCode=" + SurgeryOperCode +
              "SurgeryOperName=" + SurgeryOperName +
              "ProvinceSurgeryOperCode=" + ProvinceSurgeryOperCode +
              "ProvinceSurgeryOperName=" + ProvinceSurgeryOperName +
              "MainSurgeryFlag=" + MainSurgeryFlag +
              "SurgeryCategCode=" + SurgeryCategCode +
              "SurgeryCategName=" + SurgeryCategName +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}