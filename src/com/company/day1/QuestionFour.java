//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
package com.company.day1;

public class QuestionFour {
    public static void main(String[] args) {
        printNumberOfLowerUpperDigitsAndSpecialChars("My name is Sat!22 snmxs!!");

    }
    public static void printNumberOfLowerUpperDigitsAndSpecialChars(String string){
        int lowerCase = 0;
        int upperCase = 0;
        int digits = 0;
        int specialChars = 0;
        for (int i =0; i< string.length(); i++) {
            if(string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                lowerCase++;
                continue;
            }
            if(string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                upperCase++;
                continue;
            }
            if(string.charAt(i) >= 48 && string.charAt(i) <= 57) {
                digits++;
                continue;
            }
            specialChars++;
        }
        System.out.println("lowercase-> " + lowerCase);
        System.out.println("lowercase Percentage-> " + ((float) lowerCase/string.length())*100);
        System.out.println("uppercase-> " + upperCase);
        System.out.println("uppercase Percentage-> " + ((float) upperCase/string.length())*100);
        System.out.println("digits-> " + digits);
        System.out.println("digits Percentage-> " + ((float) digits/string.length())*100);
        System.out.println("specialChars-> " + specialChars);
        System.out.println("specialChars Percentage-> " + ((float) specialChars/string.length())*100);
    }
}
