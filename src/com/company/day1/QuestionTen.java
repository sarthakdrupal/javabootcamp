package com.company.day1;

public class QuestionTen {
    public static void main(String[] args) {
        QuestionTen obj = new QuestionTen();
        System.out.println(obj.compute(12,13));
        System.out.println(obj.compute(new Integer(12), new Integer(13)));
        System.out.println(obj.compute(12.0f,13.0f));
        System.out.println(obj.compute(12.0,13.0));
        System.out.println(obj.compute("abc","xyz"));
        System.out.println(obj.compute("abc","xyz" , "sarthak"));

    }
    public int compute(Integer a, Integer b){
        return a+b;
    }
    public int compute(int a, int b){
        return a*b;
    }
    public double compute(double a, double b){
        return a+b;
    }
    public float compute(float a, float b){
        return a*b;
    }
    public String compute(String a, String b){
        return a.concat(b);
    }
    public String compute(String a, String b, String c){
        return a.concat(b).concat(c);
    }
}
