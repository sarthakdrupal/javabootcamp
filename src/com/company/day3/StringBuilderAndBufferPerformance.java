package com.company.day3;

public class StringBuilderAndBufferPerformance {
    public void stringBuilderPerformace(){
        long start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 200000; i++){
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i);
            stringBuilder.append(", ");
        }
        System.out.println("StringBuilder-> " + (System.currentTimeMillis()-start));
    }
    public void stringBufferPerformace(){
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < 200000; i++){
            stringBuffer.append(i);
            stringBuffer.append(", ");
            stringBuffer.append(i);
            stringBuffer.append(", ");
        }
        System.out.println("StringBuffer-> " + (System.currentTimeMillis()-start));
    }
    public static void main(String[] args) {
        StringBuilderAndBufferPerformance performance = new StringBuilderAndBufferPerformance();
        performance.stringBufferPerformace();
        performance.stringBuilderPerformace();
    }
}
