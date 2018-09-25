package com.company.day1;

public enum House {

    ONE_BHK(20000),
    TWO_BHK(40000);

    private int price;

    House(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        System.out.println(House.ONE_BHK.getPrice());
        System.out.println(House.ONE_BHK);
    }
}
