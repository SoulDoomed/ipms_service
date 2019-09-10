package com.tsit.ipms.entity.PS02007;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  CreateUser;

  private String  CreateTime;

  private String  UpdateUser;

  private String  UpdateTime;

  private String  ChargeItemIndexNo;

  private String  ChargeItemCode;

  private String  ChargeItemName;

  private String  PinyinCode;

  private String  WubiCode;

  private String  EnglishName;

  private String  MemoryCode;

  private String  CommonName;

  private String  CommonNamePinyin;

  private String  CommonNameWubi;

  private String  SPECIFICATIONS;

  private String  MODEL;

  private String  ORIGIN;

  private String  NOTE;

  private String  FactoryCode;

  private String  InletFlag;

  private String  InletFlagName;

  private String  MedicareFlag;

  private String  MedicareName;

  private String  ConsistentGb;

  private String  PreciousFlag;

  private String  PreciousFlagName;

  private String  StandAloneFlag;

  private String  StandAloneFlagName;

  private String  EffectiveDate;

  private String  ExpirationDate;

  private String  InvalidFlag;

  private String  UnitId;

  private String  UnitCode;

  private String  UnitName;

  private String  REMARK;

  private String  PriceOnlyId;

  private String  PriceOnlyName;

  private String  OuthospInvoiceIndexNo;

  private String  OuthospInvoiceCode;

  private String  OuthospInvoiceName;

  private String  InhospInvoiceIndexNo;

  private String  InhospInvoiceCode;

  private String  InhospInvoiceName;

  private String  FinaccoutClassIndexNo;

  private String  FinaccoutClassCode;

  private String  FinaccoutClassName;

  private String  WorkloadIndexNo;

  private String  WorkloadCode;

  private String  WorkloadName;

  private String  MrMclassIndexNo;

  private String  MrMclassCode;

  private String  MrMclassName;

  private String  MrFeeClassIndexNo;

  private String  MrFeeClassCode;

  private String  MrFeeClassName;

  private String  WesternMedicineIndexNo;

  private String  WesternMedicineCode;

  private String  WesternMedicineName;

  private String  ChineseMedicineIndexNo;

  private String  ChineseMedicineCode;

  private String  ChineseMedicineName;

  private String  OuthospDrugDeficiency;

  private String  InhospDrugDeficiency;

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

  public String getChargeItemIndexNo(){
      return ChargeItemIndexNo;
}
  @XmlElement(name = "CHARGE_ITEM_INDEX_NO")
  public void setChargeItemIndexNo(String chargeItemIndexNo) {
      this.ChargeItemIndexNo = chargeItemIndexNo;
  }

  public String getChargeItemCode(){
      return ChargeItemCode;
}
  @XmlElement(name = "CHARGE_ITEM_CODE")
  public void setChargeItemCode(String chargeItemCode) {
      this.ChargeItemCode = chargeItemCode;
  }

  public String getChargeItemName(){
      return ChargeItemName;
}
  @XmlElement(name = "CHARGE_ITEM_NAME")
  public void setChargeItemName(String chargeItemName) {
      this.ChargeItemName = chargeItemName;
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

  public String getEnglishName(){
      return EnglishName;
}
  @XmlElement(name = "ENGLISH_NAME")
  public void setEnglishName(String englishName) {
      this.EnglishName = englishName;
  }

  public String getMemoryCode(){
      return MemoryCode;
}
  @XmlElement(name = "MEMORY_CODE")
  public void setMemoryCode(String memoryCode) {
      this.MemoryCode = memoryCode;
  }

  public String getCommonName(){
      return CommonName;
}
  @XmlElement(name = "COMMON_NAME")
  public void setCommonName(String commonName) {
      this.CommonName = commonName;
  }

  public String getCommonNamePinyin(){
      return CommonNamePinyin;
}
  @XmlElement(name = "COMMON_NAME_PINYIN")
  public void setCommonNamePinyin(String commonNamePinyin) {
      this.CommonNamePinyin = commonNamePinyin;
  }

  public String getCommonNameWubi(){
      return CommonNameWubi;
}
  @XmlElement(name = "COMMON_NAME_WUBI")
  public void setCommonNameWubi(String commonNameWubi) {
      this.CommonNameWubi = commonNameWubi;
  }

  public String getSPECIFICATIONS(){
      return SPECIFICATIONS;
}
  @XmlElement(name = "SPECIFICATIONS")
  public void setSPECIFICATIONS(String sPECIFICATIONS) {
      this.SPECIFICATIONS = sPECIFICATIONS;
  }

  public String getMODEL(){
      return MODEL;
}
  @XmlElement(name = "MODEL")
  public void setMODEL(String mODEL) {
      this.MODEL = mODEL;
  }

  public String getORIGIN(){
      return ORIGIN;
}
  @XmlElement(name = "ORIGIN")
  public void setORIGIN(String oRIGIN) {
      this.ORIGIN = oRIGIN;
  }

  public String getNOTE(){
      return NOTE;
}
  @XmlElement(name = "NOTE")
  public void setNOTE(String nOTE) {
      this.NOTE = nOTE;
  }

  public String getFactoryCode(){
      return FactoryCode;
}
  @XmlElement(name = "FACTORY_CODE")
  public void setFactoryCode(String factoryCode) {
      this.FactoryCode = factoryCode;
  }

  public String getInletFlag(){
      return InletFlag;
}
  @XmlElement(name = "INLET_FLAG")
  public void setInletFlag(String inletFlag) {
      this.InletFlag = inletFlag;
  }

  public String getInletFlagName(){
      return InletFlagName;
}
  @XmlElement(name = "INLET_FLAG_NAME")
  public void setInletFlagName(String inletFlagName) {
      this.InletFlagName = inletFlagName;
  }

  public String getMedicareFlag(){
      return MedicareFlag;
}
  @XmlElement(name = "MEDICARE_FLAG")
  public void setMedicareFlag(String medicareFlag) {
      this.MedicareFlag = medicareFlag;
  }

  public String getMedicareName(){
      return MedicareName;
}
  @XmlElement(name = "MEDICARE_NAME")
  public void setMedicareName(String medicareName) {
      this.MedicareName = medicareName;
  }

  public String getConsistentGb(){
      return ConsistentGb;
}
  @XmlElement(name = "CONSISTENT_GB")
  public void setConsistentGb(String consistentGb) {
      this.ConsistentGb = consistentGb;
  }

  public String getPreciousFlag(){
      return PreciousFlag;
}
  @XmlElement(name = "PRECIOUS_FLAG")
  public void setPreciousFlag(String preciousFlag) {
      this.PreciousFlag = preciousFlag;
  }

  public String getPreciousFlagName(){
      return PreciousFlagName;
}
  @XmlElement(name = "PRECIOUS_FLAG_NAME")
  public void setPreciousFlagName(String preciousFlagName) {
      this.PreciousFlagName = preciousFlagName;
  }

  public String getStandAloneFlag(){
      return StandAloneFlag;
}
  @XmlElement(name = "STAND_ALONE_FLAG")
  public void setStandAloneFlag(String standAloneFlag) {
      this.StandAloneFlag = standAloneFlag;
  }

  public String getStandAloneFlagName(){
      return StandAloneFlagName;
}
  @XmlElement(name = "STAND_ALONE_FLAG_NAME")
  public void setStandAloneFlagName(String standAloneFlagName) {
      this.StandAloneFlagName = standAloneFlagName;
  }

  public String getEffectiveDate(){
      return EffectiveDate;
}
  @XmlElement(name = "EFFECTIVE_DATE")
  public void setEffectiveDate(String effectiveDate) {
      this.EffectiveDate = effectiveDate;
  }

  public String getExpirationDate(){
      return ExpirationDate;
}
  @XmlElement(name = "EXPIRATION_DATE")
  public void setExpirationDate(String expirationDate) {
      this.ExpirationDate = expirationDate;
  }

  public String getInvalidFlag(){
      return InvalidFlag;
}
  @XmlElement(name = "INVALID_FLAG")
  public void setInvalidFlag(String invalidFlag) {
      this.InvalidFlag = invalidFlag;
  }

  public String getUnitId(){
      return UnitId;
}
  @XmlElement(name = "UNIT_ID")
  public void setUnitId(String unitId) {
      this.UnitId = unitId;
  }

  public String getUnitCode(){
      return UnitCode;
}
  @XmlElement(name = "UNIT_CODE")
  public void setUnitCode(String unitCode) {
      this.UnitCode = unitCode;
  }

  public String getUnitName(){
      return UnitName;
}
  @XmlElement(name = "UNIT_NAME")
  public void setUnitName(String unitName) {
      this.UnitName = unitName;
  }

  public String getREMARK(){
      return REMARK;
}
  @XmlElement(name = "REMARK")
  public void setREMARK(String rEMARK) {
      this.REMARK = rEMARK;
  }

  public String getPriceOnlyId(){
      return PriceOnlyId;
}
  @XmlElement(name = "PRICE_ONLY_ID")
  public void setPriceOnlyId(String priceOnlyId) {
      this.PriceOnlyId = priceOnlyId;
  }

  public String getPriceOnlyName(){
      return PriceOnlyName;
}
  @XmlElement(name = "PRICE_ONLY_NAME")
  public void setPriceOnlyName(String priceOnlyName) {
      this.PriceOnlyName = priceOnlyName;
  }

  public String getOuthospInvoiceIndexNo(){
      return OuthospInvoiceIndexNo;
}
  @XmlElement(name = "OUTHOSP_INVOICE_INDEX_NO")
  public void setOuthospInvoiceIndexNo(String outhospInvoiceIndexNo) {
      this.OuthospInvoiceIndexNo = outhospInvoiceIndexNo;
  }

  public String getOuthospInvoiceCode(){
      return OuthospInvoiceCode;
}
  @XmlElement(name = "OUTHOSP_INVOICE_CODE")
  public void setOuthospInvoiceCode(String outhospInvoiceCode) {
      this.OuthospInvoiceCode = outhospInvoiceCode;
  }

  public String getOuthospInvoiceName(){
      return OuthospInvoiceName;
}
  @XmlElement(name = "OUTHOSP_INVOICE_NAME")
  public void setOuthospInvoiceName(String outhospInvoiceName) {
      this.OuthospInvoiceName = outhospInvoiceName;
  }

  public String getInhospInvoiceIndexNo(){
      return InhospInvoiceIndexNo;
}
  @XmlElement(name = "INHOSP_INVOICE_INDEX_NO")
  public void setInhospInvoiceIndexNo(String inhospInvoiceIndexNo) {
      this.InhospInvoiceIndexNo = inhospInvoiceIndexNo;
  }

  public String getInhospInvoiceCode(){
      return InhospInvoiceCode;
}
  @XmlElement(name = "INHOSP_INVOICE_CODE")
  public void setInhospInvoiceCode(String inhospInvoiceCode) {
      this.InhospInvoiceCode = inhospInvoiceCode;
  }

  public String getInhospInvoiceName(){
      return InhospInvoiceName;
}
  @XmlElement(name = "INHOSP_INVOICE_NAME")
  public void setInhospInvoiceName(String inhospInvoiceName) {
      this.InhospInvoiceName = inhospInvoiceName;
  }

  public String getFinaccoutClassIndexNo(){
      return FinaccoutClassIndexNo;
}
  @XmlElement(name = "FINACCOUT_CLASS_INDEX_NO")
  public void setFinaccoutClassIndexNo(String finaccoutClassIndexNo) {
      this.FinaccoutClassIndexNo = finaccoutClassIndexNo;
  }

  public String getFinaccoutClassCode(){
      return FinaccoutClassCode;
}
  @XmlElement(name = "FINACCOUT_CLASS_CODE")
  public void setFinaccoutClassCode(String finaccoutClassCode) {
      this.FinaccoutClassCode = finaccoutClassCode;
  }

  public String getFinaccoutClassName(){
      return FinaccoutClassName;
}
  @XmlElement(name = "FINACCOUT_CLASS_NAME")
  public void setFinaccoutClassName(String finaccoutClassName) {
      this.FinaccoutClassName = finaccoutClassName;
  }

  public String getWorkloadIndexNo(){
      return WorkloadIndexNo;
}
  @XmlElement(name = "WORKLOAD_INDEX_NO")
  public void setWorkloadIndexNo(String workloadIndexNo) {
      this.WorkloadIndexNo = workloadIndexNo;
  }

  public String getWorkloadCode(){
      return WorkloadCode;
}
  @XmlElement(name = "WORKLOAD_CODE")
  public void setWorkloadCode(String workloadCode) {
      this.WorkloadCode = workloadCode;
  }

  public String getWorkloadName(){
      return WorkloadName;
}
  @XmlElement(name = "WORKLOAD_NAME")
  public void setWorkloadName(String workloadName) {
      this.WorkloadName = workloadName;
  }

  public String getMrMclassIndexNo(){
      return MrMclassIndexNo;
}
  @XmlElement(name = "MR_MCLASS_INDEX_NO")
  public void setMrMclassIndexNo(String mrMclassIndexNo) {
      this.MrMclassIndexNo = mrMclassIndexNo;
  }

  public String getMrMclassCode(){
      return MrMclassCode;
}
  @XmlElement(name = "MR_MCLASS_CODE")
  public void setMrMclassCode(String mrMclassCode) {
      this.MrMclassCode = mrMclassCode;
  }

  public String getMrMclassName(){
      return MrMclassName;
}
  @XmlElement(name = "MR_MCLASS_NAME")
  public void setMrMclassName(String mrMclassName) {
      this.MrMclassName = mrMclassName;
  }

  public String getMrFeeClassIndexNo(){
      return MrFeeClassIndexNo;
}
  @XmlElement(name = "MR_FEE_CLASS_INDEX_NO")
  public void setMrFeeClassIndexNo(String mrFeeClassIndexNo) {
      this.MrFeeClassIndexNo = mrFeeClassIndexNo;
  }

  public String getMrFeeClassCode(){
      return MrFeeClassCode;
}
  @XmlElement(name = "MR_FEE_CLASS_CODE")
  public void setMrFeeClassCode(String mrFeeClassCode) {
      this.MrFeeClassCode = mrFeeClassCode;
  }

  public String getMrFeeClassName(){
      return MrFeeClassName;
}
  @XmlElement(name = "MR_FEE_CLASS_NAME")
  public void setMrFeeClassName(String mrFeeClassName) {
      this.MrFeeClassName = mrFeeClassName;
  }

  public String getWesternMedicineIndexNo(){
      return WesternMedicineIndexNo;
}
  @XmlElement(name = "WESTERN_MEDICINE_INDEX_NO")
  public void setWesternMedicineIndexNo(String westernMedicineIndexNo) {
      this.WesternMedicineIndexNo = westernMedicineIndexNo;
  }

  public String getWesternMedicineCode(){
      return WesternMedicineCode;
}
  @XmlElement(name = "WESTERN_MEDICINE_CODE")
  public void setWesternMedicineCode(String westernMedicineCode) {
      this.WesternMedicineCode = westernMedicineCode;
  }

  public String getWesternMedicineName(){
      return WesternMedicineName;
}
  @XmlElement(name = "WESTERN_MEDICINE_NAME")
  public void setWesternMedicineName(String westernMedicineName) {
      this.WesternMedicineName = westernMedicineName;
  }

  public String getChineseMedicineIndexNo(){
      return ChineseMedicineIndexNo;
}
  @XmlElement(name = "CHINESE_MEDICINE_INDEX_NO")
  public void setChineseMedicineIndexNo(String chineseMedicineIndexNo) {
      this.ChineseMedicineIndexNo = chineseMedicineIndexNo;
  }

  public String getChineseMedicineCode(){
      return ChineseMedicineCode;
}
  @XmlElement(name = "CHINESE_MEDICINE_CODE")
  public void setChineseMedicineCode(String chineseMedicineCode) {
      this.ChineseMedicineCode = chineseMedicineCode;
  }

  public String getChineseMedicineName(){
      return ChineseMedicineName;
}
  @XmlElement(name = "CHINESE_MEDICINE_NAME")
  public void setChineseMedicineName(String chineseMedicineName) {
      this.ChineseMedicineName = chineseMedicineName;
  }

  public String getOuthospDrugDeficiency(){
      return OuthospDrugDeficiency;
}
  @XmlElement(name = "OUTHOSP_DRUG_DEFICIENCY")
  public void setOuthospDrugDeficiency(String outhospDrugDeficiency) {
      this.OuthospDrugDeficiency = outhospDrugDeficiency;
  }

  public String getInhospDrugDeficiency(){
      return InhospDrugDeficiency;
}
  @XmlElement(name = "INHOSP_DRUG_DEFICIENCY")
  public void setInhospDrugDeficiency(String inhospDrugDeficiency) {
      this.InhospDrugDeficiency = inhospDrugDeficiency;
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
              "ChargeItemIndexNo=" + ChargeItemIndexNo +
              "ChargeItemCode=" + ChargeItemCode +
              "ChargeItemName=" + ChargeItemName +
              "PinyinCode=" + PinyinCode +
              "WubiCode=" + WubiCode +
              "EnglishName=" + EnglishName +
              "MemoryCode=" + MemoryCode +
              "CommonName=" + CommonName +
              "CommonNamePinyin=" + CommonNamePinyin +
              "CommonNameWubi=" + CommonNameWubi +
              "SPECIFICATIONS=" + SPECIFICATIONS +
              "MODEL=" + MODEL +
              "ORIGIN=" + ORIGIN +
              "NOTE=" + NOTE +
              "FactoryCode=" + FactoryCode +
              "InletFlag=" + InletFlag +
              "InletFlagName=" + InletFlagName +
              "MedicareFlag=" + MedicareFlag +
              "MedicareName=" + MedicareName +
              "ConsistentGb=" + ConsistentGb +
              "PreciousFlag=" + PreciousFlag +
              "PreciousFlagName=" + PreciousFlagName +
              "StandAloneFlag=" + StandAloneFlag +
              "StandAloneFlagName=" + StandAloneFlagName +
              "EffectiveDate=" + EffectiveDate +
              "ExpirationDate=" + ExpirationDate +
              "InvalidFlag=" + InvalidFlag +
              "UnitId=" + UnitId +
              "UnitCode=" + UnitCode +
              "UnitName=" + UnitName +
              "REMARK=" + REMARK +
              "PriceOnlyId=" + PriceOnlyId +
              "PriceOnlyName=" + PriceOnlyName +
              "OuthospInvoiceIndexNo=" + OuthospInvoiceIndexNo +
              "OuthospInvoiceCode=" + OuthospInvoiceCode +
              "OuthospInvoiceName=" + OuthospInvoiceName +
              "InhospInvoiceIndexNo=" + InhospInvoiceIndexNo +
              "InhospInvoiceCode=" + InhospInvoiceCode +
              "InhospInvoiceName=" + InhospInvoiceName +
              "FinaccoutClassIndexNo=" + FinaccoutClassIndexNo +
              "FinaccoutClassCode=" + FinaccoutClassCode +
              "FinaccoutClassName=" + FinaccoutClassName +
              "WorkloadIndexNo=" + WorkloadIndexNo +
              "WorkloadCode=" + WorkloadCode +
              "WorkloadName=" + WorkloadName +
              "MrMclassIndexNo=" + MrMclassIndexNo +
              "MrMclassCode=" + MrMclassCode +
              "MrMclassName=" + MrMclassName +
              "MrFeeClassIndexNo=" + MrFeeClassIndexNo +
              "MrFeeClassCode=" + MrFeeClassCode +
              "MrFeeClassName=" + MrFeeClassName +
              "WesternMedicineIndexNo=" + WesternMedicineIndexNo +
              "WesternMedicineCode=" + WesternMedicineCode +
              "WesternMedicineName=" + WesternMedicineName +
              "ChineseMedicineIndexNo=" + ChineseMedicineIndexNo +
              "ChineseMedicineCode=" + ChineseMedicineCode +
              "ChineseMedicineName=" + ChineseMedicineName +
              "OuthospDrugDeficiency=" + OuthospDrugDeficiency +
              "InhospDrugDeficiency=" + InhospDrugDeficiency +
              "VersionNumber=" + VersionNumber +
           '}';
  }
}