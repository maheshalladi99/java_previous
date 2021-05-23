package com.maheshalladi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        Scanner find=new Scanner(System.in);
        System.out.println("Plese enter the sze");
        int S= find.nextInt();
        for (int i=0;i<S;i++){
            System.out.println("Plese enter the "+i +"number:");
            int temp =find.nextInt();
            if(!a.contains(temp)){
                a.add(temp);
            }

        }
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

    }
}
