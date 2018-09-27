package com.company.day2;

import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        String line = "";
        do{
            line  = scanner.nextLine();
            if (line == "") {
                System.out.println("Please enter a word");
                break;
            }
            if(line.equals("done")) {
                break;
            }
            if(line.charAt(line.length()-1) == line.charAt(0)) {
                System.out.println("first and last charcter is equal");
            }else {
                System.out.println("first and last charcter is not equal");
            }
        }while(flag);
        System.out.println("Byee!!!");
    }
}
