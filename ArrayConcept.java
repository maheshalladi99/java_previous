package com.maheshalladi;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        int[][] integers={{1,2,3},{5,6,7},{8,9,10}};
        int sum=0;
        System.out.println("the array is"+Arrays.deepToString(integers));
        for (int i=0;i< integers.length;i++){
            for (int j=0;j<integers[i].length;j++){
                sum=sum+integers[i][j];
            }
            System.out.println("first row:"+sum);
            sum=0;
        }
        System.out.println("the array is"+Arrays.deepToString(integers));
        for (int i=0;i< integers.length;i++){
            for (int j=0;j<integers[i].length;j++){
                sum=sum+integers[j][i];
            }
            System.out.println("first colom:"+sum);
            sum=0;
        }
    }
}
