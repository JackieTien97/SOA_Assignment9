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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>学生列表类型 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生列表类型">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="45" minOccurs="0">
 *         &lt;element name="院系学生" type="{http://jw.nju.edu.cn/schema}DepartmentStu"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "学生列表类型", namespace = Namespace.JW_URI, propOrder = {
    "facultyStudents"
})
public class StudentList {

    protected List<cn.edu.nju.soa.model.StudentInfo> facultyStudents;

    public List<cn.edu.nju.soa.model.StudentInfo> getFacultyStudents() {
        return facultyStudents;
    }

    public void setFacultyStudents(List<cn.edu.nju.soa.model.StudentInfo> facultyStudents) {
        this.facultyStudents = facultyStudents;
    }
}
