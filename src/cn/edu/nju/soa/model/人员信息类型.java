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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>人员信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="人员信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="人员职务" type="{http://www.nju.edu.cn/schema}人员职务类型"/>
 *         &lt;element name="人员年龄" type="{http://www.nju.edu.cn/schema}人员年龄类型"/>
 *         &lt;element name="出生日期" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}人员性别类型"/>
 *         &lt;element name="身份证号" type="{http://www.nju.edu.cn/schema}身份证号类型"/>
 *         &lt;element name="手机号类型" type="{http://www.nju.edu.cn/schema}手机号类型"/>
 *         &lt;element name="入校时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="部门名称" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4eba\u5458\u4fe1\u606f\u7c7b\u578b", namespace = "http://www.nju.edu.cn/schema", propOrder = {
    "\u59d3\u540d",
    "\u4eba\u5458\u804c\u52a1",
    "\u4eba\u5458\u5e74\u9f84",
    "\u51fa\u751f\u65e5\u671f",
    "\u6027\u522b",
    "\u8eab\u4efd\u8bc1\u53f7",
    "\u624b\u673a\u53f7\u7c7b\u578b",
    "\u5165\u6821\u65f6\u95f4",
    "\u90e8\u95e8\u540d\u79f0"
})
public class 人员信息类型 {

    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 人员职务类型 人员职务;
    @XmlSchemaType(name = "integer")
    protected int 人员年龄;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 出生日期;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 人员性别类型 性别;
    @XmlElement(required = true)
    protected String 身份证号;
    @XmlElement(required = true)
    protected String 手机号类型;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 入校时间;
    @XmlElement(required = true)
    protected String 部门名称;

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
     * 获取人员职务属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 人员职务类型 }
     *     
     */
    public 人员职务类型 get人员职务() {
        return 人员职务;
    }

    /**
     * 设置人员职务属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 人员职务类型 }
     *     
     */
    public void set人员职务(人员职务类型 value) {
        this.人员职务 = value;
    }

    /**
     * 获取人员年龄属性的值。
     * 
     */
    public int get人员年龄() {
        return 人员年龄;
    }

    /**
     * 设置人员年龄属性的值。
     * 
     */
    public void set人员年龄(int value) {
        this.人员年龄 = value;
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
     * 获取手机号类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get手机号类型() {
        return 手机号类型;
    }

    /**
     * 设置手机号类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set手机号类型(String value) {
        this.手机号类型 = value;
    }

    /**
     * 获取入校时间属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get入校时间() {
        return 入校时间;
    }

    /**
     * 设置入校时间属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set入校时间(XMLGregorianCalendar value) {
        this.入校时间 = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门名称() {
        return 部门名称;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门名称(String value) {
        this.部门名称 = value;
    }

}
