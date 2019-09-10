package com.tsit.ipms.entity.PS02007;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  DictCode;

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  ChargeItemIndexNo;

  private String  ChargeItemName;

  private String  ChargeItemCode;

  private String  HospitalDistrictCode;

  private String  HospitalDistrictName;

  private String  OuthospPrice;

  private String  InhospPrice;

  private String  DrugStoragePrice;

  private String  UseRangesName;

  private String  UseRanges;

  private String  AddedValenceClass1;

  private String  AddedValenceClass2;

  private String  AddedValenceClass3;

  private String  AddedValenceClass4;

  private String  AddedValenceClass5;

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

  public String getChargeItemIndexNo(){
      return ChargeItemIndexNo;
}
  @XmlElement(name = "CHARGE_ITEM_INDEX_NO")
  public void setChargeItemIndexNo(String chargeItemIndexNo) {
      this.ChargeItemIndexNo = chargeItemIndexNo;
  }

  public String getChargeItemName(){
      return ChargeItemName;
}
  @XmlElement(name = "CHARGE_ITEM_NAME")
  public void setChargeItemName(String chargeItemName) {
      this.ChargeItemName = chargeItemName;
  }

  public String getChargeItemCode(){
      return ChargeItemCode;
}
  @XmlElement(name = "CHARGE_ITEM_CODE")
  public void setChargeItemCode(String chargeItemCode) {
      this.ChargeItemCode = chargeItemCode;
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

  public String getOuthospPrice(){
      return OuthospPrice;
}
  @XmlElement(name = "OUTHOSP_PRICE")
  public void setOuthospPrice(String outhospPrice) {
      this.OuthospPrice = outhospPrice;
  }

  public String getInhospPrice(){
      return InhospPrice;
}
  @XmlElement(name = "INHOSP_PRICE")
  public void setInhospPrice(String inhospPrice) {
      this.InhospPrice = inhospPrice;
  }

  public String getDrugStoragePrice(){
      return DrugStoragePrice;
}
  @XmlElement(name = "DRUG_STORAGE_PRICE")
  public void setDrugStoragePrice(String drugStoragePrice) {
      this.DrugStoragePrice = drugStoragePrice;
  }

  public String getUseRangesName(){
      return UseRangesName;
}
  @XmlElement(name = "USE_RANGES_NAME")
  public void setUseRangesName(String useRangesName) {
      this.UseRangesName = useRangesName;
  }

  public String getUseRanges(){
      return UseRanges;
}
  @XmlElement(name = "USE_RANGES")
  public void setUseRanges(String useRanges) {
      this.UseRanges = useRanges;
  }

  public String getAddedValenceClass1(){
      return AddedValenceClass1;
}
  @XmlElement(name = "ADDED_VALENCE_CLASS1")
  public void setAddedValenceClass1(String addedValenceClass1) {
      this.AddedValenceClass1 = addedValenceClass1;
  }

  public String getAddedValenceClass2(){
      return AddedValenceClass2;
}
  @XmlElement(name = "ADDED_VALENCE_CLASS2")
  public void setAddedValenceClass2(String addedValenceClass2) {
      this.AddedValenceClass2 = addedValenceClass2;
  }

  public String getAddedValenceClass3(){
      return AddedValenceClass3;
}
  @XmlElement(name = "ADDED_VALENCE_CLASS3")
  public void setAddedValenceClass3(String addedValenceClass3) {
      this.AddedValenceClass3 = addedValenceClass3;
  }

  public String getAddedValenceClass4(){
      return AddedValenceClass4;
}
  @XmlElement(name = "ADDED_VALENCE_CLASS4")
  public void setAddedValenceClass4(String addedValenceClass4) {
      this.AddedValenceClass4 = addedValenceClass4;
  }

  public String getAddedValenceClass5(){
      return AddedValenceClass5;
}
  @XmlElement(name = "ADDED_VALENCE_CLASS5")
  public void setAddedValenceClass5(String addedValenceClass5) {
      this.AddedValenceClass5 = addedValenceClass5;
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
              "ChargeItemIndexNo=" + ChargeItemIndexNo +
              "ChargeItemName=" + ChargeItemName +
              "ChargeItemCode=" + ChargeItemCode +
              "HospitalDistrictCode=" + HospitalDistrictCode +
              "HospitalDistrictName=" + HospitalDistrictName +
              "OuthospPrice=" + OuthospPrice +
              "InhospPrice=" + InhospPrice +
              "DrugStoragePrice=" + DrugStoragePrice +
              "UseRangesName=" + UseRangesName +
              "UseRanges=" + UseRanges +
              "AddedValenceClass1=" + AddedValenceClass1 +
              "AddedValenceClass2=" + AddedValenceClass2 +
              "AddedValenceClass3=" + AddedValenceClass3 +
              "AddedValenceClass4=" + AddedValenceClass4 +
              "AddedValenceClass5=" + AddedValenceClass5 +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}