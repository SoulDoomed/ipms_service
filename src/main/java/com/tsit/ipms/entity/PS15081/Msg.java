package com.tsit.ipms.entity.PS15081;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Msg")
public class Msg  {

  private String  OutWarehouseNo;

  private String  ConsumptionDate;

  private String  PurchasePrice;

  private String  SalePrice;

  private String  ConsumptionAmount;

  private String  WarehouseCode;

  private String  WarehouseName;

  private String  SupplierCode;

  private String  SupplierName;

  private String  DeptCode;

  private String  DeptName;

  private String  ConsumablesRfidCode;

  private String  ChargeItemCode;

  private String  ChargeItemName;

  private String  PatIndexNo;

  private String  InhospNo;

  private String  InhospIndexNo;

  private String  ElectrRequisitionNo;

  private String  OuthospNo;

  private String  OuthospIndexNo;

  private String  OperDrCode;

  public String getOutWarehouseNo(){
      return OutWarehouseNo;
}
  @XmlElement(name = "OUT_WAREHOUSE_NO")
  public void setOutWarehouseNo(String outWarehouseNo) {
      this.OutWarehouseNo = outWarehouseNo;
  }

  public String getConsumptionDate(){
      return ConsumptionDate;
}
  @XmlElement(name = "CONSUMPTION_DATE")
  public void setConsumptionDate(String consumptionDate) {
      this.ConsumptionDate = consumptionDate;
  }

  public String getPurchasePrice(){
      return PurchasePrice;
}
  @XmlElement(name = "PURCHASE_PRICE")
  public void setPurchasePrice(String purchasePrice) {
      this.PurchasePrice = purchasePrice;
  }

  public String getSalePrice(){
      return SalePrice;
}
  @XmlElement(name = "SALE_PRICE")
  public void setSalePrice(String salePrice) {
      this.SalePrice = salePrice;
  }

  public String getConsumptionAmount(){
      return ConsumptionAmount;
}
  @XmlElement(name = "CONSUMPTION_AMOUNT")
  public void setConsumptionAmount(String consumptionAmount) {
      this.ConsumptionAmount = consumptionAmount;
  }

  public String getWarehouseCode(){
      return WarehouseCode;
}
  @XmlElement(name = "WAREHOUSE_CODE")
  public void setWarehouseCode(String warehouseCode) {
      this.WarehouseCode = warehouseCode;
  }

  public String getWarehouseName(){
      return WarehouseName;
}
  @XmlElement(name = "WAREHOUSE_NAME")
  public void setWarehouseName(String warehouseName) {
      this.WarehouseName = warehouseName;
  }

  public String getSupplierCode(){
      return SupplierCode;
}
  @XmlElement(name = "SUPPLIER_CODE")
  public void setSupplierCode(String supplierCode) {
      this.SupplierCode = supplierCode;
  }

  public String getSupplierName(){
      return SupplierName;
}
  @XmlElement(name = "SUPPLIER_NAME")
  public void setSupplierName(String supplierName) {
      this.SupplierName = supplierName;
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

  public String getConsumablesRfidCode(){
      return ConsumablesRfidCode;
}
  @XmlElement(name = "CONSUMABLES_RFID_CODE")
  public void setConsumablesRfidCode(String consumablesRfidCode) {
      this.ConsumablesRfidCode = consumablesRfidCode;
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

  public String getPatIndexNo(){
      return PatIndexNo;
}
  @XmlElement(name = "PAT_INDEX_NO")
  public void setPatIndexNo(String patIndexNo) {
      this.PatIndexNo = patIndexNo;
  }

  public String getInhospNo(){
      return InhospNo;
}
  @XmlElement(name = "INHOSP_NO")
  public void setInhospNo(String inhospNo) {
      this.InhospNo = inhospNo;
  }

  public String getInhospIndexNo(){
      return InhospIndexNo;
}
  @XmlElement(name = "INHOSP_INDEX_NO")
  public void setInhospIndexNo(String inhospIndexNo) {
      this.InhospIndexNo = inhospIndexNo;
  }

  public String getElectrRequisitionNo(){
      return ElectrRequisitionNo;
}
  @XmlElement(name = "ELECTR_REQUISITION_NO")
  public void setElectrRequisitionNo(String electrRequisitionNo) {
      this.ElectrRequisitionNo = electrRequisitionNo;
  }

  public String getOuthospNo(){
      return OuthospNo;
}
  @XmlElement(name = "OUTHOSP_NO")
  public void setOuthospNo(String outhospNo) {
      this.OuthospNo = outhospNo;
  }

  public String getOuthospIndexNo(){
      return OuthospIndexNo;
}
  @XmlElement(name = "OUTHOSP_INDEX_NO")
  public void setOuthospIndexNo(String outhospIndexNo) {
      this.OuthospIndexNo = outhospIndexNo;
  }

  public String getOperDrCode(){
      return OperDrCode;
}
  @XmlElement(name = "OPER_DR_CODE")
  public void setOperDrCode(String operDrCode) {
      this.OperDrCode = operDrCode;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "OutWarehouseNo=" + OutWarehouseNo +
              "ConsumptionDate=" + ConsumptionDate +
              "PurchasePrice=" + PurchasePrice +
              "SalePrice=" + SalePrice +
              "ConsumptionAmount=" + ConsumptionAmount +
              "WarehouseCode=" + WarehouseCode +
              "WarehouseName=" + WarehouseName +
              "SupplierCode=" + SupplierCode +
              "SupplierName=" + SupplierName +
              "DeptCode=" + DeptCode +
              "DeptName=" + DeptName +
              "ConsumablesRfidCode=" + ConsumablesRfidCode +
              "ChargeItemCode=" + ChargeItemCode +
              "ChargeItemName=" + ChargeItemName +
              "PatIndexNo=" + PatIndexNo +
              "InhospNo=" + InhospNo +
              "InhospIndexNo=" + InhospIndexNo +
              "ElectrRequisitionNo=" + ElectrRequisitionNo +
              "OuthospNo=" + OuthospNo +
              "OuthospIndexNo=" + OuthospIndexNo +
              "OperDrCode=" + OperDrCode +
           '}';
  }
}