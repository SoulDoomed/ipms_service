package com.tsit.ipms.entity.PS02041;






import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "MsgInfo")
public class MsgInfo {

    private Msg msg;

    public Msg getMsg() {
        return msg;
    }
    @XmlElement(name = "Msg")
    public void setMsg(Msg msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MsgInfo{" +
                "msg=" + msg +
                '}';
    }
}
