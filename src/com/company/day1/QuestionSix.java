//There is an array with every element repeated twice except one. Find that element
package com.company.day1;

import java.util.Arrays;

public class QuestionSix {
    public static void main(String[] args) {
        Integer a[] = {1,2,2,3,3,4,4,5,5,1,6};
        printSingleOccuranceOfElement(a);
    }
    public static void printSingleOccuranceOfElement(Integer a[]){
        int unique = a[0];
        for (int i=1; i< a.length; i++){
            unique = unique ^ a[i];
        }
        System.out.println(unique);
    }
}
