package com.tsit.ipms.entity.PS2017;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  DeptIndexNo;

  private String  DeptCode;

  private String  DeptName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  SuborHospitalDistrict;

  private String  SuperiorDeptCode;

  private String  SuperiorDeptName;

  private String  LOCATION;

  private String  DESCR;

  private String  InvalidFlag;

  private String  IsWard;

  private String  IsWardName;

  private String  DeptCategCode;

  private String  DeptCategName;

  private String  ClinicDeptFlag;

  private String  ClinicDeptFlagName;

  private String  OiDeptFlag;

  private String  MsDeptFlag;

  private String  MrDeptCode;

  private String  MrDeptName;

  private String  UnifiedDeptCode;

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

  public String getDeptIndexNo(){
      return DeptIndexNo;
}
  @XmlElement(name = "DEPT_INDEX_NO")
  public void setDeptIndexNo(String deptIndexNo) {
      this.DeptIndexNo = deptIndexNo;
  }

  public String getDeptCode(){
      return DeptCode;
}
  @XmlElement(name = "DEPT_CODE")
  public void setDeptCode(String deptCode) {
      this.DeptCode = deptCode;
  }

  public String getDeptName(){
      return DeptName;
}
  @XmlElement(name = "DEPT_NAME")
  public void setDeptName(String deptName) {
      this.DeptName = deptName;
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

  public String getSuborHospitalDistrict(){
      return SuborHospitalDistrict;
}
  @XmlElement(name = "SUBOR_HOSPITAL_DISTRICT")
  public void setSuborHospitalDistrict(String suborHospitalDistrict) {
      this.SuborHospitalDistrict = suborHospitalDistrict;
  }

  public String getSuperiorDeptCode(){
      return SuperiorDeptCode;
}
  @XmlElement(name = "SUPERIOR_DEPT_CODE")
  public void setSuperiorDeptCode(String superiorDeptCode) {
      this.SuperiorDeptCode = superiorDeptCode;
  }

  public String getSuperiorDeptName(){
      return SuperiorDeptName;
}
  @XmlElement(name = "SUPERIOR_DEPT_NAME")
  public void setSuperiorDeptName(String superiorDeptName) {
      this.SuperiorDeptName = superiorDeptName;
  }

  public String getLOCATION(){
      return LOCATION;
}
  @XmlElement(name = "LOCATION")
  public void setLOCATION(String lOCATION) {
      this.LOCATION = lOCATION;
  }

  public String getDESCR(){
      return DESCR;
}
  @XmlElement(name = "DESCR")
  public void setDESCR(String dESCR) {
      this.DESCR = dESCR;
  }

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }

  public String getIsWard(){
      return IsWard;
}
  @XmlElement(name = "IS_WARD")
  public void setIsWard(String isWard) {
      this.IsWard = isWard;
  }

  public String getIsWardName(){
      return IsWardName;
}
  @XmlElement(name = "IS_WARD_NAME")
  public void setIsWardName(String isWardName) {
      this.IsWardName = isWardName;
  }

  public String getDeptCategCode(){
      return DeptCategCode;
}
  @XmlElement(name = "DEPT_CATEG_CODE")
  public void setDeptCategCode(String deptCategCode) {
      this.DeptCategCode = deptCategCode;
  }

  public String getDeptCategName(){
      return DeptCategName;
}
  @XmlElement(name = "DEPT_CATEG_NAME")
  public void setDeptCategName(String deptCategName) {
      this.DeptCategName = deptCategName;
  }

  public String getClinicDeptFlag(){
      return ClinicDeptFlag;
}
  @XmlElement(name = "CLINIC_DEPT_FLAG")
  public void setClinicDeptFlag(String clinicDeptFlag) {
      this.ClinicDeptFlag = clinicDeptFlag;
  }

  public String getClinicDeptFlagName(){
      return ClinicDeptFlagName;
}
  @XmlElement(name = "CLINIC_DEPT_FLAG_NAME")
  public void setClinicDeptFlagName(String clinicDeptFlagName) {
      this.ClinicDeptFlagName = clinicDeptFlagName;
  }

  public String getOiDeptFlag(){
      return OiDeptFlag;
}
  @XmlElement(name = "OI_DEPT_FLAG")
  public void setOiDeptFlag(String oiDeptFlag) {
      this.OiDeptFlag = oiDeptFlag;
  }

  public String getMsDeptFlag(){
      return MsDeptFlag;
}
  @XmlElement(name = "MS_DEPT_FLAG")
  public void setMsDeptFlag(String msDeptFlag) {
      this.MsDeptFlag = msDeptFlag;
  }

  public String getMrDeptCode(){
      return MrDeptCode;
}
  @XmlElement(name = "MR_DEPT_CODE")
  public void setMrDeptCode(String mrDeptCode) {
      this.MrDeptCode = mrDeptCode;
  }

  public String getMrDeptName(){
      return MrDeptName;
}
  @XmlElement(name = "MR_DEPT_NAME")
  public void setMrDeptName(String mrDeptName) {
      this.MrDeptName = mrDeptName;
  }

  public String getUnifiedDeptCode(){
      return UnifiedDeptCode;
}
  @XmlElement(name = "UNIFIED_DEPT_CODE")
  public void setUnifiedDeptCode(String unifiedDeptCode) {
      this.UnifiedDeptCode = unifiedDeptCode;
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
              "DeptIndexNo=" + DeptIndexNo +
              "DeptCode=" + DeptCode +
              "DeptName=" + DeptName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "SuborHospitalDistrict=" + SuborHospitalDistrict +
              "SuperiorDeptCode=" + SuperiorDeptCode +
              "SuperiorDeptName=" + SuperiorDeptName +
              "LOCATION=" + LOCATION +
              "DESCR=" + DESCR +
              "InvalidFlag=" + InvalidFlag +
              "IsWard=" + IsWard +
              "IsWardName=" + IsWardName +
              "DeptCategCode=" + DeptCategCode +
              "DeptCategName=" + DeptCategName +
              "ClinicDeptFlag=" + ClinicDeptFlag +
              "ClinicDeptFlagName=" + ClinicDeptFlagName +
              "OiDeptFlag=" + OiDeptFlag +
              "MsDeptFlag=" + MsDeptFlag +
              "MrDeptCode=" + MrDeptCode +
              "MrDeptName=" + MrDeptName +
              "UnifiedDeptCode=" + UnifiedDeptCode +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}