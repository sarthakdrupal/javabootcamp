package com.company.day5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        System.out.close();
        FileOutputStream fileOutputStream = new FileOutputStream("/tmp/sarthak.txt");
        fileOutputStream.write("sarthak->".getBytes());
        fileOutputStream.write("agarwal->".getBytes());
        fileOutputStream.close();
    }
}
