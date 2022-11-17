package com.wipro.fundamentals;

public class Loops {

    public static void main(String[] args) {
        int repeat = 0;

//        // While loop :It checks condition to being true
//        while (repeat < 6) {
//            repeat++;
//     //       System.out.println("I am While Loop Repeat=" + repeat);
//        }

        // Do-While loop: it will execute at least once
//        do {
//            System.out.println("I am doing do while loop" + repeat);
//            repeat++;
//        }
//        while (repeat < 10);
//
        // For loop

//        for (int i = 0; i < 5; i++ )
//        System.out.println("I am for loop" +i );
//
        //Enhance loop
        String[] names= {"Jane","Ram","John","Soi"};
        for(String name : names) {
            System.out.println(name);
        }
    }
}

