package com.tsit.ipms.entity.PS35011_1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "MsgDetail")
public class MsgDetail  {

  private String  ChargeItemCode;

  private String  AMOUNT;

  private String  FounderNo;

  public String getChargeItemCode(){
      return ChargeItemCode;
}
  @XmlElement(name = "CHARGE_ITEM_CODE")
  public void setChargeItemCode(String chargeItemCode) {
      this.ChargeItemCode = chargeItemCode;
  }

  public String getAMOUNT(){
      return AMOUNT;
}
  @XmlElement(name = "AMOUNT")
  public void setAMOUNT(String aMOUNT) {
      this.AMOUNT = aMOUNT;
  }

  public String getFounderNo(){
      return FounderNo;
}
  @XmlElement(name = "FOUNDER_NO")
  public void setFounderNo(String founderNo) {
      this.FounderNo = founderNo;
  }




  @Override
  public String toString() {
      return "MsgDetail{" +
              "ChargeItemCode=" + ChargeItemCode +
              "AMOUNT=" + AMOUNT +
              "FounderNo=" + FounderNo +
           '}';
  }
}