package com.company.day3;

public class ClassLevelLock {
    public synchronized static void pintMe() {
        for(int i=0; i< 10; i++){
            System.out.println(i + Thread.currentThread().getName());
        }
    }
}
class Test {
    public static void main(String[] args) {
        Runnable r1 = new Thread(()->{
            ClassLevelLock.pintMe();
        });
        ((Thread) r1).start();
        Runnable r2 = new Thread(()->{
            ClassLevelLock.pintMe();
        });
        ((Thread) r2).start();
        Runnable r3 = new Thread(()->{
            ClassLevelLock.pintMe();
        });
        ((Thread) r3).start();
        Runnable r4 = new Thread(()->{
            ClassLevelLock.pintMe();
        });
        ((Thread) r4).start();
    }
}
