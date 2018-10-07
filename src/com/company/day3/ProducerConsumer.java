package com.company.day3;

import java.util.LinkedList;
import java.util.Random;

public class ProducerConsumer {
    LinkedList<Integer> list;
    int capacity;

    ProducerConsumer(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList();
    }

    public void addToQueue(int num) {
        if (capacity == list.size()) {
            try {
                this.wait();
            }catch(InterruptedException e) {

            }
        }
        this.list.push(num);
        this.notify();
    }

    public int remove() {
        if(list.size() == 0) {
            try {
                this.wait();
            }catch(InterruptedException e) {

            }
        }
        int poped = list.pop();
        this.notifyAll();
        return poped;
    }

    public static void main(String[] args) {
        ProducerConsumerBlockingQueue producerConsumer = new ProducerConsumerBlockingQueue(10);
        Thread t1 = new Thread(new Producer1(producerConsumer));
        Thread t2 = new Thread(new Consumer1(producerConsumer));
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {
    ProducerConsumerBlockingQueue producerConsumer;

    Producer(ProducerConsumerBlockingQueue producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        int i = 0;
        Random random = new Random();
        while (i < 200000) {
            synchronized (producerConsumer) {
                int num = random.nextInt(100000);
                producerConsumer.addToQueue(num);
                i++;
                System.out.println("produced ... " + num);
            }
        }
    }
}

class Consumer implements Runnable {
    ProducerConsumerBlockingQueue producerConsumer;

    Consumer(ProducerConsumerBlockingQueue producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 200000) {
            synchronized (producerConsumer) {
                System.out.println("consumed ... " + producerConsumer.remove());
                i++;
            }
        }
    }
}


