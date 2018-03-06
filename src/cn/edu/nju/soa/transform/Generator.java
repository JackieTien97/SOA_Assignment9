package cn.edu.nju.soa.transform;


import cn.edu.nju.soa.model.DepartmentStu;
import cn.edu.nju.soa.model.StudentInfo;
import cn.edu.nju.soa.model.StudentList;

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
        studentList.setFacultyStudents(stus);
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
        }
    }


}
