package cn.edu.nju.soa.transform;


import cn.edu.nju.soa.model.DepartmentStu;
import cn.edu.nju.soa.model.StudentList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    private final static String path="./data";

    public static StudentList generateData() throws FileNotFoundException {
        File file = new File(path);
        File[] files = file.listFiles();

        List<cn.edu.nju.soa.model.DepartmentStu> stus = new ArrayList<>();

        for (File curStu : files) {
            if (curStu.getName().startsWith(".")) {
                continue;
            }
            cn.edu.nju.soa.model.DepartmentStu student = getStudent(curStu);
            if (student != null) {
                stus.add(student);
            }
        }
        return null;
    }

    private static cn.edu.nju.soa.model.DepartmentStu getStudent(File file){
        try{
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line=null;
            ArrayList<String> list=new ArrayList<>();
            while ((line=br.readLine())!=null){
                list.add(line);
            }
            br.close();
//            cn.edu.nju.soa.model.DepartmentStu student=new DepartmentStu(list);
//            return student;
        }catch (IOException ioe){
            ioe.printStackTrace();
            return null;
        }
        return null;
    }


}
