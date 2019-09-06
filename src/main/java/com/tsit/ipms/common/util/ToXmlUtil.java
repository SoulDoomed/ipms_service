package com.tsit.ipms.common.util;


import com.thoughtworks.xstream.XStream;

/**
 * Created by zhaoyanzeng on 2019/9/3.
 */
public class ToXmlUtil {
  public static String toXml(Object obj){
        //调用过滤器处理为空字段的值，生成标签
        XStream xstream=new XStream();
        xstream.processAnnotations(obj.getClass()); //通过注解方式的，一定要有这句话
        return xstream.toXML(obj);

}}
