package com.tsit.ipms.entity.PS30001;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OuthospIndexNo;

  private String  VisitCardNo;

  private String  OuthospNo;

  private String  InhospIndexNo;

  private String  MrNo;

  private String  SurgeryNo;

  private String  ApplyDate;

  private String  SurgeryDate;

  private String  SurgeryRoomCode;

  private String  SurgeryRoomName;

  private String  SurgeryTableNum;

  private String  SurgeryOperCode;

  private String  SurgeryOperName;

  private String  SurgeryLevelCode;

  private String  SurgeryLevelName;

  private String  AnesMethodCode;

  private String  AnesMethodName;

  private String  SurgeryDrIndexNo;

  private String  SurgeryDrCode;

  private String  SurgeryDrName;

  private String  FirstSaDrIndexNo;

  private String  FirstSaDrCode;

  private String  FirstSaDrName;

  private String  SecondSaDrIndexNo;

  private String  SecondSaDrCode;

  private String  SecondSaDrName;

  private String  ThirdSaDrIndexNo;

  private String  ThirdSaDrCode;

  private String  ThirdSaDrName;

  private String  FourthSaDrIndexNo;

  private String  FourthSaDrCode;

  private String  FourthSaDrName;

  private String  AnesDrIndexNo;

  private String  AnesDrCode;

  private String  AnesDrName;

  private String  FirstAaDrIndexNo;

  private String  FirstAaDrCode;

  private String  FirstAaDrName;

  private String  SecondAaDrIndexNo;

  private String  SecondAaDrCode;

  private String  SecondAaDrName;

  private String  ThirdAaDrIndexNo;

  private String  ThirdAaDrCode;

  private String  ThirdAaDrName;

  private String  FourthAaDrIndexNo;

  private String  FourthAaDrCode;

  private String  FourthAaDrName;

  private String  BloodTransferDrIndexNo;

  private String  BloodTransferDrCode;

  private String  BloodTransferDrName;

  private String  RecordDrIndexNo;

  private String  RecordDrCode;

  private String  RecordDrName;

  private String  TourNurseIndexNo;

  private String  TourNurseCode;

  private String  TourNurseName;

  private String  InstrumentNurseIndexNo;

  private String  InstrumentNurseCode;

  private String  InstrumentNurseName;

  private String  SurgeryDeptIndexNo;

  private String  SurgeryDeptCode;

  private String  SurgeryDeptName;

  private String  PreSurgeryDiagCode;

  private String  PreSurgeryDiagName;

  private String  IdNumber;

  private String  PatName;

  private String  PhysiSexCode;

  private String  PhysiSexName;

  private String  DateBirth;

  private String  EthnicCode;

  private String  EthnicName;

  private String  MaritalStatusCode;

  private String  MaritalStatusName;

  private String  RecordDate;

  private String  UpdateDate;

  public String getOuthospIndexNo(){
      return OuthospIndexNo;
}
  @XmlElement(name = "OUTHOSP_INDEX_NO")
  public void setOuthospIndexNo(String outhospIndexNo) {
      this.OuthospIndexNo = outhospIndexNo;
  }

  public String getVisitCardNo(){
      return VisitCardNo;
}
  @XmlElement(name = "VISIT_CARD_NO")
  public void setVisitCardNo(String visitCardNo) {
      this.VisitCardNo = visitCardNo;
  }

  public String getOuthospNo(){
      return OuthospNo;
}
  @XmlElement(name = "OUTHOSP_NO")
  public void setOuthospNo(String outhospNo) {
      this.OuthospNo = outhospNo;
  }

  public String getInhospIndexNo(){
      return InhospIndexNo;
}
  @XmlElement(name = "INHOSP_INDEX_NO")
  public void setInhospIndexNo(String inhospIndexNo) {
      this.InhospIndexNo = inhospIndexNo;
  }

  public String getMrNo(){
      return MrNo;
}
  @XmlElement(name = "MR_NO")
  public void setMrNo(String mrNo) {
      this.MrNo = mrNo;
  }

  public String getSurgeryNo(){
      return SurgeryNo;
}
  @XmlElement(name = "SURGERY_NO")
  public void setSurgeryNo(String surgeryNo) {
      this.SurgeryNo = surgeryNo;
  }

  public String getApplyDate(){
      return ApplyDate;
}
  @XmlElement(name = "APPLY_DATE")
  public void setApplyDate(String applyDate) {
      this.ApplyDate = applyDate;
  }

  public String getSurgeryDate(){
      return SurgeryDate;
}
  @XmlElement(name = "SURGERY_DATE")
  public void setSurgeryDate(String surgeryDate) {
      this.SurgeryDate = surgeryDate;
  }

  public String getSurgeryRoomCode(){
      return SurgeryRoomCode;
}
  @XmlElement(name = "SURGERY_ROOM_CODE")
  public void setSurgeryRoomCode(String surgeryRoomCode) {
      this.SurgeryRoomCode = surgeryRoomCode;
  }

  public String getSurgeryRoomName(){
      return SurgeryRoomName;
}
  @XmlElement(name = "SURGERY_ROOM_NAME")
  public void setSurgeryRoomName(String surgeryRoomName) {
      this.SurgeryRoomName = surgeryRoomName;
  }

  public String getSurgeryTableNum(){
      return SurgeryTableNum;
}
  @XmlElement(name = "SURGERY_TABLE_NUM")
  public void setSurgeryTableNum(String surgeryTableNum) {
      this.SurgeryTableNum = surgeryTableNum;
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

  public String getSurgeryLevelCode(){
      return SurgeryLevelCode;
}
  @XmlElement(name = "SURGERY_LEVEL_CODE")
  public void setSurgeryLevelCode(String surgeryLevelCode) {
      this.SurgeryLevelCode = surgeryLevelCode;
  }

  public String getSurgeryLevelName(){
      return SurgeryLevelName;
}
  @XmlElement(name = "SURGERY_LEVEL_NAME")
  public void setSurgeryLevelName(String surgeryLevelName) {
      this.SurgeryLevelName = surgeryLevelName;
  }

  public String getAnesMethodCode(){
      return AnesMethodCode;
}
  @XmlElement(name = "ANES_METHOD_CODE")
  public void setAnesMethodCode(String anesMethodCode) {
      this.AnesMethodCode = anesMethodCode;
  }

  public String getAnesMethodName(){
      return AnesMethodName;
}
  @XmlElement(name = "ANES_METHOD_NAME")
  public void setAnesMethodName(String anesMethodName) {
      this.AnesMethodName = anesMethodName;
  }

  public String getSurgeryDrIndexNo(){
      return SurgeryDrIndexNo;
}
  @XmlElement(name = "SURGERY_DR_INDEX_NO")
  public void setSurgeryDrIndexNo(String surgeryDrIndexNo) {
      this.SurgeryDrIndexNo = surgeryDrIndexNo;
  }

  public String getSurgeryDrCode(){
      return SurgeryDrCode;
}
  @XmlElement(name = "SURGERY_DR_CODE")
  public void setSurgeryDrCode(String surgeryDrCode) {
      this.SurgeryDrCode = surgeryDrCode;
  }

  public String getSurgeryDrName(){
      return SurgeryDrName;
}
  @XmlElement(name = "SURGERY_DR_NAME")
  public void setSurgeryDrName(String surgeryDrName) {
      this.SurgeryDrName = surgeryDrName;
  }

  public String getFirstSaDrIndexNo(){
      return FirstSaDrIndexNo;
}
  @XmlElement(name = "FIRST_SA_DR_INDEX_NO")
  public void setFirstSaDrIndexNo(String firstSaDrIndexNo) {
      this.FirstSaDrIndexNo = firstSaDrIndexNo;
  }

  public String getFirstSaDrCode(){
      return FirstSaDrCode;
}
  @XmlElement(name = "FIRST_SA_DR_CODE")
  public void setFirstSaDrCode(String firstSaDrCode) {
      this.FirstSaDrCode = firstSaDrCode;
  }

  public String getFirstSaDrName(){
      return FirstSaDrName;
}
  @XmlElement(name = "FIRST_SA_DR_NAME")
  public void setFirstSaDrName(String firstSaDrName) {
      this.FirstSaDrName = firstSaDrName;
  }

  public String getSecondSaDrIndexNo(){
      return SecondSaDrIndexNo;
}
  @XmlElement(name = "SECOND_SA_DR_INDEX_NO")
  public void setSecondSaDrIndexNo(String secondSaDrIndexNo) {
      this.SecondSaDrIndexNo = secondSaDrIndexNo;
  }

  public String getSecondSaDrCode(){
      return SecondSaDrCode;
}
  @XmlElement(name = "SECOND_SA_DR_CODE")
  public void setSecondSaDrCode(String secondSaDrCode) {
      this.SecondSaDrCode = secondSaDrCode;
  }

  public String getSecondSaDrName(){
      return SecondSaDrName;
}
  @XmlElement(name = "SECOND_SA_DR_NAME")
  public void setSecondSaDrName(String secondSaDrName) {
      this.SecondSaDrName = secondSaDrName;
  }

  public String getThirdSaDrIndexNo(){
      return ThirdSaDrIndexNo;
}
  @XmlElement(name = "THIRD_SA_DR_INDEX_NO")
  public void setThirdSaDrIndexNo(String thirdSaDrIndexNo) {
      this.ThirdSaDrIndexNo = thirdSaDrIndexNo;
  }

  public String getThirdSaDrCode(){
      return ThirdSaDrCode;
}
  @XmlElement(name = "THIRD_SA_DR_CODE")
  public void setThirdSaDrCode(String thirdSaDrCode) {
      this.ThirdSaDrCode = thirdSaDrCode;
  }

  public String getThirdSaDrName(){
      return ThirdSaDrName;
}
  @XmlElement(name = "THIRD_SA_DR_NAME")
  public void setThirdSaDrName(String thirdSaDrName) {
      this.ThirdSaDrName = thirdSaDrName;
  }

  public String getFourthSaDrIndexNo(){
      return FourthSaDrIndexNo;
}
  @XmlElement(name = "FOURTH_SA_DR_INDEX_NO")
  public void setFourthSaDrIndexNo(String fourthSaDrIndexNo) {
      this.FourthSaDrIndexNo = fourthSaDrIndexNo;
  }

  public String getFourthSaDrCode(){
      return FourthSaDrCode;
}
  @XmlElement(name = "FOURTH_SA_DR_CODE")
  public void setFourthSaDrCode(String fourthSaDrCode) {
      this.FourthSaDrCode = fourthSaDrCode;
  }

  public String getFourthSaDrName(){
      return FourthSaDrName;
}
  @XmlElement(name = "FOURTH_SA_DR_NAME")
  public void setFourthSaDrName(String fourthSaDrName) {
      this.FourthSaDrName = fourthSaDrName;
  }

  public String getAnesDrIndexNo(){
      return AnesDrIndexNo;
}
  @XmlElement(name = "ANES_DR_INDEX_NO")
  public void setAnesDrIndexNo(String anesDrIndexNo) {
      this.AnesDrIndexNo = anesDrIndexNo;
  }

  public String getAnesDrCode(){
      return AnesDrCode;
}
  @XmlElement(name = "ANES_DR_CODE")
  public void setAnesDrCode(String anesDrCode) {
      this.AnesDrCode = anesDrCode;
  }

  public String getAnesDrName(){
      return AnesDrName;
}
  @XmlElement(name = "ANES_DR_NAME")
  public void setAnesDrName(String anesDrName) {
      this.AnesDrName = anesDrName;
  }

  public String getFirstAaDrIndexNo(){
      return FirstAaDrIndexNo;
}
  @XmlElement(name = "FIRST_AA_DR_INDEX_NO")
  public void setFirstAaDrIndexNo(String firstAaDrIndexNo) {
      this.FirstAaDrIndexNo = firstAaDrIndexNo;
  }

  public String getFirstAaDrCode(){
      return FirstAaDrCode;
}
  @XmlElement(name = "FIRST_AA_DR_CODE")
  public void setFirstAaDrCode(String firstAaDrCode) {
      this.FirstAaDrCode = firstAaDrCode;
  }

  public String getFirstAaDrName(){
      return FirstAaDrName;
}
  @XmlElement(name = "FIRST_AA_DR_NAME")
  public void setFirstAaDrName(String firstAaDrName) {
      this.FirstAaDrName = firstAaDrName;
  }

  public String getSecondAaDrIndexNo(){
      return SecondAaDrIndexNo;
}
  @XmlElement(name = "SECOND_AA_DR_INDEX_NO")
  public void setSecondAaDrIndexNo(String secondAaDrIndexNo) {
      this.SecondAaDrIndexNo = secondAaDrIndexNo;
  }

  public String getSecondAaDrCode(){
      return SecondAaDrCode;
}
  @XmlElement(name = "SECOND_AA_DR_CODE")
  public void setSecondAaDrCode(String secondAaDrCode) {
      this.SecondAaDrCode = secondAaDrCode;
  }

  public String getSecondAaDrName(){
      return SecondAaDrName;
}
  @XmlElement(name = "SECOND_AA_DR_NAME")
  public void setSecondAaDrName(String secondAaDrName) {
      this.SecondAaDrName = secondAaDrName;
  }

  public String getThirdAaDrIndexNo(){
      return ThirdAaDrIndexNo;
}
  @XmlElement(name = "THIRD_AA_DR_INDEX_NO")
  public void setThirdAaDrIndexNo(String thirdAaDrIndexNo) {
      this.ThirdAaDrIndexNo = thirdAaDrIndexNo;
  }

  public String getThirdAaDrCode(){
      return ThirdAaDrCode;
}
  @XmlElement(name = "THIRD_AA_DR_CODE")
  public void setThirdAaDrCode(String thirdAaDrCode) {
      this.ThirdAaDrCode = thirdAaDrCode;
  }

  public String getThirdAaDrName(){
      return ThirdAaDrName;
}
  @XmlElement(name = "THIRD_AA_DR_NAME")
  public void setThirdAaDrName(String thirdAaDrName) {
      this.ThirdAaDrName = thirdAaDrName;
  }

  public String getFourthAaDrIndexNo(){
      return FourthAaDrIndexNo;
}
  @XmlElement(name = "FOURTH_AA_DR_INDEX_NO")
  public void setFourthAaDrIndexNo(String fourthAaDrIndexNo) {
      this.FourthAaDrIndexNo = fourthAaDrIndexNo;
  }

  public String getFourthAaDrCode(){
      return FourthAaDrCode;
}
  @XmlElement(name = "FOURTH_AA_DR_CODE")
  public void setFourthAaDrCode(String fourthAaDrCode) {
      this.FourthAaDrCode = fourthAaDrCode;
  }

  public String getFourthAaDrName(){
      return FourthAaDrName;
}
  @XmlElement(name = "FOURTH_AA_DR_NAME")
  public void setFourthAaDrName(String fourthAaDrName) {
      this.FourthAaDrName = fourthAaDrName;
  }

  public String getBloodTransferDrIndexNo(){
      return BloodTransferDrIndexNo;
}
  @XmlElement(name = "BLOOD_TRANSFER_DR_INDEX_NO")
  public void setBloodTransferDrIndexNo(String bloodTransferDrIndexNo) {
      this.BloodTransferDrIndexNo = bloodTransferDrIndexNo;
  }

  public String getBloodTransferDrCode(){
      return BloodTransferDrCode;
}
  @XmlElement(name = "BLOOD_TRANSFER_DR_CODE")
  public void setBloodTransferDrCode(String bloodTransferDrCode) {
      this.BloodTransferDrCode = bloodTransferDrCode;
  }

  public String getBloodTransferDrName(){
      return BloodTransferDrName;
}
  @XmlElement(name = "BLOOD_TRANSFER_DR_NAME")
  public void setBloodTransferDrName(String bloodTransferDrName) {
      this.BloodTransferDrName = bloodTransferDrName;
  }

  public String getRecordDrIndexNo(){
      return RecordDrIndexNo;
}
  @XmlElement(name = "RECORD_DR_INDEX_NO")
  public void setRecordDrIndexNo(String recordDrIndexNo) {
      this.RecordDrIndexNo = recordDrIndexNo;
  }

  public String getRecordDrCode(){
      return RecordDrCode;
}
  @XmlElement(name = "RECORD_DR_CODE")
  public void setRecordDrCode(String recordDrCode) {
      this.RecordDrCode = recordDrCode;
  }

  public String getRecordDrName(){
      return RecordDrName;
}
  @XmlElement(name = "RECORD_DR_NAME")
  public void setRecordDrName(String recordDrName) {
      this.RecordDrName = recordDrName;
  }

  public String getTourNurseIndexNo(){
      return TourNurseIndexNo;
}
  @XmlElement(name = "TOUR_NURSE_INDEX_NO")
  public void setTourNurseIndexNo(String tourNurseIndexNo) {
      this.TourNurseIndexNo = tourNurseIndexNo;
  }

  public String getTourNurseCode(){
      return TourNurseCode;
}
  @XmlElement(name = "TOUR_NURSE_CODE")
  public void setTourNurseCode(String tourNurseCode) {
      this.TourNurseCode = tourNurseCode;
  }

  public String getTourNurseName(){
      return TourNurseName;
}
  @XmlElement(name = "TOUR_NURSE_NAME")
  public void setTourNurseName(String tourNurseName) {
      this.TourNurseName = tourNurseName;
  }

  public String getInstrumentNurseIndexNo(){
      return InstrumentNurseIndexNo;
}
  @XmlElement(name = "INSTRUMENT_NURSE_INDEX_NO")
  public void setInstrumentNurseIndexNo(String instrumentNurseIndexNo) {
      this.InstrumentNurseIndexNo = instrumentNurseIndexNo;
  }

  public String getInstrumentNurseCode(){
      return InstrumentNurseCode;
}
  @XmlElement(name = "INSTRUMENT_NURSE_CODE")
  public void setInstrumentNurseCode(String instrumentNurseCode) {
      this.InstrumentNurseCode = instrumentNurseCode;
  }

  public String getInstrumentNurseName(){
      return InstrumentNurseName;
}
  @XmlElement(name = "INSTRUMENT_NURSE_NAME")
  public void setInstrumentNurseName(String instrumentNurseName) {
      this.InstrumentNurseName = instrumentNurseName;
  }

  public String getSurgeryDeptIndexNo(){
      return SurgeryDeptIndexNo;
}
  @XmlElement(name = "SURGERY_DEPT_INDEX_NO")
  public void setSurgeryDeptIndexNo(String surgeryDeptIndexNo) {
      this.SurgeryDeptIndexNo = surgeryDeptIndexNo;
  }

  public String getSurgeryDeptCode(){
      return SurgeryDeptCode;
}
  @XmlElement(name = "SURGERY_DEPT_CODE")
  public void setSurgeryDeptCode(String surgeryDeptCode) {
      this.SurgeryDeptCode = surgeryDeptCode;
  }

  public String getSurgeryDeptName(){
      return SurgeryDeptName;
}
  @XmlElement(name = "SURGERY_DEPT_NAME")
  public void setSurgeryDeptName(String surgeryDeptName) {
      this.SurgeryDeptName = surgeryDeptName;
  }

  public String getPreSurgeryDiagCode(){
      return PreSurgeryDiagCode;
}
  @XmlElement(name = "PRE_SURGERY_DIAG_CODE")
  public void setPreSurgeryDiagCode(String preSurgeryDiagCode) {
      this.PreSurgeryDiagCode = preSurgeryDiagCode;
  }

  public String getPreSurgeryDiagName(){
      return PreSurgeryDiagName;
}
  @XmlElement(name = "PRE_SURGERY_DIAG_NAME")
  public void setPreSurgeryDiagName(String preSurgeryDiagName) {
      this.PreSurgeryDiagName = preSurgeryDiagName;
  }

  public String getIdNumber(){
      return IdNumber;
}
  @XmlElement(name = "ID_NUMBER")
  public void setIdNumber(String idNumber) {
      this.IdNumber = idNumber;
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

  public String getPhysiSexName(){
      return PhysiSexName;
}
  @XmlElement(name = "PHYSI_SEX_NAME")
  public void setPhysiSexName(String physiSexName) {
      this.PhysiSexName = physiSexName;
  }

  public String getDateBirth(){
      return DateBirth;
}
  @XmlElement(name = "DATE_BIRTH")
  public void setDateBirth(String dateBirth) {
      this.DateBirth = dateBirth;
  }

  public String getEthnicCode(){
      return EthnicCode;
}
  @XmlElement(name = "ETHNIC_CODE")
  public void setEthnicCode(String ethnicCode) {
      this.EthnicCode = ethnicCode;
  }

  public String getEthnicName(){
      return EthnicName;
}
  @XmlElement(name = "ETHNIC_NAME")
  public void setEthnicName(String ethnicName) {
      this.EthnicName = ethnicName;
  }

  public String getMaritalStatusCode(){
      return MaritalStatusCode;
}
  @XmlElement(name = "MARITAL_STATUS_CODE")
  public void setMaritalStatusCode(String maritalStatusCode) {
      this.MaritalStatusCode = maritalStatusCode;
  }

  public String getMaritalStatusName(){
      return MaritalStatusName;
}
  @XmlElement(name = "MARITAL_STATUS_NAME")
  public void setMaritalStatusName(String maritalStatusName) {
      this.MaritalStatusName = maritalStatusName;
  }

  public String getRecordDate(){
      return RecordDate;
}
  @XmlElement(name = "RECORD_DATE")
  public void setRecordDate(String recordDate) {
      this.RecordDate = recordDate;
  }

  public String getUpdateDate(){
      return UpdateDate;
}
  @XmlElement(name = "UPDATE_DATE")
  public void setUpdateDate(String updateDate) {
      this.UpdateDate = updateDate;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "OuthospIndexNo=" + OuthospIndexNo +
              "VisitCardNo=" + VisitCardNo +
              "OuthospNo=" + OuthospNo +
              "InhospIndexNo=" + InhospIndexNo +
              "MrNo=" + MrNo +
              "SurgeryNo=" + SurgeryNo +
              "ApplyDate=" + ApplyDate +
              "SurgeryDate=" + SurgeryDate +
              "SurgeryRoomCode=" + SurgeryRoomCode +
              "SurgeryRoomName=" + SurgeryRoomName +
              "SurgeryTableNum=" + SurgeryTableNum +
              "SurgeryOperCode=" + SurgeryOperCode +
              "SurgeryOperName=" + SurgeryOperName +
              "SurgeryLevelCode=" + SurgeryLevelCode +
              "SurgeryLevelName=" + SurgeryLevelName +
              "AnesMethodCode=" + AnesMethodCode +
              "AnesMethodName=" + AnesMethodName +
              "SurgeryDrIndexNo=" + SurgeryDrIndexNo +
              "SurgeryDrCode=" + SurgeryDrCode +
              "SurgeryDrName=" + SurgeryDrName +
              "FirstSaDrIndexNo=" + FirstSaDrIndexNo +
              "FirstSaDrCode=" + FirstSaDrCode +
              "FirstSaDrName=" + FirstSaDrName +
              "SecondSaDrIndexNo=" + SecondSaDrIndexNo +
              "SecondSaDrCode=" + SecondSaDrCode +
              "SecondSaDrName=" + SecondSaDrName +
              "ThirdSaDrIndexNo=" + ThirdSaDrIndexNo +
              "ThirdSaDrCode=" + ThirdSaDrCode +
              "ThirdSaDrName=" + ThirdSaDrName +
              "FourthSaDrIndexNo=" + FourthSaDrIndexNo +
              "FourthSaDrCode=" + FourthSaDrCode +
              "FourthSaDrName=" + FourthSaDrName +
              "AnesDrIndexNo=" + AnesDrIndexNo +
              "AnesDrCode=" + AnesDrCode +
              "AnesDrName=" + AnesDrName +
              "FirstAaDrIndexNo=" + FirstAaDrIndexNo +
              "FirstAaDrCode=" + FirstAaDrCode +
              "FirstAaDrName=" + FirstAaDrName +
              "SecondAaDrIndexNo=" + SecondAaDrIndexNo +
              "SecondAaDrCode=" + SecondAaDrCode +
              "SecondAaDrName=" + SecondAaDrName +
              "ThirdAaDrIndexNo=" + ThirdAaDrIndexNo +
              "ThirdAaDrCode=" + ThirdAaDrCode +
              "ThirdAaDrName=" + ThirdAaDrName +
              "FourthAaDrIndexNo=" + FourthAaDrIndexNo +
              "FourthAaDrCode=" + FourthAaDrCode +
              "FourthAaDrName=" + FourthAaDrName +
              "BloodTransferDrIndexNo=" + BloodTransferDrIndexNo +
              "BloodTransferDrCode=" + BloodTransferDrCode +
              "BloodTransferDrName=" + BloodTransferDrName +
              "RecordDrIndexNo=" + RecordDrIndexNo +
              "RecordDrCode=" + RecordDrCode +
              "RecordDrName=" + RecordDrName +
              "TourNurseIndexNo=" + TourNurseIndexNo +
              "TourNurseCode=" + TourNurseCode +
              "TourNurseName=" + TourNurseName +
              "InstrumentNurseIndexNo=" + InstrumentNurseIndexNo +
              "InstrumentNurseCode=" + InstrumentNurseCode +
              "InstrumentNurseName=" + InstrumentNurseName +
              "SurgeryDeptIndexNo=" + SurgeryDeptIndexNo +
              "SurgeryDeptCode=" + SurgeryDeptCode +
              "SurgeryDeptName=" + SurgeryDeptName +
              "PreSurgeryDiagCode=" + PreSurgeryDiagCode +
              "PreSurgeryDiagName=" + PreSurgeryDiagName +
              "IdNumber=" + IdNumber +
              "PatName=" + PatName +
              "PhysiSexCode=" + PhysiSexCode +
              "PhysiSexName=" + PhysiSexName +
              "DateBirth=" + DateBirth +
              "EthnicCode=" + EthnicCode +
              "EthnicName=" + EthnicName +
              "MaritalStatusCode=" + MaritalStatusCode +
              "MaritalStatusName=" + MaritalStatusName +
              "RecordDate=" + RecordDate +
              "UpdateDate=" + UpdateDate +
           '}';
  }
}