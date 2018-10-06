package com.company.day3;

public class MyThreadExample extends Thread  {
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
            System.out.println("My thread run -> " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i =0; i< 10; i++){
            (new MyThreadExample()).start();
            (new Thread(new MyRunnable())).start();
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My runnable -> " + Thread.currentThread().getPriority());
    }
}
