//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>人员性别类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="人员性别类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="男"/>
 *     &lt;enumeration value="女"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "人员性别类型", namespace = "http://www.nju.edu.cn/schema")
@XmlEnum
public enum Sex {

    MALE,
    FEMALE;

    public String value() {
        switch (this) {
            case MALE:
                return "男";
            case FEMALE:
                return "女";
            default:
                return null;
        }
    }

    public static Sex fromValue(String v) {
        switch (v) {
            case "男":
                return MALE;
            case "女":
                return FEMALE;
            default:
                return null;
        }
    }

}