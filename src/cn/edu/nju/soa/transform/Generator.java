package cn.edu.nju.soa.transform;


import cn.edu.nju.soa.model.*;
import cn.edu.nju.soa.model.DepartmentStu;
import cn.edu.nju.soa.model.StudentGrade;
import cn.edu.nju.soa.model.StudentInfo;
import cn.edu.nju.soa.model.StudentList;

import javax.xml.datatype.DatatypeConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    private final static String path="./data";

    public static cn.edu.nju.soa.model.StudentList generateData() throws FileNotFoundException {
        File file=new File(path);
        File[] files=file.listFiles();

        List<StudentInfo> stus=new ArrayList<>();

        for (File curStu:files) {
            if(curStu.getName().startsWith(".")){
                continue;
            }
            StudentInfo student=getStudent(curStu);
            if(student!=null){
                stus.add(student);
            }
        }

        cn.edu.nju.soa.model.StudentList studentList=new StudentList();
        DepartmentStu departmentStu=new DepartmentStu();
        cn.edu.nju.soa.model.StudentGrade sg=new StudentGrade();
        sg.setStudent(stus);
        sg.setGrade(cn.edu.nju.soa.model.GradeType.SENIORYEAR);
        departmentStu.setDepartmentId("1250");
        List<DepartmentStu> departmentStus=new ArrayList<>();
        departmentStus.add(departmentStu);
        studentList.setStudents(departmentStus);

        return studentList;
    }

    private static StudentInfo getStudent(File file){
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=null;
            ArrayList<String> list=new ArrayList<>();
            while ((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
            cn.edu.nju.soa.model.StudentInfo student=new StudentInfo(list);
            return student;
        }catch (IOException ioe){
            ioe.printStackTrace();
            return null;
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
            return null;
        }
    }


}
