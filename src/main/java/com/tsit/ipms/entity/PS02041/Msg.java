package com.tsit.ipms.entity.PS02041;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  DoseWayIndexNo;

  private String  DoseWayCode;

  private String  DoseWayName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  NOTE;

  private String  InalidFlag;

  private String  InalidFlagName;

  private String  NurseWay;

  private String  NurseWayIndexNo;

  private String  NurseWayCode;

  private String  NurseWayName;

  private String  DoseWayClass;

  private String  OuthospFlag;

  private String  OuthospFlagName;

  private String  InhospFlag;

  private String  InhospFlagName;

  private String  CheargeItemId;

  private String  CheargeItemCode;

  private String  CheargeItemName;

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

  public String getDoseWayIndexNo(){
      return DoseWayIndexNo;
}
  @XmlElement(name = "DOSE_WAY_INDEX_NO")
  public void setDoseWayIndexNo(String doseWayIndexNo) {
      this.DoseWayIndexNo = doseWayIndexNo;
  }

  public String getDoseWayCode(){
      return DoseWayCode;
}
  @XmlElement(name = "DOSE_WAY_CODE")
  public void setDoseWayCode(String doseWayCode) {
      this.DoseWayCode = doseWayCode;
  }

  public String getDoseWayName(){
      return DoseWayName;
}
  @XmlElement(name = "DOSE_WAY_NAME")
  public void setDoseWayName(String doseWayName) {
      this.DoseWayName = doseWayName;
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

  public String getNurseWay(){
      return NurseWay;
}
  @XmlElement(name = "NURSE_WAY")
  public void setNurseWay(String nurseWay) {
      this.NurseWay = nurseWay;
  }

  public String getNurseWayIndexNo(){
      return NurseWayIndexNo;
}
  @XmlElement(name = "NURSE_WAY_INDEX_NO")
  public void setNurseWayIndexNo(String nurseWayIndexNo) {
      this.NurseWayIndexNo = nurseWayIndexNo;
  }

  public String getNurseWayCode(){
      return NurseWayCode;
}
  @XmlElement(name = "NURSE_WAY_CODE")
  public void setNurseWayCode(String nurseWayCode) {
      this.NurseWayCode = nurseWayCode;
  }

  public String getNurseWayName(){
      return NurseWayName;
}
  @XmlElement(name = "NURSE_WAY_NAME")
  public void setNurseWayName(String nurseWayName) {
      this.NurseWayName = nurseWayName;
  }

  public String getDoseWayClass(){
      return DoseWayClass;
}
  @XmlElement(name = "DOSE_WAY_CLASS")
  public void setDoseWayClass(String doseWayClass) {
      this.DoseWayClass = doseWayClass;
  }

  public String getOuthospFlag(){
      return OuthospFlag;
}
  @XmlElement(name = "OUTHOSP_FLAG")
  public void setOuthospFlag(String outhospFlag) {
      this.OuthospFlag = outhospFlag;
  }

  public String getOuthospFlagName(){
      return OuthospFlagName;
}
  @XmlElement(name = "OUTHOSP_FLAG_NAME")
  public void setOuthospFlagName(String outhospFlagName) {
      this.OuthospFlagName = outhospFlagName;
  }

  public String getInhospFlag(){
      return InhospFlag;
}
  @XmlElement(name = "INHOSP_FLAG")
  public void setInhospFlag(String inhospFlag) {
      this.InhospFlag = inhospFlag;
  }

  public String getInhospFlagName(){
      return InhospFlagName;
}
  @XmlElement(name = "INHOSP_FLAG_NAME")
  public void setInhospFlagName(String inhospFlagName) {
      this.InhospFlagName = inhospFlagName;
  }

  public String getCheargeItemId(){
      return CheargeItemId;
}
  @XmlElement(name = "CHEARGE_ITEM_ID")
  public void setCheargeItemId(String cheargeItemId) {
      this.CheargeItemId = cheargeItemId;
  }

  public String getCheargeItemCode(){
      return CheargeItemCode;
}
  @XmlElement(name = "CHEARGE_ITEM_CODE")
  public void setCheargeItemCode(String cheargeItemCode) {
      this.CheargeItemCode = cheargeItemCode;
  }

  public String getCheargeItemName(){
      return CheargeItemName;
}
  @XmlElement(name = "CHEARGE_ITEM_NAME")
  public void setCheargeItemName(String cheargeItemName) {
      this.CheargeItemName = cheargeItemName;
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
              "DoseWayIndexNo=" + DoseWayIndexNo +
              "DoseWayCode=" + DoseWayCode +
              "DoseWayName=" + DoseWayName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "NOTE=" + NOTE +
              "InalidFlag=" + InalidFlag +
              "InalidFlagName=" + InalidFlagName +
              "NurseWay=" + NurseWay +
              "NurseWayIndexNo=" + NurseWayIndexNo +
              "NurseWayCode=" + NurseWayCode +
              "NurseWayName=" + NurseWayName +
              "DoseWayClass=" + DoseWayClass +
              "OuthospFlag=" + OuthospFlag +
              "OuthospFlagName=" + OuthospFlagName +
              "InhospFlag=" + InhospFlag +
              "InhospFlagName=" + InhospFlagName +
              "CheargeItemId=" + CheargeItemId +
              "CheargeItemCode=" + CheargeItemCode +
              "CheargeItemName=" + CheargeItemName +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}