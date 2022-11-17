package com.wipro.fundamentals;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators

        int a = 35;
        int b = 10;
        int c = a + b;

        //    System.out.println(c);

        //Reference type
        String car = "Toyota";
        car = car + " has awesome engine"; //String Concatenation
        //   System.out.println(car);
        c = a - b;
        c = a * b;
        c = a / b;

        // Modulas %
        c = a % b;

        // System.out.println(c);

        // Increment & Decrement
        a++;
        a--;
        //  System.out.println(a);

        // Logical complement operators
        boolean bool = true;
        bool = !bool;
        //       System.out.println(bool);

        //        Relational Operator
        //        System.out.println( a >= b);
        //        Logical operators

        boolean x = false;
        boolean y = false;
        // && AND logic will check if both value or TRUE
        if (x && y) {
            //          System.out.println("print boolean x and y");
        }

        //  || OR logic will check if any value is TRUE
        if (x || y) {
            // System.out.println(" I have TRUE value so will print boolean x and y");
        }

        // ==
        if (x == y) {
            //    System.out.println(" We are equal so will print boolean x and y");
        }

        // assignment operators (=,+=,-=)
        a += 5; // it ll add 5 to a
        //      System.out.println(a);
    }
}
