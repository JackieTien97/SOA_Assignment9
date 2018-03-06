//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.03.06 时间 03:21:28 PM CST 
//


package cn.edu.nju.soa.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.nju.soa.xsd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _课程信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u4fe1\u606f");
    private final static QName _学生信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f\u4fe1\u606f");
    private final static QName _人员信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u4eba\u5458\u4fe1\u606f");
    private final static QName _学生列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f\u5217\u8868");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");
    private final static QName _教师信息_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u6559\u5e08\u4fe1\u606f");
    private final static QName _部门信息_QNAME = new QName("http://www.nju.edu.cn/schema", "\u90e8\u95e8\u4fe1\u606f");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.nju.soa.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 教师信息类型 }
     * 
     */
    public 教师信息类型 create教师信息类型() {
        return new 教师信息类型();
    }

    /**
     * Create an instance of {@link 学生列表类型 }
     * 
     */
    public 学生列表类型 create学生列表类型() {
        return new 学生列表类型();
    }

    /**
     * Create an instance of {@link 学生信息类型 }
     * 
     */
    public 学生信息类型 create学生信息类型() {
        return new 学生信息类型();
    }

    /**
     * Create an instance of {@link 课程信息类型 }
     * 
     */
    public 课程信息类型 create课程信息类型() {
        return new 课程信息类型();
    }

    /**
     * Create an instance of {@link 学生年级类型 }
     * 
     */
    public 学生年级类型 create学生年级类型() {
        return new 学生年级类型();
    }

    /**
     * Create an instance of {@link 学生成绩类型 }
     * 
     */
    public 学生成绩类型 create学生成绩类型() {
        return new 学生成绩类型();
    }

    /**
     * Create an instance of {@link 上课时间与地点表类型 }
     * 
     */
    public 上课时间与地点表类型 create上课时间与地点表类型() {
        return new 上课时间与地点表类型();
    }

    /**
     * Create an instance of {@link 学生基本信息类型 }
     * 
     */
    public 学生基本信息类型 create学生基本信息类型() {
        return new 学生基本信息类型();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 成绩详情类型 }
     * 
     */
    public 成绩详情类型 create成绩详情类型() {
        return new 成绩详情类型();
    }

    /**
     * Create an instance of {@link 院系学生类型 }
     * 
     */
    public 院系学生类型 create院系学生类型() {
        return new 院系学生类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 部门信息类型 }
     * 
     */
    public 部门信息类型 create部门信息类型() {
        return new 部门信息类型();
    }

    /**
     * Create an instance of {@link 人员信息类型 }
     * 
     */
    public 人员信息类型 create人员信息类型() {
        return new 人员信息类型();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u4fe1\u606f")
    public JAXBElement<课程信息类型> create课程信息(课程信息类型 value) {
        return new JAXBElement<课程信息类型>(_课程信息_QNAME, 课程信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f\u4fe1\u606f")
    public JAXBElement<学生信息类型> create学生信息(学生信息类型 value) {
        return new JAXBElement<学生信息类型>(_学生信息_QNAME, 学生信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 人员信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u4eba\u5458\u4fe1\u606f")
    public JAXBElement<人员信息类型> create人员信息(人员信息类型 value) {
        return new JAXBElement<人员信息类型>(_人员信息_QNAME, 人员信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f\u5217\u8868")
    public JAXBElement<学生列表类型> create学生列表(学生列表类型 value) {
        return new JAXBElement<学生列表类型>(_学生列表_QNAME, 学生列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<课程成绩列表类型> create课程成绩列表(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_课程成绩列表_QNAME, 课程成绩列表类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 教师信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u6559\u5e08\u4fe1\u606f")
    public JAXBElement<教师信息类型> create教师信息(教师信息类型 value) {
        return new JAXBElement<教师信息类型>(_教师信息_QNAME, 教师信息类型.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 部门信息类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nju.edu.cn/schema", name = "\u90e8\u95e8\u4fe1\u606f")
    public JAXBElement<部门信息类型> create部门信息(部门信息类型 value) {
        return new JAXBElement<部门信息类型>(_部门信息_QNAME, 部门信息类型.class, null, value);
    }

}
