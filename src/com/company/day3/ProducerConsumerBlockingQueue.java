package com.company.day3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {
    BlockingQueue<Integer> list;

    ProducerConsumerBlockingQueue(int capacity) {
        this.list = new LinkedBlockingQueue<>(capacity);
    }

    public void addToQueue(int num) {
        try {
            this.list.put(num);
        }catch (InterruptedException e) {

        }
    }

    public int remove() {
        try {
            int poped = list.take();
            return poped;
        }catch (InterruptedException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        ProducerConsumerBlockingQueue producerConsumer = new ProducerConsumerBlockingQueue(10);
        Thread t1 = new Thread(new Producer1(producerConsumer));
        Thread t2 = new Thread(new Consumer1(producerConsumer));
        t1.start();
        t2.start();
    }
}

class Producer1 implements Runnable {
    ProducerConsumerBlockingQueue producerConsumer;

    Producer1(ProducerConsumerBlockingQueue producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        int i = 0;
        Random random = new Random();
        while (i < 200000) {
            int num = random.nextInt(100000);
            producerConsumer.addToQueue(num);
            i++;
            System.out.println("produced ... " + num);
        }
    }
}

class Consumer1 implements Runnable {
    ProducerConsumerBlockingQueue producerConsumer;

    Consumer1(ProducerConsumerBlockingQueue producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 200000) {
            System.out.println("consumed ... " + producerConsumer.remove());
            i++;
        }
    }
}


