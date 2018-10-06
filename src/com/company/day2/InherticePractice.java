package com.company.day2;

import com.sun.xml.internal.ws.api.ComponentEx;

class ParentExample {
    int x = 89;
    ParentExample() {
        System.out.println("default");
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class ChildExample extends ParentExample{
    static int x = 890;



    public void show(){
        System.out.println("hello");
    }
}

public class InherticePractice {
    public static void main(String[] args) {
        ParentExample parentExample = new ChildExample();
        System.out.println(parentExample.x);
    }


}
