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
 * <p>年级类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="年级类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="大一"/>
 *     &lt;enumeration value="大二"/>
 *     &lt;enumeration value="大三"/>
 *     &lt;enumeration value="大四"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */

/**
 * 年级类型 GradeType
 * 学生基本信息类型 StudentBasicInformationType
 * 学生年级类型 StudentGradeType
 * 学生列表类型 StudentListType
 * 学生成绩类型 StudentScoreType
 * 学籍状态类型 StudentStatusType
 */

@XmlType(name = "年级类型", namespace = Namespace.JW_URI)
@XmlEnum
public enum GradeType {

    FRESHMAN,
    SOPHOMORE,
    JUNIOR,
    SENIORYEAR;

    public String value() {
        switch (this) {
            case FRESHMAN:
                return "大一";
            case SOPHOMORE:
                return "大二";
            case JUNIOR:
                return "大三";
            case SENIORYEAR:
                return "大四";
            default:
                return null;
        }
    }

    public static GradeType fromValue(String v) {
        switch (v) {
            case "大一":
                return FRESHMAN;
            case "大二":
                return SOPHOMORE;
            case "大三":
                return JUNIOR;
            case "大四":
                return SENIORYEAR;
            default:
                return null;
        }
    }

}
