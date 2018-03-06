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
 *         &lt;element name="课程成绩列表" type="{http://jw.nju.edu.cn/schema}CourseScoreList"/>
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
@XmlType(name = "成绩详情类型", propOrder = {
    "scoreList","semester"
})
public class ScoreDetailType {

    @XmlElement(required = true)
    protected CourseScoreList scoreList;
    @XmlAttribute
    protected Semester semester;

    /**
     * 获取课程成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CourseScoreList }
     *     
     */
    public CourseScoreList getScoreList() {
        return scoreList;
    }

    /**
     * 设置课程成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CourseScoreList }
     *     
     */
    public void setScoreList(CourseScoreList value) {
        this.scoreList = value;
    }

    /**
     * 获取学期属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.soa.model.Semester }
     *     
     */
    public Semester getSemester() {
        return semester;
    }

    /**
     * 设置学期属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.soa.model.Semester }
     *     
     */
    public void setSemester(Semester value) {
        this.semester = value;
    }

}
