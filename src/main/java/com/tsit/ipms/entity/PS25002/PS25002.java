package com.tsit.ipms.entity.PS25002;

import com.tsit.ipms.entity.MessageHeader;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ESBEntry")
public class PS25002 {

  private MessageHeader messageHeader;

  private MsgInfo msgInfo;

  public MessageHeader getMessageHeader(){
      return messageHeader;
}
  @XmlElement(name = "MessageHeader")
  public void setMessageHeader(MessageHeader messageHeader) {
      this.messageHeader = messageHeader;
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
      return "PS25002{" +
              "messageHeader=" + messageHeader +

              "msgInfo=" + msgInfo +
           '}';
  }
}