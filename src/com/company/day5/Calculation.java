package com.company.day5;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface Calculation<T1, T2, T3> {
     T3 operation(T1 a, T2 b);
}

class PerformOperation {
    public static void main(String[] args) {
        Calculation<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.operation(12, 34));
        List<Integer> integerList = Arrays.asList(12,21,2,1,1,34);
        integerList.stream();
    }
}
