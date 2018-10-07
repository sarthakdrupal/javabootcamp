package com.company.day3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Questionten implements Callable<Integer> {
    public int sum = 0;
    @Override
    public Integer call() {
        for (int i=1; i <= 1000; i++) {
            synchronized (this) {
                this.sum = this.sum + 1;
            }

        }
        return sum;
    }
}
class TestThreadPoll {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Questionten questionten = new Questionten();
        List<Future<Integer>> list = new LinkedList<>();
        for(int i =0; i< 5; i++) {
            list.add(executorService.submit(questionten));
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
