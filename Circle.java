package com.maheshalladi;

import java.awt.*;

public class Circle {
    Point center;
    double radius;
    //default constructor
    Circle(){
        radius=30;
        center=new Point(3,4);

    }
    // passing a values through a parameters of this constructor
    Circle(Point c1,double r1){
        this.center=c1;
        this.radius=r1;
    }
    double getParameter(){
        return 2*(Math.PI)*radius;
    }
    double getRadius(){
        return (Math.PI)*radius*radius;
    }

    //setting a values by methods

    void setRadius(double newRadius){
        radius=newRadius;
    }
    void setCenter(Point newCenter){
        center=newCenter;
    }

}
