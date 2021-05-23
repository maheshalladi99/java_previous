package com.maheshalladi;

import java.util.Scanner;

public class ClassAndObject1 {
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[3];
        widhtAndHeight(rectangles);
        printRectangles(rectangles);
        area(rectangles);
        perimeter(rectangles);
    }

    public static void widhtAndHeight(Rectangle[] rectangles) {
        Scanner input=new Scanner(System.in);
        for(int i = 0; i< rectangles.length; i++){
            System.out.println("do you want to add width and height:" +i+ " ? (y/n)");
            char choice=input.next().charAt(0);
            if(choice=='y'){
                /*
                rectangles[i].setWidth(23); //=new Rectangle().setWidth(23);
                rectangles[i].setHeight(34);//= new Rectangle().setHeight(input.nextDouble());
                rectangles[i].setWidth(23)=new Rectangle().setWidth(23);

                 */
                rectangles[i]=new Rectangle(input.nextDouble(),input.nextDouble());
            }
            else{
                rectangles[i]=new Rectangle();
            }

        }

    }
    public static void printRectangles(Rectangle[] rectangles) {
        System.out.println("The rectangles are:");
        for (int i=0;i< rectangles.length;i++)
            System.out.println("The width and height of a"+i+" rectangle is "+rectangles[i].getWidth()+" and "+rectangles[i].getHeight());


    }

    public static void area(Rectangle[] rectangles) {
        System.out.println("The rectangles area are:");
        for (int i=0;i< rectangles.length;i++)
            System.out.println(rectangles[i].getArea());


    }
    public static void perimeter(Rectangle[] rectangles) {
        System.out.println("The rectangles area are:");
        for (int i=0;i< rectangles.length;i++)
            System.out.println(rectangles[i].getPerimeter());


    }


}
