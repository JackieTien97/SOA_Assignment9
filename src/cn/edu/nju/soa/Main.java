package cn.edu.nju.soa;

import cn.edu.nju.soa.model.StudentList;
import cn.edu.nju.soa.transform.Generator;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            StudentList studentList = Generator.generateData();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
