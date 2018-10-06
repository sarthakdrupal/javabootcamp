package com.company.day3;

import java.util.TreeSet;

public class MaxValue {
    static int max1=0;
    static int max2=0;
    static int max3=0;
    static int max4=0;
    public static void main(String[] args) throws InterruptedException {
        int arr[] = {12,3,34,1,1,3,1,3,2,3,44,667,90};
        int batch1 = arr.length/4;
        int batch2 = (arr.length - batch1)/4;
        int batch3 = (arr.length - (batch1+batch2))/4;
        int batch4 = arr.length - (batch1+batch2+batch3);

        Long startTime = System.currentTimeMillis();
        Thread thread = new Thread(() -> {
            int i = 0 ;
            while (i< batch1) {
                if (max1 < arr[i]) {
                    max1 = arr[i];
                }
                i++;
            }
        });
        Thread thread1 = new Thread(() -> {
            int l = batch1;
            while (l < (batch1 + batch2)) {
                if (max2 < arr[l]) {
                    max2 = arr[l];
                }
                l++;
            }
        });
        Thread thread2 = new Thread(() -> {
            int j = batch1 + batch2;
            while (j< (batch1 + batch2 + batch3)) {
                if (max3 < arr[j]) {
                    max3 = arr[j];
                }
                j++;
            }
        });
        Thread thread3 = new Thread(() -> {
            int k = batch1 + batch2 + batch3 ;
            while (k < (batch1+batch2 + batch3+batch4)) {
                if (max4 < arr[k]) {
                    max4 = arr[k];
                }
                k++;
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread.join();
        thread1.join();
        thread2.join();
        thread3.join();
        TreeSet<Integer> set = new TreeSet();
        set.add(max1);
        set.add(max2);
        set.add(max3);
        set.add(max4);
        System.out.println(set.last());
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
