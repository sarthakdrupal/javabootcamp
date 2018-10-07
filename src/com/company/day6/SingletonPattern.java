package com.company.day6;

public class SingletonPattern {
    private static SingletonPattern singletonPattern;
    private SingletonPattern() {

    }
    public static SingletonPattern getInstance() {
        return singletonPattern == null ?
                singletonPattern = new SingletonPattern():  singletonPattern;
    }
}
class TestSingleton {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern.equals(singletonPattern1));
    }
}
