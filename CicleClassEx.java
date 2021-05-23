package com.maheshalladi;

import java.awt.*;

public class CicleClassEx {
    public static void main(String[] args) {

        //assuming the center and radius with attributes
        Circle c3=new Circle();
        c3.center=new Point(20,40);
        c3.radius=40;
        System.out.println((c3.center));
        System.out.println(c3.radius);


        //default class constructor values
        Circle c1=new Circle();
        System.out.println((c1.center));
        System.out.println((c1.radius));

        //Passing values by parameter to the constructor
        Circle c2=new Circle(new Point(2,4),34);
        System.out.println((c2.center));
        System.out.println((c2.radius));

        //passing a values via methods
        c1.setCenter(new Point(2,3));
        c1.setRadius(42);
        System.out.println((c1.center));
        System.out.println((c1.radius));

        //some methods in the circle class
        System.out.println(c1.getParameter());
        System.out.println(c1.getRadius());
    }
}
