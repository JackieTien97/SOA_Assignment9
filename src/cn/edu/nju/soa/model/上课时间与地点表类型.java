//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>上课时间与地点表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="上课时间与地点表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="上课时间与地点" type="{http://jw.nju.edu.cn/schema}上课时间与地点类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9\u8868\u7c7b\u578b", propOrder = {
    "\u4e0a\u8bfe\u65f6\u95f4\u4e0e\u5730\u70b9"
})
public class 上课时间与地点表类型 {

    @XmlElement(required = true)
    protected List<String> 上课时间与地点;

    /**
     * Gets the value of the 上课时间与地点 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 上课时间与地点 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get上课时间与地点().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> get上课时间与地点() {
        if (上课时间与地点 == null) {
            上课时间与地点 = new ArrayList<String>();
        }
        return this.上课时间与地点;
    }

}
