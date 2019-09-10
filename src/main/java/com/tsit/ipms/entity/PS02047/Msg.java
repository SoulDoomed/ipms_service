package com.tsit.ipms.entity.PS02047;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  BedIndexNo;

  private String  BedCode;

  private String  BedName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  RoomNo;

  private String  SuborSickRoomId;

  private String  SuborSickroomCode;

  private String  SuborSickroomName;

  private String  SuborWard;

  private String  SuborWardId;

  private String  SuborWardCode;

  private String  SuborWardName;

  private String  BedTypeId;

  private String  BedTypeCode;

  private String  BedTypeName;

  private String  BedLevelCode;

  private String  BedLevelName;

  private String  BillingPackage;

  private String  BillingPackageId;

  private String  BillingPackageCode;

  private String  BillingPackageName;

  private String  ReserveFlag;

  private String  CrossAreaFlag;

  private String  REMARK;

  private String  InvalidFlag;

  //private String  InvalidFlag;

  private String  SortNum;

  private String  HospitalDistrictCode;

  private String  HospitalDistrictName;

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

  public String getBedIndexNo(){
      return BedIndexNo;
}
  @XmlElement(name = "BED_INDEX_NO")
  public void setBedIndexNo(String bedIndexNo) {
      this.BedIndexNo = bedIndexNo;
  }

  public String getBedCode(){
      return BedCode;
}
  @XmlElement(name = "BED_CODE")
  public void setBedCode(String bedCode) {
      this.BedCode = bedCode;
  }

  public String getBedName(){
      return BedName;
}
  @XmlElement(name = "BED_NAME")
  public void setBedName(String bedName) {
      this.BedName = bedName;
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

  public String getRoomNo(){
      return RoomNo;
}
  @XmlElement(name = "ROOM_NO")
  public void setRoomNo(String roomNo) {
      this.RoomNo = roomNo;
  }

  public String getSuborSickRoomId(){
      return SuborSickRoomId;
}
  @XmlElement(name = "SUBOR_SICK_ROOM_ID")
  public void setSuborSickRoomId(String suborSickRoomId) {
      this.SuborSickRoomId = suborSickRoomId;
  }

  public String getSuborSickroomCode(){
      return SuborSickroomCode;
}
  @XmlElement(name = "SUBOR_SICKROOM_CODE")
  public void setSuborSickroomCode(String suborSickroomCode) {
      this.SuborSickroomCode = suborSickroomCode;
  }

  public String getSuborSickroomName(){
      return SuborSickroomName;
}
  @XmlElement(name = "SUBOR_SICKROOM_NAME")
  public void setSuborSickroomName(String suborSickroomName) {
      this.SuborSickroomName = suborSickroomName;
  }

  public String getSuborWard(){
      return SuborWard;
}
  @XmlElement(name = "SUBOR_WARD")
  public void setSuborWard(String suborWard) {
      this.SuborWard = suborWard;
  }

  public String getSuborWardId(){
      return SuborWardId;
}
  @XmlElement(name = "SUBOR_WARD_ID")
  public void setSuborWardId(String suborWardId) {
      this.SuborWardId = suborWardId;
  }

  public String getSuborWardCode(){
      return SuborWardCode;
}
  @XmlElement(name = "SUBOR_WARD_CODE")
  public void setSuborWardCode(String suborWardCode) {
      this.SuborWardCode = suborWardCode;
  }

  public String getSuborWardName(){
      return SuborWardName;
}
  @XmlElement(name = "SUBOR_WARD_NAME")
  public void setSuborWardName(String suborWardName) {
      this.SuborWardName = suborWardName;
  }

  public String getBedTypeId(){
      return BedTypeId;
}
  @XmlElement(name = "BED_TYPE_ID")
  public void setBedTypeId(String bedTypeId) {
      this.BedTypeId = bedTypeId;
  }

  public String getBedTypeCode(){
      return BedTypeCode;
}
  @XmlElement(name = "BED_TYPE_CODE")
  public void setBedTypeCode(String bedTypeCode) {
      this.BedTypeCode = bedTypeCode;
  }

  public String getBedTypeName(){
      return BedTypeName;
}
  @XmlElement(name = "BED_TYPE_NAME")
  public void setBedTypeName(String bedTypeName) {
      this.BedTypeName = bedTypeName;
  }

  public String getBedLevelCode(){
      return BedLevelCode;
}
  @XmlElement(name = "BED_LEVEL_CODE")
  public void setBedLevelCode(String bedLevelCode) {
      this.BedLevelCode = bedLevelCode;
  }

  public String getBedLevelName(){
      return BedLevelName;
}
  @XmlElement(name = "BED_LEVEL_NAME")
  public void setBedLevelName(String bedLevelName) {
      this.BedLevelName = bedLevelName;
  }

  public String getBillingPackage(){
      return BillingPackage;
}
  @XmlElement(name = "BILLING_PACKAGE")
  public void setBillingPackage(String billingPackage) {
      this.BillingPackage = billingPackage;
  }

  public String getBillingPackageId(){
      return BillingPackageId;
}
  @XmlElement(name = "BILLING_PACKAGE_ID")
  public void setBillingPackageId(String billingPackageId) {
      this.BillingPackageId = billingPackageId;
  }

  public String getBillingPackageCode(){
      return BillingPackageCode;
}
  @XmlElement(name = "BILLING_PACKAGE_CODE")
  public void setBillingPackageCode(String billingPackageCode) {
      this.BillingPackageCode = billingPackageCode;
  }

  public String getBillingPackageName(){
      return BillingPackageName;
}
  @XmlElement(name = "BILLING_PACKAGE_NAME")
  public void setBillingPackageName(String billingPackageName) {
      this.BillingPackageName = billingPackageName;
  }

  public String getReserveFlag(){
      return ReserveFlag;
}
  @XmlElement(name = "RESERVE_FLAG")
  public void setReserveFlag(String reserveFlag) {
      this.ReserveFlag = reserveFlag;
  }

  public String getCrossAreaFlag(){
      return CrossAreaFlag;
}
  @XmlElement(name = "CROSS_AREA_FLAG")
  public void setCrossAreaFlag(String crossAreaFlag) {
      this.CrossAreaFlag = crossAreaFlag;
  }

  public String getREMARK(){
      return REMARK;
}
  @XmlElement(name = "REMARK")
  public void setREMARK(String rEMARK) {
      this.REMARK = rEMARK;
  }

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }

//TODO 重复字段
/*  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }*/

  public String getSortNum(){
      return SortNum;
}
  @XmlElement(name = "SORT_NUM")
  public void setSortNum(String sortNum) {
      this.SortNum = sortNum;
  }

  public String getHospitalDistrictCode(){
      return HospitalDistrictCode;
}
  @XmlElement(name = "HOSPITAL_DISTRICT_CODE")
  public void setHospitalDistrictCode(String hospitalDistrictCode) {
      this.HospitalDistrictCode = hospitalDistrictCode;
  }

  public String getHospitalDistrictName(){
      return HospitalDistrictName;
}
  @XmlElement(name = "HOSPITAL_DISTRICT_NAME")
  public void setHospitalDistrictName(String hospitalDistrictName) {
      this.HospitalDistrictName = hospitalDistrictName;
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
              "BedIndexNo=" + BedIndexNo +
              "BedCode=" + BedCode +
              "BedName=" + BedName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "RoomNo=" + RoomNo +
              "SuborSickRoomId=" + SuborSickRoomId +
              "SuborSickroomCode=" + SuborSickroomCode +
              "SuborSickroomName=" + SuborSickroomName +
              "SuborWard=" + SuborWard +
              "SuborWardId=" + SuborWardId +
              "SuborWardCode=" + SuborWardCode +
              "SuborWardName=" + SuborWardName +
              "BedTypeId=" + BedTypeId +
              "BedTypeCode=" + BedTypeCode +
              "BedTypeName=" + BedTypeName +
              "BedLevelCode=" + BedLevelCode +
              "BedLevelName=" + BedLevelName +
              "BillingPackage=" + BillingPackage +
              "BillingPackageId=" + BillingPackageId +
              "BillingPackageCode=" + BillingPackageCode +
              "BillingPackageName=" + BillingPackageName +
              "ReserveFlag=" + ReserveFlag +
              "CrossAreaFlag=" + CrossAreaFlag +
              "REMARK=" + REMARK +
              "InvalidFlag=" + InvalidFlag +
              "InvalidFlag=" + InvalidFlag +
              "SortNum=" + SortNum +
              "HospitalDistrictCode=" + HospitalDistrictCode +
              "HospitalDistrictName=" + HospitalDistrictName +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}