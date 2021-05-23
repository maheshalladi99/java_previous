package com.maheshalladi;

import java.awt.*;
import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        //Scanner UserName=new Scanner(System.in);
        //System.out.printf("Please enter a number:");
        //int a=UserName.nextInt();
        //digitNum(a);
        //numberSeq(a);
        //numberStar(a);
        //numberStar1(a);
        //numberStar2(a);
        //objectPoint();
        //sayHi();
        //sayHi("mahesh");
        //pNumber(1,100);
        //arrayConcept();
/*
        int[] arr= getArray();
        int i;
        for(i=0;i<arr.length;i++){
            System.out.printf(arr[i]+" ");
        }
        */
        int i;
        int[] arr1=getnum();
        for (i=0;i<arr1.length;i++){
            System.out.printf(arr1[i]+" ");
        }

    }

    public static void digitNum(int a) {
        int temp=a;
        while(temp>0){
            int b=temp%10;
            System.out.println(b);
            temp=temp/10;
        }


    }



    public static void numberSeq(int a) {
        int i, j;
        for (i = 0; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.printf("\n");
        }
    }
    public static void numberStar(int a) {
        int i,j;
        for (i=0;i<=a;i++){
            for (j=1;j<=i;j++){
                System.out.print(" ");
            }
           for (j=1;j<=i;j++){
               System.out.print("*");
           }
            System.out.printf("\n");
        }


    }
    public static void numberStar1(int a) {
        int i,j;
        for (i=0;i<=a;i++){
            for (j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }
    public static void numberStar2(int a) {
        int i,j;
        for (i=0;i<=a;i++){
            for (j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for (j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.printf("\n");
        }
    }

    public static void objectPoint() {
        Point p1 = new Point();
        p1.x = 12;
        p1.y = 14;
        System.out.print(p1.x+" "+p1.y);
        change(p1);
        System.out.print(p1.x+" "+p1.y);
    }
    public static void change(Point p){
        p.x=14;
        p.y=90;

    }

    public static void sayHi() {
        System.out.printf("hai");

    }
    public static void sayHi(String name) {
        System.out.printf("hai"+name);

    }

    public static void pNumber(int a, int b) {
        int i,j,c=0;
        for (i=a;i<=b;i++){
            for (j=1;j<=i;j++){
                if(i%j==0){
                    c=c+1;
                }
            }
            if (c==2){
                System.out.printf(i+" ");

            }
            c=0;
        }
    }

    public static void arrayConcept() {
        int[] number=new int[5];
        number[0]=1;
        number[2]=1;
        number[1]=1;
        int[] number1={1,2,3};
        char[] name={'a','b','c','d'};

        int i;
        for(i=0;i<number1.length;i++){
            System.out.printf(number1[i]+" ");
        }
        for(i=0;i<name.length;i++){
            System.out.printf(name[i]+" ");
        }
    }



    public static int[] getArray() {
        return new int[] {1,2,3,4,5};

    }

    public static int[] getnum() {
        Scanner p=new Scanner(System.in);
        int i;
        int[] num=new int[5];
        for (i=0;i<5;i++){
            System.out.println("enter a value"+i+":");
            num[i]=p.nextInt();
        }
        return num;

    }

}
