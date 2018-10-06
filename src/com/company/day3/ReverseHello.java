package com.company.day3;

class Print1 implements Runnable{
    @Override
    public void run() {
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread t3 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("Thread Number -> "  + Thread.currentThread().getName());
                    }

                });
                t3.start();
                try {
                    t3.join();
                }catch (InterruptedException e) {

                }
                System.out.println("Thread Number -> "  + Thread.currentThread().getName());
            }
        });
        t2.start();
        try {
            t2.join();
        }catch (InterruptedException e) {

        }
        System.out.println("Thread Number -> "  + Thread.currentThread().getName());
    }
}
public class ReverseHello {
    public static void main(String[] args) throws InterruptedException{
        Print1 obj = new Print1();
        Thread t1 = new Thread(obj);
        t1.start();
        t1.join();
    }
}
