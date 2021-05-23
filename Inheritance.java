package com.maheshalladi;

public class Inheritance {
    protected String brand="TATA";
    double price=1200000;
    public void message(){
        System.out.printf("this is in class inheritance");
    }
}
class Car extends Inheritance{
    String color="white";
    Integer wheel=6;
    public Integer carLoanPaid(){
        Integer x=200000;
        return x;
    }

    public static void main(String[] args) {
        Car myObj=new Car();
        String a=myObj.brand;
        System.out.println("my car is: " +
                ""+myObj.brand+" and its price is "+myObj.price+
                " and color is "+myObj.color+" and i have paid "+myObj.carLoanPaid());

    }



}