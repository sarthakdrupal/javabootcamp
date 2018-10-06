package com.company.day3;

public class QuestionTwo {
    public static void main(String[] args) throws InterruptedException{
        PrintPrime printPrime = new PrintPrime();
        Thread t1 = new Thread(printPrime);
        Thread t2 = new Thread(printPrime);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}

class PrintPrime implements Runnable {
    public static int i = 0;
    public static boolean prime = true;
    public static boolean nonPrime = true;
    @Override
    public void run() {
        synchronized (this) {
            while (i <= 20) {
                if (isPrime(i)) {
                    try {
                        System.out.println("prime number-> " + i);
                        i++;
                        if(prime){
                            prime=false;
                            wait();
                        }else {
                            notify();
                        }

                    } catch (InterruptedException e) {

                    }
                } else {
                    System.out.println("non prime-> " + i);
                    i++;
                    notify();
                }
            }
            notify();
        }
    }

    public static boolean isPrime(int num) {
        boolean flag = false;
        int index = 2;
        while (index <= num / 2) {
            // condition for nonprime number
            if (num % index == 0) {
                flag = true;
                break;
            }
            ++index;
        }
        return !flag;
    }
}
