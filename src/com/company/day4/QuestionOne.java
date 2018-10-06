package com.company.day4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QuestionOne {
    public static void main(String[] args) {
        List<Float> floatList = new LinkedList<>();
        System.out.println(floatList.hashCode());
        floatList.add(23.2f);
        floatList.add(53.1f);
        floatList.add(13.25f);
        System.out.println(floatList.hashCode());
        floatList.add(43.2f);
        floatList.add(63.2f);
        floatList.add(null);
        ((LinkedList<Float>) floatList).push(223.34f);
        //((LinkedList<Float>) floatList).poll();
        System.out.println(floatList.hashCode());
        System.out.println("#################################");
        Object obj = ((LinkedList<Float>) floatList).clone();
        Iterator<Float> iterator = floatList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------->");
        List<Float> copyList  = (LinkedList<Float>)obj;
        copyList.add(23232.34f);
        Iterator<Float> iterator1 = copyList.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
            iterator1.remove();

        }
        System.out.println("---------------------->%%%%%%%%%%%%%");
        iterator = floatList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
