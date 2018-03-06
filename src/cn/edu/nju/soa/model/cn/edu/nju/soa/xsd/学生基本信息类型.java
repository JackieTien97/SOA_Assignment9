//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>学生基本信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生基本信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="姓名" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}人员性别类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="专业" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *         &lt;element name="入学时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="联系方式" type="{http://www.nju.edu.cn/schema}手机号类型"/>
 *         &lt;element name="学籍状态" type="{http://jw.nju.edu.cn/schema}学籍状态类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u57fa\u672c\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u5b66\u53f7",
    "\u59d3\u540d",
    "\u6027\u522b",
    "\u51fa\u751f\u65e5\u671f",
    "\u8eab\u4efd\u8bc1\u53f7",
    "\u4e13\u4e1a",
    "\u5165\u5b66\u65f6\u95f4",
    "\u8054\u7cfb\u65b9\u5f0f",
    "\u5b66\u7c4d\u72b6\u6001"
})
public class 学生基本信息类型 {

    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 人员性别类型 性别;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 出生日期;
    @XmlElement(required = true)
    protected String 身份证号;
    @XmlElement(required = true)
    protected String 专业;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 入学时间;
    @XmlElement(required = true)
    protected String 联系方式;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 学籍状态类型 学籍状态;

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓名(String value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 人员性别类型 }
     *     
     */
    public 人员性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 人员性别类型 }
     *     
     */
    public void set性别(人员性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取出生日期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get出生日期() {
        return 出生日期;
    }

    /**
     * 设置出生日期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set出生日期(XMLGregorianCalendar value) {
        this.出生日期 = value;
    }

    /**
     * 获取身份证号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get身份证号() {
        return 身份证号;
    }

    /**
     * 设置身份证号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set身份证号(String value) {
        this.身份证号 = value;
    }

    /**
     * 获取专业属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get专业() {
        return 专业;
    }

    /**
     * 设置专业属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set专业(String value) {
        this.专业 = value;
    }

    /**
     * 获取入学时间属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get入学时间() {
        return 入学时间;
    }

    /**
     * 设置入学时间属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set入学时间(XMLGregorianCalendar value) {
        this.入学时间 = value;
    }

    /**
     * 获取联系方式属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get联系方式() {
        return 联系方式;
    }

    /**
     * 设置联系方式属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set联系方式(String value) {
        this.联系方式 = value;
    }

    /**
     * 获取学籍状态属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学籍状态类型 }
     *     
     */
    public 学籍状态类型 get学籍状态() {
        return 学籍状态;
    }

    /**
     * 设置学籍状态属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学籍状态类型 }
     *     
     */
    public void set学籍状态(学籍状态类型 value) {
        this.学籍状态 = value;
    }

}
