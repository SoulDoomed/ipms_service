package com.tsit.ipms.entity.PS05009;

import com.tsit.ipms.entity.MessageHeader;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ESBEntry")
public class PS05009 {
    //TODO 缺少一个实体类

  private MessageHeader messageHeader;

  private ResponseOption responseOption;

  private MsgInfo msgInfo;

  public MessageHeader getMessageHeader(){
      return messageHeader;
}
  @XmlElement(name = "MessageHeader")
  public void setMessageHeader(MessageHeader messageHeader) {
      this.messageHeader = messageHeader;
  }

  public ResponseOption getResponseOption(){
      return responseOption;
}
  @XmlElement(name = "ResponseOption")
  public void setResponseOption(ResponseOption responseOption) {
      this.responseOption = responseOption;
  }

  public MsgInfo getMsgInfo(){
      return msgInfo;
}
  @XmlElement(name = "MsgInfo")
  public void setMsgInfo(MsgInfo msgInfo) {
      this.msgInfo = msgInfo;
  }




  @Override
  public String toString() {
      return "PS05009{" +
              "messageHeader=" + messageHeader +

              "responseOption=" + responseOption +

              "msgInfo=" + msgInfo +
           '}';
  }
}