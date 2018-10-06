package com.company.day3;

public class StringBuilderThreadSafeExample implements Runnable{
    private StringBuffer builder;
    StringBuilderThreadSafeExample(StringBuffer builder){
        this.builder = builder;
    }
    public static void main(String[] args) throws InterruptedException {
        StringBuilderThreadSafeExample obj = new StringBuilderThreadSafeExample(new StringBuffer());
        Thread th = new Thread(obj);
        Thread th1 = new Thread(obj);
        th.start();
        th1.start();
        th.join();
        th1.join();
        System.out.println(obj.builder.length());
    }

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            this.builder.append(i);
        }
    }
}
