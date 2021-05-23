package com.maheshalladi;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int UserRoll;
        String UserName;
        Boolean UserAcceptance;
        Float UserPercent;
        Scanner input= new Scanner(System.in);
        System.out.println("please enter your name :");
        UserName =input.nextLine();
        System.out.println("please enter your roll number");
        UserRoll= input.nextInt();
        System.out.println("please enter your acceptance");
        UserAcceptance=input.nextBoolean();
        System.out.println("please enter your percent");
        UserPercent=input.nextFloat();

        System.out.println("These are the details:");
        System.out.println("Your name:"+UserName+"\nYour Roll:"+UserRoll+"\nYour acceptance:"+UserAcceptance+"\nYour percent:"+UserPercent);

        System.out.println("please enter a value :");
        int a=input.nextInt();
        System.out.println("please enter a value :");
        Float b=input.nextFloat();
        System.out.println("please enter a value :");
        Byte c=input.nextByte();
        System.out.println("please enter a value :");
        Long d=input.nextLong();

        System.out.printf("\nyour value a:"+a+"\nyour value b:"+b+"\nyour value c:"+c+"\nyour value d:"+d);

        System.out.println("\nthese are the outputs"+(a+b+c+d)+(a-b-c-d));


    }
}
