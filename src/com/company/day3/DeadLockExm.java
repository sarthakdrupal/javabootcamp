package com.company.day3;

class Abc {

}
class Xyz {

}
public class DeadLockExm {
    public static void main(String[] args) {
        Abc abc = new Abc();
        Xyz xyz = new Xyz();
        Runnable r1 = new Thread(()->{
            synchronized (abc){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {

                }
                synchronized (xyz){
                    System.out.println("hello1");
                }
            }
        });
        Runnable r2 = new Thread(()->{
            synchronized (xyz){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e) {

                }
                synchronized (abc){
                    System.out.println("hello2");
                }
            }
        });
        ((Thread) r1).start();
        ((Thread) r2).start();
    }
}
