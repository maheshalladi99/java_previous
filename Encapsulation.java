package com.maheshalladi;

public class Encapsulation {
    public static void main(String[] args) {
        Circle1 myObj = new Circle1();
        Circle1 myObj2=new Circle1();
        myObj.setName("John");
        System.out.println(myObj.getName());
        myObj2.setX(20);
        System.out.println(myObj2.getX());


    }

}
