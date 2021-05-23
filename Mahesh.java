package com.maheshalladi;

public class Mahesh {
    public static void sayHi() {
        System.out.println("This method says you hai");

    }

    private static void addTwo(int a, int b) {
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        System.out.println("this text is from the class Mahesh");
        int a=10;
        int b=20;
        addTwo(a,b);
        sayHi();
        Me.sayName();

    }


}
