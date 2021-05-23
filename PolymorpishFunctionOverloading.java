package com.maheshalladi;

//method overloading static poly...compile time polymorphism
class MultiplyFun {

    // Method with 2 parameter
    static int Multiply(int a, int b)
    {
        return a * b;
    }

    // Method with the same name but 2 double parameter
    static double Multiply(double a, double b)
    {
        return a * b;
    }
}

class PolymorpishFunctionOverloading {
    public static void main(String[] args)
    {
        MultiplyFun a=new MultiplyFun();

        System.out.println(a.Multiply(2, 4));

        System.out.println(a.Multiply(5.5, 6.3));
    }
}