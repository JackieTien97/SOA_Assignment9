//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生年级类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生年级类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="学生" type="{http://jw.nju.edu.cn/schema}学生信息类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="年级" type="{http://jw.nju.edu.cn/schema}年级类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u5e74\u7ea7\u7c7b\u578b", propOrder = {
    "\u5b66\u751f"
})
public class 学生年级类型 {

    @XmlElement(required = true)
    protected 学生信息类型 学生;
    @XmlAttribute
    protected 年级类型 年级;

    /**
     * 获取学生属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学生信息类型 }
     *     
     */
    public 学生信息类型 get学生() {
        return 学生;
    }

    /**
     * 设置学生属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学生信息类型 }
     *     
     */
    public void set学生(学生信息类型 value) {
        this.学生 = value;
    }

    /**
     * 获取年级属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 年级类型 }
     *     
     */
    public 年级类型 get年级() {
        return 年级;
    }

    /**
     * 设置年级属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 年级类型 }
     *     
     */
    public void set年级(年级类型 value) {
        this.年级 = value;
    }

}
