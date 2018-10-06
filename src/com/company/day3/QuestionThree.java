package com.company.day3;

class A implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            for(int i =0; i < 20; i++){
                System.out.println(QuestionThree.i);
                QuestionThree.i = QuestionThree.i  + 1;
                if(QuestionThree.i == 3) {
                    System.out.println(QuestionThree.i);
                    QuestionThree.i = 1;
                    notifyAll();
                }else{
                    try{
                        wait();
                    }catch (InterruptedException e) {

                    }
                }
            }
            notifyAll();
        }

    }
}
public class QuestionThree {
    public static int i = 1;
    public static void main(String[] args) throws InterruptedException{
        A obj = new A();
        Thread obj1 = new Thread(obj);
        Thread obj2 = new Thread(obj);
        Thread obj3 = new Thread(obj);
        obj1.start();
        obj2.start();
        obj3.start();
        obj1.join();
        obj2.join();
        obj3.join();
    }
}
