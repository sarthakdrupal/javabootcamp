package com.company.day4;

import java.util.*;

public class QuestionSix {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,4,8,7,1,2,2,3,5,5,5,7,1,3,5);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        list.forEach(e -> map.put(e, map    .get(e) == null ? 1 : (Integer)(map.get(e)) + 1));
        List list1 = new LinkedList<>(map.entrySet());
        System.out.println(list1);
        Collections.sort(list1, (t1, t2) ->  (Integer) ((Map.Entry)t2).getValue() - (Integer) ((Map.Entry)t1).getValue());
        System.out.println(list1);
    }
}
