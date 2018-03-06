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
 * <p>教师信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="教师信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="教工号" type="{http://jw.nju.edu.cn/schema}教工号类型"/>
 *         &lt;element name="教师名称" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="年龄" type="{http://www.nju.edu.cn/schema}人员年龄类型"/>
 *         &lt;element name="入职年份" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="院系" type="{http://www.nju.edu.cn/schema}部门名称类型"/>
 *         &lt;element name="职称" type="{http://jw.nju.edu.cn/schema}职称类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6559\u5e08\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u6559\u5de5\u53f7",
    "\u6559\u5e08\u540d\u79f0",
    "\u5e74\u9f84",
    "\u5165\u804c\u5e74\u4efd",
    "\u9662\u7cfb",
    "\u804c\u79f0"
})
public class 教师信息类型 {

    @XmlElement(required = true)
    protected String 教工号;
    @XmlElement(required = true)
    protected String 教师名称;
    @XmlSchemaType(name = "integer")
    protected int 年龄;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 入职年份;
    @XmlElement(required = true)
    protected String 院系;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 职称类型 职称;

    /**
     * 获取教工号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get教工号() {
        return 教工号;
    }

    /**
     * 设置教工号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set教工号(String value) {
        this.教工号 = value;
    }

    /**
     * 获取教师名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get教师名称() {
        return 教师名称;
    }

    /**
     * 设置教师名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set教师名称(String value) {
        this.教师名称 = value;
    }

    /**
     * 获取年龄属性的值。
     * 
     */
    public int get年龄() {
        return 年龄;
    }

    /**
     * 设置年龄属性的值。
     * 
     */
    public void set年龄(int value) {
        this.年龄 = value;
    }

    /**
     * 获取入职年份属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get入职年份() {
        return 入职年份;
    }

    /**
     * 设置入职年份属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set入职年份(XMLGregorianCalendar value) {
        this.入职年份 = value;
    }

    /**
     * 获取院系属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get院系() {
        return 院系;
    }

    /**
     * 设置院系属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set院系(String value) {
        this.院系 = value;
    }

    /**
     * 获取职称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 职称类型 }
     *     
     */
    public 职称类型 get职称() {
        return 职称;
    }

    /**
     * 设置职称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 职称类型 }
     *     
     */
    public void set职称(职称类型 value) {
        this.职称 = value;
    }

}
