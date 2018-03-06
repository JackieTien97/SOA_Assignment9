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


/**
 * <p>课程信息类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程信息类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/>
 *         &lt;element name="课程名称" type="{http://jw.nju.edu.cn/schema}课程名称类型"/>
 *         &lt;element name="授课教师" type="{http://www.nju.edu.cn/schema}人员名称类型"/>
 *         &lt;element name="上课时间与地点表" type="{http://jw.nju.edu.cn/schema}上课时间与地点表类型"/>
 *         &lt;element name="选课类型" type="{http://jw.nju.edu.cn/schema}课程类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u4fe1\u606f\u7c7b\u578b", propOrder = {
    "\u8bfe\u7a0b\u7f16\u53f7",
    "\u8bfe\u7a0b\u540d\u79f0",
    "\u6388\u8bfe\u6559\u5e08",
    "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9\u8868",
    "\u9009\u8bfe\u7c7b\u578b"
})
public class 课程信息类型 {

    @XmlElement(required = true)
    protected String 课程编号;
    @XmlElement(required = true)
    protected String 课程名称;
    @XmlElement(required = true)
    protected String 授课教师;
    @XmlElement(required = true)
    protected 上课时间与地点表类型 上课时间与地点表;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 课程类型 选课类型;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取课程名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程名称() {
        return 课程名称;
    }

    /**
     * 设置课程名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程名称(String value) {
        this.课程名称 = value;
    }

    /**
     * 获取授课教师属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get授课教师() {
        return 授课教师;
    }

    /**
     * 设置授课教师属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set授课教师(String value) {
        this.授课教师 = value;
    }

    /**
     * 获取上课时间与地点表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 上课时间与地点表类型 }
     *     
     */
    public 上课时间与地点表类型 get上课时间与地点表() {
        return 上课时间与地点表;
    }

    /**
     * 设置上课时间与地点表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 上课时间与地点表类型 }
     *     
     */
    public void set上课时间与地点表(上课时间与地点表类型 value) {
        this.上课时间与地点表 = value;
    }

    /**
     * 获取选课类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程类型 }
     *     
     */
    public 课程类型 get选课类型() {
        return 选课类型;
    }

    /**
     * 设置选课类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程类型 }
     *     
     */
    public void set选课类型(课程类型 value) {
        this.选课类型 = value;
    }

}
