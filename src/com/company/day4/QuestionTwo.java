package com.company.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class QuestionTwo {

    public static void main(String[] args) {
        uniqueCharactersInString("sarthak");
    }

    public static void uniqueCharactersInString(String s){
        //Using stream api and lambdas
//        Stream stream = s.chars().mapToObj((i) -> Character.valueOf((char)i)).distinct();
//        stream.forEach(System.out::println);
        Set<Character> characterSet = new HashSet<>();
        int i = 0;
        char[] chars = s.toCharArray();
        while (i < chars.length) {
            characterSet.add(chars[i]);
            i++;
        }
        //System.out.println(characterSet);
        characterSet.forEach(System.out::println);

    }

}
