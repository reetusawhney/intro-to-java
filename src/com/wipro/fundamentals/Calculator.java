package com.wipro.fundamentals;

import java.util.Scanner;

/**
 * Java Documentation comment.
 * This is a small calculator program..p-[
 * @author Reetu
 */

public class Calculator {


    public static void main(String[] args){

//        // Average of four numbers
//        int firstNumber= 80;
//        int secondNumber=  28;
//        int thirdNumber=50;
//        int fourthNumber=56;
//        int average;
//        int square;
//
//        /*
//        Store the result of Average
//         */
//
//     //   Person person = new Person();
//
//        average= (firstNumber + secondNumber+thirdNumber+fourthNumber)/4;
//        System.out.println(average);
//
//       // Random random = new Random();
//        //System.out.println(random.nextInt(100));

        //Square a number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        Calculator calculator= new Calculator();
        int result=calculator.squareNumber(Integer.parseInt(scanner.nextLine()));
        System.out.println("The Square is: " +result);

    }

    private int squareNumber(int num){
        return num*num;
    }
}
