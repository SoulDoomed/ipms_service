package com.tsit.ipms.entity.PS10018;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  PatIndexNo;

  private String  OuthospNo;

  private String  PatName;

  private String  PhysiSexCode;

  private String  DateBirth;

  private String  ContactPersonAddr;

  private String  ContactPersonAddrProvince;

  private String  ContactPersonAddrCity;

  private String  ContactPersonAddrCounty;

  private String  ContactPersonAddrTownship;

  private String  ContactPersonAddrVillage;

  private String  ContactPersonAddrZipCode;

  private String  ContactPhoneNo;

  private String  ContactCertificateType;

  private String  ContactCertificateNo;

  private String  RecordDate;

  private String  OperStaffCode;

  private String  CertificateType;

  private String  CertificateNo;

  private String  MedicareCategCode;

  private String  MedicareCategName;

  private String  CurrAddr;

  private String  CurrAddrProvince;

  private String  CurrAddrCity;

  private String  CurrAddrCounty;

  private String  CurrAddrTownship;

  private String  CurrAddrVillage;

  private String  CurrAddrZipCode;

  private String  PhoneNo;

  private String  IsregistmiFlag;

  private String  EmpiId;

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getOuthospNo(){
      return OuthospNo;
}
  @XmlElement(name = "OUTHOSP_NO")
  public void setOuthospNo(String outhospNo) {
      this.OuthospNo = outhospNo;
  }

  public String getPatName(){
      return PatName;
}
  @XmlElement(name = "PAT_NAME")
  public void setPatName(String patName) {
      this.PatName = patName;
  }

  public String getPhysiSexCode(){
      return PhysiSexCode;
}
  @XmlElement(name = "PHYSI_SEX_CODE")
  public void setPhysiSexCode(String physiSexCode) {
      this.PhysiSexCode = physiSexCode;
  }

  public String getDateBirth(){
      return DateBirth;
}
  @XmlElement(name = "DATE_BIRTH")
  public void setDateBirth(String dateBirth) {
      this.DateBirth = dateBirth;
  }

  public String getContactPersonAddr(){
      return ContactPersonAddr;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR")
  public void setContactPersonAddr(String contactPersonAddr) {
      this.ContactPersonAddr = contactPersonAddr;
  }

  public String getContactPersonAddrProvince(){
      return ContactPersonAddrProvince;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_PROVINCE")
  public void setContactPersonAddrProvince(String contactPersonAddrProvince) {
      this.ContactPersonAddrProvince = contactPersonAddrProvince;
  }

  public String getContactPersonAddrCity(){
      return ContactPersonAddrCity;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_CITY")
  public void setContactPersonAddrCity(String contactPersonAddrCity) {
      this.ContactPersonAddrCity = contactPersonAddrCity;
  }

  public String getContactPersonAddrCounty(){
      return ContactPersonAddrCounty;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_COUNTY")
  public void setContactPersonAddrCounty(String contactPersonAddrCounty) {
      this.ContactPersonAddrCounty = contactPersonAddrCounty;
  }

  public String getContactPersonAddrTownship(){
      return ContactPersonAddrTownship;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_TOWNSHIP")
  public void setContactPersonAddrTownship(String contactPersonAddrTownship) {
      this.ContactPersonAddrTownship = contactPersonAddrTownship;
  }

  public String getContactPersonAddrVillage(){
      return ContactPersonAddrVillage;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_VILLAGE")
  public void setContactPersonAddrVillage(String contactPersonAddrVillage) {
      this.ContactPersonAddrVillage = contactPersonAddrVillage;
  }

  public String getContactPersonAddrZipCode(){
      return ContactPersonAddrZipCode;
}
  @XmlElement(name = "CONTACT_PERSON_ADDR_ZIP_CODE")
  public void setContactPersonAddrZipCode(String contactPersonAddrZipCode) {
      this.ContactPersonAddrZipCode = contactPersonAddrZipCode;
  }

  public String getContactPhoneNo(){
      return ContactPhoneNo;
}
  @XmlElement(name = "CONTACT_PHONE_NO")
  public void setContactPhoneNo(String contactPhoneNo) {
      this.ContactPhoneNo = contactPhoneNo;
  }

  public String getContactCertificateType(){
      return ContactCertificateType;
}
  @XmlElement(name = "CONTACT_CERTIFICATE_TYPE")
  public void setContactCertificateType(String contactCertificateType) {
      this.ContactCertificateType = contactCertificateType;
  }

  public String getContactCertificateNo(){
      return ContactCertificateNo;
}
  @XmlElement(name = "CONTACT_CERTIFICATE_NO")
  public void setContactCertificateNo(String contactCertificateNo) {
      this.ContactCertificateNo = contactCertificateNo;
  }

  public String getRecordDate(){
      return RecordDate;
}
  @XmlElement(name = "RECORD_DATE")
  public void setRecordDate(String recordDate) {
      this.RecordDate = recordDate;
  }

  public String getOperStaffCode(){
      return OperStaffCode;
}
  @XmlElement(name = "OPER_STAFF_CODE")
  public void setOperStaffCode(String operStaffCode) {
      this.OperStaffCode = operStaffCode;
  }

  public String getCertificateType(){
      return CertificateType;
}
  @XmlElement(name = "CERTIFICATE_TYPE")
  public void setCertificateType(String certificateType) {
      this.CertificateType = certificateType;
  }

  public String getCertificateNo(){
      return CertificateNo;
}
  @XmlElement(name = "CERTIFICATE_NO")
  public void setCertificateNo(String certificateNo) {
      this.CertificateNo = certificateNo;
  }

  public String getMedicareCategCode(){
      return MedicareCategCode;
}
  @XmlElement(name = "MEDICARE_CATEG_CODE")
  public void setMedicareCategCode(String medicareCategCode) {
      this.MedicareCategCode = medicareCategCode;
  }

  public String getMedicareCategName(){
      return MedicareCategName;
}
  @XmlElement(name = "MEDICARE_CATEG_NAME")
  public void setMedicareCategName(String medicareCategName) {
      this.MedicareCategName = medicareCategName;
  }

  public String getCurrAddr(){
      return CurrAddr;
}
  @XmlElement(name = "CURR_ADDR")
  public void setCurrAddr(String currAddr) {
      this.CurrAddr = currAddr;
  }

  public String getCurrAddrProvince(){
      return CurrAddrProvince;
}
  @XmlElement(name = "CURR_ADDR_PROVINCE")
  public void setCurrAddrProvince(String currAddrProvince) {
      this.CurrAddrProvince = currAddrProvince;
  }

  public String getCurrAddrCity(){
      return CurrAddrCity;
}
  @XmlElement(name = "CURR_ADDR_CITY")
  public void setCurrAddrCity(String currAddrCity) {
      this.CurrAddrCity = currAddrCity;
  }

  public String getCurrAddrCounty(){
      return CurrAddrCounty;
}
  @XmlElement(name = "CURR_ADDR_COUNTY")
  public void setCurrAddrCounty(String currAddrCounty) {
      this.CurrAddrCounty = currAddrCounty;
  }

  public String getCurrAddrTownship(){
      return CurrAddrTownship;
}
  @XmlElement(name = "CURR_ADDR_TOWNSHIP")
  public void setCurrAddrTownship(String currAddrTownship) {
      this.CurrAddrTownship = currAddrTownship;
  }

  public String getCurrAddrVillage(){
      return CurrAddrVillage;
}
  @XmlElement(name = "CURR_ADDR_VILLAGE")
  public void setCurrAddrVillage(String currAddrVillage) {
      this.CurrAddrVillage = currAddrVillage;
  }

  public String getCurrAddrZipCode(){
      return CurrAddrZipCode;
}
  @XmlElement(name = "CURR_ADDR_ZIP_CODE")
  public void setCurrAddrZipCode(String currAddrZipCode) {
      this.CurrAddrZipCode = currAddrZipCode;
  }

  public String getPhoneNo(){
      return PhoneNo;
}
  @XmlElement(name = "PHONE_NO")
  public void setPhoneNo(String phoneNo) {
      this.PhoneNo = phoneNo;
  }

  public String getIsregistmiFlag(){
      return IsregistmiFlag;
}
  @XmlElement(name = "ISREGISTMI_FLAG")
  public void setIsregistmiFlag(String isregistmiFlag) {
      this.IsregistmiFlag = isregistmiFlag;
  }

  public String getEmpiId(){
      return EmpiId;
}
  @XmlElement(name = "EMPI_ID")
  public void setEmpiId(String empiId) {
      this.EmpiId = empiId;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "PatIndexNo=" + PatIndexNo +
              "OuthospNo=" + OuthospNo +
              "PatName=" + PatName +
              "PhysiSexCode=" + PhysiSexCode +
              "DateBirth=" + DateBirth +
              "ContactPersonAddr=" + ContactPersonAddr +
              "ContactPersonAddrProvince=" + ContactPersonAddrProvince +
              "ContactPersonAddrCity=" + ContactPersonAddrCity +
              "ContactPersonAddrCounty=" + ContactPersonAddrCounty +
              "ContactPersonAddrTownship=" + ContactPersonAddrTownship +
              "ContactPersonAddrVillage=" + ContactPersonAddrVillage +
              "ContactPersonAddrZipCode=" + ContactPersonAddrZipCode +
              "ContactPhoneNo=" + ContactPhoneNo +
              "ContactCertificateType=" + ContactCertificateType +
              "ContactCertificateNo=" + ContactCertificateNo +
              "RecordDate=" + RecordDate +
              "OperStaffCode=" + OperStaffCode +
              "CertificateType=" + CertificateType +
              "CertificateNo=" + CertificateNo +
              "MedicareCategCode=" + MedicareCategCode +
              "MedicareCategName=" + MedicareCategName +
              "CurrAddr=" + CurrAddr +
              "CurrAddrProvince=" + CurrAddrProvince +
              "CurrAddrCity=" + CurrAddrCity +
              "CurrAddrCounty=" + CurrAddrCounty +
              "CurrAddrTownship=" + CurrAddrTownship +
              "CurrAddrVillage=" + CurrAddrVillage +
              "CurrAddrZipCode=" + CurrAddrZipCode +
              "PhoneNo=" + PhoneNo +
              "IsregistmiFlag=" + IsregistmiFlag +
              "EmpiId=" + EmpiId +
           '}';
  }
}