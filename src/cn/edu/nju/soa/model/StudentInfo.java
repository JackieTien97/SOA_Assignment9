//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学生基本信息" type="{http://jw.nju.edu.cn/schema}学生基本信息类型"/>
 *         &lt;element name="学生成绩" type="{http://jw.nju.edu.cn/schema}学生成绩类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生信息类型",namespace = Namespace.JW_URI, propOrder = {
    "studentBasicInfo",
    "studentScores"
})
public class StudentInfo {

    @XmlElement(name = "学生基本信息", namespace = Namespace.JW_URI, required = true)
    protected StudentBasicInformationType studentBasicInfo;
    @XmlElement(name = "学生成绩", namespace = Namespace.JW_URI, required = true)
    protected StudentScoreType studentScores;

    /**
     * 获取学生基本信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StudentBasicInformationType }
     *     
     */
    public StudentBasicInformationType getStudentBasicInfo() {
        return studentBasicInfo;
    }

    /**
     * 设置学生基本信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StudentBasicInformationType }
     *     
     */
    public void setStudentBasicInfo(StudentBasicInformationType value) {
        this.studentBasicInfo = value;
    }

    /**
     * 获取学生成绩属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StudentScoreType }
     *     
     */
    public StudentScoreType getStudentScores() {
        return studentScores;
    }

    /**
     * 设置学生成绩属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StudentScoreType }
     *     
     */
    public void setStudentScores(StudentScoreType value) {
        this.studentScores = value;
    }

}
