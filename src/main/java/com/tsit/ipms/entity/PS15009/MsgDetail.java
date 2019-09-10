package com.tsit.ipms.entity.PS15009;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  ChargeDetailNo;

  private String  ChargeItemCode;

  private String  ChargeItemName;

  private String  UnitPrice;

  private String  AMOUNT;

  private String  TotalMoney;

  private String  PresItemTypeCode;

  private String  OriginalAmount;

  public String getChargeDetailNo(){
      return ChargeDetailNo;
}
  @XmlElement(name = "CHARGE_DETAIL_NO")
  public void setChargeDetailNo(String chargeDetailNo) {
      this.ChargeDetailNo = chargeDetailNo;
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

  public String getUnitPrice(){
      return UnitPrice;
}
  @XmlElement(name = "UNIT_PRICE")
  public void setUnitPrice(String unitPrice) {
      this.UnitPrice = unitPrice;
  }

  public String getAMOUNT(){
      return AMOUNT;
}
  @XmlElement(name = "AMOUNT")
  public void setAMOUNT(String aMOUNT) {
      this.AMOUNT = aMOUNT;
  }

  public String getTotalMoney(){
      return TotalMoney;
}
  @XmlElement(name = "TOTAL_MONEY")
  public void setTotalMoney(String totalMoney) {
      this.TotalMoney = totalMoney;
  }

  public String getPresItemTypeCode(){
      return PresItemTypeCode;
}
  @XmlElement(name = "PRES_ITEM_TYPE_CODE")
  public void setPresItemTypeCode(String presItemTypeCode) {
      this.PresItemTypeCode = presItemTypeCode;
  }

  public String getOriginalAmount(){
      return OriginalAmount;
}
  @XmlElement(name = "ORIGINAL_AMOUNT")
  public void setOriginalAmount(String originalAmount) {
      this.OriginalAmount = originalAmount;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "ChargeDetailNo=" + ChargeDetailNo +
              "ChargeItemCode=" + ChargeItemCode +
              "ChargeItemName=" + ChargeItemName +
              "UnitPrice=" + UnitPrice +
              "AMOUNT=" + AMOUNT +
              "TotalMoney=" + TotalMoney +
              "PresItemTypeCode=" + PresItemTypeCode +
              "OriginalAmount=" + OriginalAmount +
           '}';
  }
}