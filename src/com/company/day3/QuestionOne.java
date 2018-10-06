package com.company.day3;

import javax.jws.soap.SOAPBinding;

//1. Print Odd and even numbers from 1 to 20 in ascending order using two threads;
public class QuestionOne {
    public static void main(String[] args) throws InterruptedException{
        PrintOddEven object = new PrintOddEven();
        Thread t1 = new Thread(object);
        Thread t2 = new Thread(object);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class PrintOddEven  implements Runnable{
    static int i=0;
    static boolean isEven;
    @Override
    public void run() {
        synchronized (this) {
            while (i<=20) {
                isEven = i%2 == 0;
                if(isEven) {
                    System.out.println(i);
                    i++;
                    try{
                        wait();
                    }catch (InterruptedException e){

                    }
                } else {
                    System.out.println(i);
                    i++;
                    notify();
                }
            }
            this.notify();
        }
    }

}
