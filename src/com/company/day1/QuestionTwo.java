//. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
package com.company.day1;

import java.util.Arrays;

public class QuestionTwo {
    public static void main(String[] args) {
        printDuplicateWordsInString(null);
    }
    public static void printDuplicateWordsInString(String string){
        int flag = 0;
        String []words = string.split(" ");
        Integer occurances[] = new Integer[words.length];
        Arrays.fill(occurances, 0);
        for(int i =0; i< words.length; i++) {
            int diff = words.length -  string.replaceAll(words[i], "").replaceAll("  ", " ").trim().split(" ").length;
            if(diff > 1) {
                System.out.println(words[i]);
                System.out.println(diff);
            }

        }
    }
}
