package com.company.day2;

public class QuestionFive {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private int b;

    public QuestionFive() {

    }

    public QuestionFive(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public QuestionFive(QuestionFive questionSix) {
        this.a = questionSix.getA();
        this.b = questionSix.getB();
    }

    @Override
    public String toString() {
        return "a= " + getA() + " and " + "b= " + getB();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        QuestionFive obj1 = new QuestionFive(2, 3);
        QuestionFive obj2 = new QuestionFive(obj1);
        System.out.println(obj1);
        System.out.println(obj2);
        ShallowCopy shallowCopy1 = new ShallowCopy();
        ShallowCopy shallowCopy2 = (ShallowCopy) shallowCopy1.clone();
        System.out.println(shallowCopy1.getA());
        System.out.println(shallowCopy1.getB());
        System.out.println(shallowCopy1.getTest().getTest());
        shallowCopy1.getTest().setTest(123);
        System.out.println(shallowCopy2.getA());
        System.out.println(shallowCopy2.getB());
        System.out.println(shallowCopy2.getTest().getTest());


    }
}

class Test {
    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    private int test;
    Test(){
        this.test = 190;
    }
}

class ShallowCopy implements Cloneable {
    private int a;
    private int b;
    private Test test;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ShallowCopy shallowCopy = (ShallowCopy) super.clone();
        shallowCopy.setTest(new Test());
        return shallowCopy;
    }

    public ShallowCopy() {
        this.test = new Test();
        this.a = 10;
        this.b = 20;
    }
}
