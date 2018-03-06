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
 * <p>职称类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="职称类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="教授"/>
 *     &lt;enumeration value="副教授"/>
 *     &lt;enumeration value="讲师"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "职称类型")
@XmlEnum
public enum TitleType {

    PROFESSOR,
    VICEPROFESSOR,
    TEACHER;

    public String value() {
        String name="";
        switch (this){
            case PROFESSOR:
                name =  "教授";
                break;
            case VICEPROFESSOR:
                name =  "副教授";
                break;
            case TEACHER:
                name =  "讲师";
                break;
        }
        return name;
    }

    public static TitleType fromValue(String v) {
        TitleType type = null;
        switch(v){
            case "教授":
                type = TitleType.PROFESSOR;
                break;
            case "副教授":
                type = TitleType.VICEPROFESSOR;
                break;
            case "讲师":
                type = TitleType.TEACHER;
                break;
        }
        return type;
    }

}
