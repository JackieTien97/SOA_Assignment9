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
 * <p>课程类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CourseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="核心"/>
 *     &lt;enumeration value="平台"/>
 *     &lt;enumeration value="选修"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "课程类型",namespace = cn.edu.nju.soa.model.Namespace.JW_URI)
@XmlEnum
public enum CourseType {

    KERNEL,
    PLATFORM,
    OPTIONAL;

    public String value() {
        String name="";
        switch (this){
            case KERNEL:
                name="核心";
            case PLATFORM:
                name="平台";
            case OPTIONAL:
                name="选修";
        }
        return name;
    }

    public static cn.edu.nju.soa.model.CourseType fromValue(String v) {
        CourseType type=null;
        switch (v){
            case "核心":
                type=CourseType.KERNEL;
            case "平台":
                type=CourseType.PLATFORM;
            case "选修":
                type=CourseType.OPTIONAL;
        }
        return type;
    }

}