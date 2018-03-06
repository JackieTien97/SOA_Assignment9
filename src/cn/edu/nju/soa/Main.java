package cn.edu.nju.soa;

import cn.edu.nju.soa.transform.Generator;
import cn.edu.nju.soa.transform.XmlParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream(new File("doc/文档2.xml"));
            String result = XmlParser.marshal(Generator.generateData());
            outputStream.write(result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
