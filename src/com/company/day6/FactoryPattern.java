package com.company.day6;

public class FactoryPattern {

    public OS getInstance(String type) {
        switch (type){
            case "OPEN":
                return new Android();
            case "CLOSED":
                return new IOS();
            default:
                return new Symbian();
        }
    }
}
interface OS{
    void type();
}

class Android implements OS {
    @Override
    public void type() {
        System.out.println("Open source");
    }
}
class IOS implements OS {
    @Override
    public void type() {
        System.out.println("closed source");
    }
}
class Symbian implements OS {
    @Override
    public void type() {
        System.out.println("old os");
    }
}
class TestFactory {
    public static void main(String[] args) {
        FactoryPattern pattern = new FactoryPattern();
        OS os = pattern.getInstance("CLOSED");
        os.type();
    }
}