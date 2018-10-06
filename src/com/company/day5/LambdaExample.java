package com.company.day5;

import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> obj = Arrays.asList(1,2,2,3,3,5,4);
        Collections.sort(obj, (integer,t1) -> t1-integer);
        System.out.println(obj);
        List<String> names = Arrays.asList("sarthak", "Sarthak");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String string, String t1) {
                return string.compareTo(t1);
            }
        });
        System.out.println(names);
    }
}
