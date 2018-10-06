package com.company.day4;

import java.util.HashMap;
import java.util.Map;

public class QuestionThree  {
    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        String s = "sarthak";
        s.chars().forEachOrdered(e ->
                characterIntegerMap.put(Character.valueOf((char)e),
                        characterIntegerMap.get(Character.valueOf((char)e)) == null ? 1 :
                                characterIntegerMap.get(Character.valueOf((char)e)) + 1));
        characterIntegerMap.entrySet().stream().forEach(System.out::print);
    }
}
