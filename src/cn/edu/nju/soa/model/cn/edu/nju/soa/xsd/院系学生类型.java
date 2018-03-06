//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>院系学生类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="院系学生类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="4" minOccurs="0">
 *         &lt;element name="学生年级" type="{http://jw.nju.edu.cn/schema}学生年级类型"/>
 *       &lt;/sequence>
 *       &lt;attribute name="院系编号" type="{http://www.nju.edu.cn/schema}部门编号类型" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u9662\u7cfb\u5b66\u751f\u7c7b\u578b", propOrder = {
    "\u5b66\u751f\u5e74\u7ea7"
})
public class 院系学生类型 {

    protected List<学生年级类型> 学生年级;
    @XmlAttribute
    protected String 院系编号;

    /**
     * Gets the value of the 学生年级 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 学生年级 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get学生年级().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 学生年级类型 }
     * 
     * 
     */
    public List<学生年级类型> get学生年级() {
        if (学生年级 == null) {
            学生年级 = new ArrayList<学生年级类型>();
        }
        return this.学生年级;
    }

    /**
     * 获取院系编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get院系编号() {
        return 院系编号;
    }

    /**
     * 设置院系编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set院系编号(String value) {
        this.院系编号 = value;
    }

}
