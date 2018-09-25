//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
package com.company.day1;

public class QuestionThree {
    public static void main(String[] args) {
        System.out.println(getNumberOfOccuranccesofCharacter('a',"my name is Sarthak"));
    }
    public static int getNumberOfOccuranccesofCharacter(char ch, String string){
        int withoutChar = string.replaceAll(ch + "", "").length();
        return string.length() - withoutChar;
    }
}
