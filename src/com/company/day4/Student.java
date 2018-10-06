package com.company.day4;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    int score;
    int age;

    @Override
    public int compareTo(Student student) {
        if(this.score == student.score)
            return this.name.compareTo(student.name);
        return (int) (this.score - student.score);
    }

    public Student(String name, int score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Student> obj = new ArrayList<>();
        obj.add(new Student("sarthak", 89, 24));
        obj.add(new Student("ajay", 89, 25));
        obj.add(new Student("karan", 91, 24));
        obj.add(new Student("kushal", 91, 24));
        obj.add(new Student("priya", 45, 24));
        Collections.sort(obj);
        obj.stream().forEachOrdered(e-> System.out.println(e.name));
    }


}
