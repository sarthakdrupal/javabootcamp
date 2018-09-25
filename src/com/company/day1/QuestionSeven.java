package com.company.day1;

public class QuestionSeven {
    public static int age = 24;
    static {
        System.out.println("Sarthak");
    }
    public static void printLastName() {
        System.out.println("Agarwal");
    }

    public static void main(String[] args) {
        printLastName();
        System.out.println(QuestionSeven.age);
    }
}
