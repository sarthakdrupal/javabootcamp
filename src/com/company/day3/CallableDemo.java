package com.company.day3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable {
    long sum = 0;
    @Override
    public Object call() {
        for(long i = 0; i < 1000000; i++) {
            this.sum = this.sum + i;
        }
        return this.sum;
    }

    public static void main(String[] args) throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> list = new LinkedList<>();
        for(int i =0; i< 10; i++) {
           list.add(executorService.submit(new CallableDemo()));
        }
        int i = 0;
        while (i < list.size()) {
            if(!list.get(i).isDone()) {
                System.out.println("Doing buiness --> " + i);
                continue;
            }
            i++;
        }
        list.forEach((e) -> {
            try {
                System.out.println(e.get());
            } catch (Exception exception) {

            }
        });
        executorService.shutdown();
    }
}
