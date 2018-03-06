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
 * <p>成绩详情类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="成绩详情类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}课程成绩列表类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="学期" type="{http://jw.nju.edu.cn/schema}学期类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6210\u7ee9\u8be6\u60c5\u7c7b\u578b", propOrder = {
    "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868"
})
public class 成绩详情类型 {

    @XmlElement(required = true)
    protected 课程成绩列表类型 课程成绩列表;
    @XmlAttribute
    protected 学期类型 学期;

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public 课程成绩列表类型 get课程成绩列表() {
        return 课程成绩列表;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程成绩列表类型 }
     *     
     */
    public void set课程成绩列表(课程成绩列表类型 value) {
        this.课程成绩列表 = value;
    }

    /**
     * 获取学期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 学期类型 }
     *     
     */
    public 学期类型 get学期() {
        return 学期;
    }

    /**
     * 设置学期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 学期类型 }
     *     
     */
    public void set学期(学期类型 value) {
        this.学期 = value;
    }

}
