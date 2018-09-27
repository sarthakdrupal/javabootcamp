package com.company.day4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample> {
    private Integer worldRank;
    private String name;
    private String sport;
    private String country;

    public Integer getWorldRank() {
        return worldRank;
    }

    public void setWorldRank(Integer worldRank) {
        this.worldRank = worldRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getMedals() {
        return medals;
    }

    public void setMedals(List<String> medals) {
        this.medals = medals;
    }

    private List<String> medals;

    public ComparableExample(Integer worldRank, String name, String sport, String country, List<String> medals) {
        this.worldRank = worldRank;
        this.name = name;
        this.sport = sport;
        this.country = country;
        this.medals = medals;
    }

    @Override
    public int compareTo(ComparableExample comparableExample) {
        return this.worldRank - comparableExample.worldRank;
    }

    public static void main(String[] args) {
        List<ComparableExample> obj = new LinkedList<>();
        List<String> medals1 = new LinkedList<>();
        medals1.add("Gold");
        medals1.add("Bronze");
        medals1.add("Silver");
        List<String> medals2 = new LinkedList<>();
        medals2.add("Gold");
        medals2.add("Silver");
        List<String> medals3 = new LinkedList<>();
        medals3.add("Gold");
        medals3.add("Bronze");
        obj.add(new ComparableExample(2, "Sarthak", "Table Tennis", "India", medals1));
        obj.add(new ComparableExample(3, "Sarthak", "Table Tennis", "India", medals2));
        obj.add(new ComparableExample(1, "Sarthak", "Table Tennis", "India", medals1));
        obj.add(new ComparableExample(5, "Sarthak", "Table Tennis", "India", medals3));
//        Collections.sort(obj);
//        Iterator<ComparableExample> iterator = obj.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().worldRank);
//        }
        obj.sort(new ComparatorExample());
        Iterator<ComparableExample> iterator = obj.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getMedals().size());
        }
    }
}
class ComparatorExample implements Comparator<ComparableExample> {
    @Override
    public int compare(ComparableExample t1, ComparableExample t2) {
        return t1.getMedals().size() - t2.getMedals().size();
    }
}
