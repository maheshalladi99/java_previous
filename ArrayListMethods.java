package com.maheshalladi;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> actualList=new ArrayList<>();
        System.out.print("plesse enter the siize :");
        Scanner p = new Scanner(System.in);
        int s=p.nextInt();
        for (int i=0;i<s;i++){
            System.out.println("enter "+(i+1)+":");
            actualList.add(p.nextInt());
        }
        System.out.println("Menu:");
        System.out.println("1.ADD");
        System.out.println("2.REMOVE");
        System.out.println("3.DISPLAY");
        System.out.println("4.EXIT");
        System.out.println("Please enter your choice:");
        int choice= p.nextInt();


        while (true){
            switch (choice){
                case (1):{
                    System.out.println("please enter the number want to add:");
                    int temp1= p.nextInt();
                    System.out.println("Actual one is:"+actualList);
                    actualList.add(temp1);
                    System.out.println("Change one is:"+actualList);
                    System.out.println("ADDED");

                } break;

                case (2):{
                    System.out.println("please enter the number want to remove:");
                    int temp1= p.nextInt();
                    System.out.println("Actual one is:"+actualList);
                    if(actualList.contains(temp1)){
                        actualList.remove(temp1);
                    }
                    else {
                        System.out.println("NOT existed");
                    }
                    System.out.println("Change one is:"+actualList);
                    System.out.println("REMOVED");

                }break;
                case (3):{
                    System.out.println("your list is:"+actualList);


                }break;
                case (4):{
                    System.out.println("GOOD BYE! THANK YOU");

                }break;
            }break;
        }

    }
}
