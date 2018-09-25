//Q1. Write a program to replace a substring inside a string with other string ?
package com.company.day1;

public class QuestionFirst {

    public static void main(String[] args) {
        System.out.println(replaceSubstringWithString("Welcome to the java world", "world", "hell"));
    }

    public static String replaceSubstringWithString(String source, String pattern, String replace){
        return source.replaceAll(pattern, replace);
    }
}
