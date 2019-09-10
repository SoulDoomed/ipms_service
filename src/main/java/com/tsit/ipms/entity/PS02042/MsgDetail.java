package com.tsit.ipms.entity.PS02042;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  DictCode;

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  OrderItemIndexNo;

  private String  OrderItemCode;

  private String  OrderItemName;

  private String  HospitalDistrictCode;

  private String  HospitalDistrictName;

  private String  UseFlag;

  private String  UseFlagName;

  private String  UseRanges;

  private String  UseRangesName;

  private String  MoreOpenFlagName;

  private String  MoreOpenFlag;

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

  public String getOrderItemIndexNo(){
      return OrderItemIndexNo;
}
  @XmlElement(name = "ORDER_ITEM_INDEX_NO")
  public void setOrderItemIndexNo(String orderItemIndexNo) {
      this.OrderItemIndexNo = orderItemIndexNo;
  }

  public String getOrderItemCode(){
      return OrderItemCode;
}
  @XmlElement(name = "ORDER_ITEM_CODE")
  public void setOrderItemCode(String orderItemCode) {
      this.OrderItemCode = orderItemCode;
  }

  public String getOrderItemName(){
      return OrderItemName;
}
  @XmlElement(name = "ORDER_ITEM_NAME")
  public void setOrderItemName(String orderItemName) {
      this.OrderItemName = orderItemName;
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

  public String getUseFlag(){
      return UseFlag;
}
  @XmlElement(name = "USE_FLAG")
  public void setUseFlag(String useFlag) {
      this.UseFlag = useFlag;
  }

  public String getUseFlagName(){
      return UseFlagName;
}
  @XmlElement(name = "USE_FLAG_NAME")
  public void setUseFlagName(String useFlagName) {
      this.UseFlagName = useFlagName;
  }

  public String getUseRanges(){
      return UseRanges;
}
  @XmlElement(name = "USE_RANGES")
  public void setUseRanges(String useRanges) {
      this.UseRanges = useRanges;
  }

  public String getUseRangesName(){
      return UseRangesName;
}
  @XmlElement(name = "USE_RANGES_NAME")
  public void setUseRangesName(String useRangesName) {
      this.UseRangesName = useRangesName;
  }

  public String getMoreOpenFlagName(){
      return MoreOpenFlagName;
}
  @XmlElement(name = "MORE_OPEN_FLAG_NAME")
  public void setMoreOpenFlagName(String moreOpenFlagName) {
      this.MoreOpenFlagName = moreOpenFlagName;
  }

  public String getMoreOpenFlag(){
      return MoreOpenFlag;
}
  @XmlElement(name = "MORE_OPEN_FLAG")
  public void setMoreOpenFlag(String moreOpenFlag) {
      this.MoreOpenFlag = moreOpenFlag;
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
              "OrderItemIndexNo=" + OrderItemIndexNo +
              "OrderItemCode=" + OrderItemCode +
              "OrderItemName=" + OrderItemName +
              "HospitalDistrictCode=" + HospitalDistrictCode +
              "HospitalDistrictName=" + HospitalDistrictName +
              "UseFlag=" + UseFlag +
              "UseFlagName=" + UseFlagName +
              "UseRanges=" + UseRanges +
              "UseRangesName=" + UseRangesName +
              "MoreOpenFlagName=" + MoreOpenFlagName +
              "MoreOpenFlag=" + MoreOpenFlag +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}