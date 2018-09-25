//Find common elements between two arrays.
package com.company.day1;

import java.util.Arrays;

public class QuestionFive {
    public static void main(String[] args) {
        Integer [] a = new Integer[10];Arrays.fill(a,0);
        Integer [] b = new Integer[10];Arrays.fill(b,0);
        printCommonElements(a,b);
    }
    public static void printCommonElements(Object[] a, Object b[]) {
        for(int i=0; i<a.length; i++) {
            for (int j=0; j<b.length; j++){
                if(a[i].equals(b[j])){
                    System.out.println("common element is ->" + a[i]);
                }
            }
        }
    }
}
