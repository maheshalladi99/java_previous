package com.maheshalladi;

import java.util.ArrayList;
import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
        ArrayList<zohoClass> database=new ArrayList<>();
        database.add(new zohoClass(1,"x",11,"d1","deg1","r1"));
        database.add(new zohoClass(2,"n2",22,"d2","deg2","n1"));
        database.add(new zohoClass(3,"n3",33,"d3","deg3","n1"));
        database.add(new zohoClass(4,"n4",44,"d4","deg4","n1"));
        database.add(new zohoClass(5,"n4",55,"d5","deg5","n2"));
        database.add(new zohoClass(6,"n5",66,"d6","deg6","n5"));
        database.add(new zohoClass(7,"n6",77,"d7","deg7","n3"));
        database.add(new zohoClass(8,"n7",88,"d8","deg8","n4"));
        database.add(new zohoClass(9,"n8",99,"d9","deg9","n8"));
        database.add(new zohoClass(10,"n9",101,"d10","geg10","n8"));
        Scanner i=new Scanner(System.in);

        String s=i.next();
        String x1="n2";
        System.out.println(s.toString()== x1.toString());
        System.out.print(database.get(1).getName()==s);
    }
}
