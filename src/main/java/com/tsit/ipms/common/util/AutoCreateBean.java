package com.tsit.ipms.common.util;

import com.thoughtworks.xstream.XStream;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.*;

/**
 * 根據xml生成实体类
 * Created by zhaoyanzeng on 2019/9/4.
 */
public class AutoCreateBean {

    //生成对象的包路径
    private static String packageStr = "com.tsit.ipms.entity";
    //"/Users/cktk/Documents/ts-it/ipms_service/src/main/java/com/tsit/ipms/entity"
   //保存文件的路径


   final static File javaBeanPath = new File(System.getProperty("user.dir") + "/src/main/java/" + packageStr.replace(".", "/"));



    private static boolean isOverwrite = false;





    /**
     * 解析xml文件
     *
     * @param xmlPath          XML文件
     *
     *
     *
     *
     *
     *
     */
    public static void createBean(File xmlPath) throws Exception {

        System.out.println(xmlPath.getPath());
        SAXReader reader = new SAXReader();

        Document document = reader.read(xmlPath);


        Element elemRoot = document.getRootElement();//根结点
        List<Element> one = elemRoot.elements();//所有子节点
        //创建PSXXXXX.java文件
      creatPS(one, xmlPath);
        int cont =0;
        //获取的是一级子标签
        List<Element>  elementsMsg = new ArrayList<>();  //msg元素标签


        for (Element element : one) {
            List<Element> elements = element.elements();
            for (Element elementTwo : elements) {
                List<Element>  elements3 = elementTwo.elements();



                for (Element element1 : elements3) {
                    if (!element1.getName().equals("DETAIL")){
                        elementsMsg.add(element1);

                    }

                }
                List<Element> elements1 = elementTwo.elements("DETAIL");
                for (Element element2 : elements1) {
                    //获取所有的DETAIL元素的子标签
                    List<Element> elements2 = element2.elements();
                    //DETAIL的子标签是一样的所以只要一个就行
                    if (cont==0){  //DETAIL元素的子标签是一样的所以创建MsgDetail文件一次就行
                       createMsgDetail(elements2,xmlPath);
                        cont++;
                    }

                }


            }
        }

        createMsg(elementsMsg,xmlPath);
        createMsgInfo(xmlPath);

    }

    private static void createMsgInfo(File xmlPath) {
        String str ="package com.tsit.ipms.entity."+getFileName(xmlPath)+";\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "import javax.xml.bind.annotation.XmlElement;\n" +
                "import javax.xml.bind.annotation.XmlRootElement;\n" +
                "\n" +
                "\n" +
                "@XmlRootElement(name = \"MsgInfo\")\n" +
                "public class MsgInfo {\n" +
                "\n" +
                "    private Msg msg;\n" +
                "\n" +
                "    public Msg getMsg() {\n" +
                "        return msg;\n" +
                "    }\n" +
                "    @XmlElement(name = \"Msg\")\n" +
                "    public void setMsg(Msg msg) {\n" +
                "        this.msg = msg;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public String toString() {\n" +
                "        return \"MsgInfo{\" +\n" +
                "                \"msg=\" + msg +\n" +
                "                '}';\n" +
                "    }\n" +
                "}\n";

        try {
            FileWriter fileWriter = new FileWriter(getBeanPath(xmlPath)+"/MsgInfo.java", true);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * 创建MSg
     * @param elements
     * @param xmlPath
     */
    private static void createMsg(List<Element> elements, File xmlPath) {

        HashSet<String> strings1 = new HashSet<>();
        for (Element element : elements) {
            String name = element.getName();
            System.out.println(name);
            strings1.add(name);
        }



        String fileName = getBeanPath(xmlPath);//获取javabean储存的路径
        String dir =  fileName +"/Msg.java";


        try {
            FileWriter fileWriter = new FileWriter(dir, true);
            fileWriter.write("package " + packageStr + "." + getFileName(xmlPath) + ";\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("import javax.xml.bind.annotation.XmlElement;" + "\r\n");
            fileWriter.write("import javax.xml.bind.annotation.XmlRootElement;" + "\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("@XmlRootElement(name = \"Msg\")");
            fileWriter.write("\r\n");
            fileWriter.write("public class Msg  {");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            for (Element element : elements) {
                String s = camelName(element.getName());//小写的
                fileWriter.write("  private String  " + toUpperCaseFirstOne(s) + ";\r\n");
                fileWriter.write("\r\n");
            }
            //getset方法
            for (Element element : elements) {
                String s = camelName(element.getName());//小写的
                fileWriter.write("  public String get" + toUpperCaseFirstOne(s) + "(){");
                fileWriter.write("\r\n");
                fileWriter.write("      return " + toUpperCaseFirstOne(s) + ";\r\n");
                fileWriter.write("}");
                fileWriter.write("\r\n");
                fileWriter.write("  @XmlElement(name = \"" + element.getName() + "\")");
                fileWriter.write("\r\n");
                fileWriter.write("  public void set" + toUpperCaseFirstOne(s) + "(" + "String "  + s + ") {");
                fileWriter.write("\r\n");
                fileWriter.write("      this." + toUpperCaseFirstOne(s) + " = " + s + ";\r\n");
                fileWriter.write("  }");
                fileWriter.write("\r\n");
                fileWriter.write("\r\n");
            }
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("  @Override\r\n");
            fileWriter.write("  public String toString() {\r\n");
            fileWriter.write("      return \"" +"MsgDetail" + "{\" +");
            String[] arr = new String[elements.size()];

            for (int i = 0; i < elements.size(); i++) {
                String s = camelName(elements.get(i).getName());//小写的
                fileWriter.write("\r\n");
                fileWriter.write("              \"" + toUpperCaseFirstOne(s) + "=\" + " + toUpperCaseFirstOne(s) + " +");
                if (i == elements.size() - 1) {
                    fileWriter.write("\r\n");
                    fileWriter.write("           '}';");
                    fileWriter.write("\r\n");
                }
            }
            fileWriter.write("  }");
            fileWriter.write("\r\n");
            fileWriter.write("}");
            //循环外
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }


    /**
     * 创建MsgDetail文件
     * @param elements 需要创建javaBean的标签名称
     * @param xmlPath
     */
    private static void createMsgDetail(  List<Element> elements , File xmlPath) {

        Map<String, String> linkedHashMap = new HashMap<>();
        HashSet<String> strings1 = new HashSet<>();
        for (Element element : elements) {
            String name = element.getName();
            System.out.println(name);
            strings1.add(name);
        }



        String fileName = getBeanPath(xmlPath);//获取javabean储存的路径
        String dir =  fileName +"/MsgDetail.java";


        try {
            FileWriter fileWriter = new FileWriter(dir, true);
            fileWriter.write("package " + packageStr + "." + getFileName(xmlPath) + ";\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("import javax.xml.bind.annotation.XmlElement;" + "\r\n");
            fileWriter.write("import javax.xml.bind.annotation.XmlRootElement;" + "\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("@XmlRootElement(name = \"MsgDetail\")");
            fileWriter.write("\r\n");
            fileWriter.write("public class MsgDetail  {");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            for (Element element : elements) {
                String s = camelName(element.getName());//小写的
                fileWriter.write("  private String  " + toUpperCaseFirstOne(s) + ";\r\n");
                fileWriter.write("\r\n");
            }
            //getset方法
            for (Element element : elements) {
                String s = camelName(element.getName());//小写的
                fileWriter.write("  public String get" + toUpperCaseFirstOne(s) + "(){");
                fileWriter.write("\r\n");
                fileWriter.write("      return " + toUpperCaseFirstOne(s) + ";\r\n");
                fileWriter.write("}");
                fileWriter.write("\r\n");
                fileWriter.write("  @XmlElement(name = \"" + element.getName() + "\")");
                fileWriter.write("\r\n");
                fileWriter.write("  public void set" + toUpperCaseFirstOne(s) + "(" + "String "  + s + ") {");
                fileWriter.write("\r\n");
                fileWriter.write("      this." + toUpperCaseFirstOne(s) + " = " + s + ";\r\n");
                fileWriter.write("  }");
                fileWriter.write("\r\n");
                fileWriter.write("\r\n");
            }
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("  @Override\r\n");
            fileWriter.write("  public String toString() {\r\n");
            fileWriter.write("      return \"" +"MsgDetail" + "{\" +");
            String[] arr = new String[elements.size()];

            for (int i = 0; i < elements.size(); i++) {
                String s = camelName(elements.get(i).getName());//小写的
                fileWriter.write("\r\n");
                fileWriter.write("              \"" + toUpperCaseFirstOne(s) + "=\" + " + toUpperCaseFirstOne(s) + " +");
                if (i == elements.size() - 1) {
                    fileWriter.write("\r\n");
                    fileWriter.write("           '}';");
                    fileWriter.write("\r\n");
                }
            }
            fileWriter.write("  }");
            fileWriter.write("\r\n");
            fileWriter.write("}");
            //循环外
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    /**
     * //生成PSxxxx.java
     *
     * @param elements 节点元素
     * @param xmlPath     xml文件路径
     */
    public static void creatPS(List<Element> elements  ,File xmlPath) {


        String fileName = getBeanPath(xmlPath);//获取javabean储存的路径

        String dir =  fileName +"/"+getFileName(xmlPath) + ".java";

        try {
            FileWriter fileWriter = new FileWriter(dir, true);
            fileWriter.write("package " + packageStr + "." + getFileName(xmlPath) + ";\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("import com.tsit.ipms.entity." + elements.get(0).getName() + ";\r\n");
            fileWriter.write("import javax.xml.bind.annotation.XmlElement;" + "\r\n");
            fileWriter.write("import javax.xml.bind.annotation.XmlRootElement;" + "\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("@XmlRootElement(name = \"ESBEntry\")");
            fileWriter.write("\r\n");
            fileWriter.write("public class " + getFileName(xmlPath) + " {");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            for (Element element : elements) {
                fileWriter.write("  private " + element.getName() + " " + toLowerCaseFirstOne(element.getName()) + ";\r\n");
                fileWriter.write("\r\n");
            }
            for (Element element : elements) {
                fileWriter.write("  public " + element.getName() + " get" + element.getName() + "(){");
                fileWriter.write("\r\n");
                fileWriter.write("      return " + toLowerCaseFirstOne(element.getName()) + ";\r\n");
                fileWriter.write("}");
                fileWriter.write("\r\n");
                fileWriter.write("  @XmlElement(name = \"" + element.getName() + "\")");
                fileWriter.write("\r\n");
                fileWriter.write("  public void set" + element.getName() + "(" + element.getName() + " " + toLowerCaseFirstOne(element.getName()) + ") {");
                fileWriter.write("\r\n");
                fileWriter.write("      this." + toLowerCaseFirstOne(element.getName()) + " = " + toLowerCaseFirstOne(element.getName()) + ";\r\n");
                fileWriter.write("  }");
                fileWriter.write("\r\n");
                fileWriter.write("\r\n");
            }
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");
            fileWriter.write("\r\n");

            fileWriter.write("  @Override\r\n");
            fileWriter.write("  public String toString() {\r\n");
            fileWriter.write("      return \"" + getFileName(xmlPath) + "{\" +");
            String[] arr = new String[elements.size()];

            for (int i = 0; i < elements.size(); i++) {
                fileWriter.write("\r\n");
                fileWriter.write("              \"" + toLowerCaseFirstOne(elements.get(i).getName()) + "=\" + " + toLowerCaseFirstOne(elements.get(i).getName()) + " +");
                fileWriter.write("\r\n");
                if (i == elements.size() - 1) {
                    fileWriter.write("           '}';");
                    fileWriter.write("\r\n");
                }
            }
            fileWriter.write("  }");
            fileWriter.write("\r\n");
            fileWriter.write("}");
            //循环外
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws Exception {

        //xml文件所在路径
        getFiles("/Users/cktk/Documents/ts-it/ipms_service/src/main/resources/queue");




    }

    /**
     * 递归出所有的PS开头并且以txt结尾的文件
     * @param path
     */
    public static void getFiles(String path) throws Exception {
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    getFiles(files[i].getPath());
                } else {
                    String name = files[i].getName();
                    int lastIndexOf = name.lastIndexOf("txt");
                    int i1 = name.length() - 3;
                    if (name.indexOf("PS")==0&&lastIndexOf==i1){


                            createBean(files[i]);
                       /* } catch (Exception e) {

                            System.err.println("错误"+files[i].getPath());

                            System.out.println("\033[33;4m" + e + "\033[0m");
                        }*/


                    }
                }

            }
        }



    }





    /**
     * 返回文件保存的路径
     *
     * @param xmlPath  xml 文件的路径
     *
     *  creatPath   创建在哪的根目录
     * @return
     */
    public static String getBeanPath(File xmlPath) {

        String fileName = getFileName(xmlPath);//获取文件名称

        File targetPackage = new File(javaBeanPath + "/" + fileName);//创建实体类存放路径
        if (!targetPackage.exists()) {//如果文件夹不存在
            targetPackage.mkdir();//创建文件夹
        } else if (isOverwrite) {
            targetPackage.delete();//如果覆盖已存在的先删除
            targetPackage.mkdir();//创建文件夹
        }
        System.out.println(targetPackage.getPath()+"java文件创建的路径");

        return targetPackage.getPath();
    }

    /**
     * 获取文件名称
     * @param file
     * @return
     */
    public static String getFileName(File file) {
        return file.getName().substring(0, file.getName().indexOf("."));//文件名称
    }

    //属性名规则
    //如果还有下划线 去掉下划线  驼峰
    //如果没有下划线 首字母大写
    public static String camelName(String name) {
        StringBuilder result = new StringBuilder();
        // 快速检查
        if (name == null || name.isEmpty()) {
            // 没必要转换
            return "";
        } else if (!name.contains("_")) {
            // 不含下划线，仅将首字母小写
            return name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        // 用下划线将原始字符串分割
        String camels[] = name.split("_");
        for (String camel : camels) {
            // 跳过原始字符串中开头、结尾的下换线或双重下划线
            if (camel.isEmpty()) {
                continue;
            }
            // 处理真正的驼峰片段
            if (result.length() == 0) {
                // 第一个驼峰片段，全部字母都小写
                result.append(camel.toLowerCase());
            } else {
                // 其他的驼峰片段，首字母大写
                result.append(camel.substring(0, 1).toUpperCase());
                result.append(camel.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }

    /**
     * @param s 待转换成首字母小写的字符串
     * @return 首字母小写的字符串
     */
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    /**
     * @param s 待转换成首字母大写的字符串
     * @return 首字母大写的字符串
     */
    public static String toUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }


}
