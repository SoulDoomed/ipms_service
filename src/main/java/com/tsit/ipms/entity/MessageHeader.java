package com.tsit.ipms.entity;


import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * MQ消息头
 * Created by zhaoyanzeng on 2019/9/3.
 */
@XmlRootElement(name = "MessageHeader")
public class MessageHeader{
    /// <summary>
    /// 功能id
    /// </summary>
@XmlElement(name = "Fid")
    public String fid;
    /// <summary>
    /// 消息发送系统平台编码
    /// </summary>

    @XmlElement(name = "SourceSysCode")
    public String sourceSysCode;

    /// <summary>
    /// 回写标识  -1：不回写  0：回写服务 发起  1：回写服务，回写
    /// </summary>
    @XmlElement(name = "ReturnFlag")
    public short returnFlag;

    /// <summary>
    /// 消息接收者系统   TargetSysCode选填，有的情况下按照TargetSysCode发送，没有需到后台管理系统中查询消费系统，进行分发
    /// </summary>

    @XmlElement(name = "TargetSysCode")
    public String targetSysCode;

    /// <summary>
    /// 消息发送时间（取系统当前时间，格式：YYYY-MM-DD HH:MI:SS）
    /// </summary>
    @XmlElement(name = "MsgDate")
    public String msgDate;
    @XmlTransient
    public String getFid() {
        return fid;
    }
    public void setFid(String fid) {
        this.fid = fid;
    }
    @XmlTransient
    public String getSourceSysCode() {
        return sourceSysCode;
    }
    public void setSourceSysCode(String sourceSysCode) {
        this.sourceSysCode = sourceSysCode;
    }
    @XmlTransient
    public short getReturnFlag() {
        return returnFlag;
    }
    public void setReturnFlag(short returnFlag) {
        this.returnFlag = returnFlag;
    }
    @XmlTransient
    public String getTargetSysCode() {
        return targetSysCode;
    }
    public void setTargetSysCode(String targetSysCode) {
        this.targetSysCode = targetSysCode;
    }
    @XmlTransient
    public String getMsgDate() {
        return msgDate;
    }
    public void setMsgDate(String msgDate) {
        this.msgDate = msgDate;
    }

    @Override
    public String toString() {
        return "MessageHeader{" +
                "fid='" + fid + '\'' +
                ", sourceSysCode='" + sourceSysCode + '\'' +
                ", returnFlag=" + returnFlag +
                ", targetSysCode='" + targetSysCode + '\'' +
                ", msgDate='" + msgDate + '\'' +
                '}';
    }
}
