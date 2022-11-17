package com.wipro.cars;

import java.io.FileNotFoundException;
import java.sql.SQLOutput;

// Here Audi is called a concrete class.
public class Audi extends Car {
    static int[] numbers = {1, 2, 3};

    public Audi() {
        //     make = "Audi";
        model = "A6";
        year = 2010;
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Throw "unchecked"an exception
        //   throw new RuntimeException("This is an exception");
        //  throw new FileNotFoundException();
//          this handles the exception

//        Audi audi = new Audi();
//        try {
// //          System.out.println(audi.make.length());
//   //         System.out.println(numbers[3]);
//           System.out.println(23/0);
//        } catch (NullPointerException e) {
//            System.out.println("An exception has occurred");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("An array exception");
//        }
//        // finally block ll always run no matter what.e.g for database connection
//        finally {
//            System.out.println("we reached at finally block");
//        }
//
//        System.out.println("Bye");
//
//    }

        Audi audi = new Audi();
        audi.generateStackOverflow(1);
    }

    // this is recursive method.SackOverflow error example
    private void generateStackOverflow(int value) {
        generateStackOverflow(value);
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }
}
