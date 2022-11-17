package com.wipro.fundamentals;

import java.util.*;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        //Declaring Array
        String[] animals = new String[4];
        //   String [] animals = new String[4];
        //   String animals[] = new String[4];
        //   String animals [] = new String[4];

        //Initializing an array

        String[] animals2 = new String[]{"dog", "cat", "lion", "tiger"};
        String[] animals3 = {"dog", "cat", "lion", "tiger"}; // most common way to initialise array

        // anonymous array
//        new String[] = {"dog","cat","lion","tiger"};

//        for(String animal : animals){
//            System.out.println(animal);
//        }

//        String animal = animals3[2];
//        System.out.println(animal);
//
//        //we can call above lines like below in one line
//        System.out.println( animals3[3]);
//        System.out.println(animals3.length);
//        System.out.println(animals2.length);

        int[] numbers = {4, 1, 18, 9, 7};
//         sort arrays
//       Arrays.sort(numbers);
//        for( int number : numbers)
//        {
//            System.out.println(number);
//        }

        //       System.out.println(numbers[3]);

//      overriding an array element
//        numbers[3] =15;
//        System.out.println(numbers[3]);

        // adding a new value
//        numbers[6] = 50; // can't add new value as array's size is fixed


        // Duplicate an array element

        //       numbers[1] =18; // This will replace 1 by 18
        //       for( int i : numbers ) {
        //           System.out.println(i);


        //ArrayList
        //Declare an ArrayList
        ArrayList<String> colors = new ArrayList<>();
//        List<String> Colors3 = new ArrayList<>();

//        //Add to an arraylist
//        colors.add("red");
//        colors.add("blue");
//        colors.add("green");
////        for(String color :colors)
////            System.out.println(color);
//
//        colors.add("white"); //to add one more color
//        colors.add(0, "purple");// it added purple at o index and shifted all
        // Remove element from an Array
//          System.out.println(colors.remove(0));
//          System.out.println(colors.remove("blue"));
//        for (String color : colors) {
//            System.out.println(color);
 //       }

//        colors.remove( 4); // to remove particular index(out of bound exception)
        //Search an Array List
 //       System.out.println(colors.contains("yellow")); // to find the Array in list
 //       System.out.println(colors.contains("red")); // to find the array in list

        // Replace an ArrayList element
//        System.out.println((colors.set(2,"pink"))); // to replace the value at 2 index
//        for (String color : colors)
//           System.out.println(color);

//        System.out.println(colors.size());
//        colors.clear(); // to clear the arraylist
//        System.out.println(colors.size());
//        System.out.println(colors.isEmpty()); // to check the array is empty
//        ArrayList <Integer> counts = new ArrayList<>(); //Wrapper classes
////        counts.add(new Integer(123)); //this(new.Integer)is conversion from prim to reference
//        counts.add(123);// this is also the same as above line.its Users outboxing
//
//        for(Integer count :counts)
//            System.out.println(counts);

        ArrayList<Double> counts2 = new ArrayList<>();
        counts2.add(73.5);
        counts2.add(43.5);
        counts2.add(60.5);
        counts2.add(43.1);

        Collections.sort(counts2);

        for(Double count :counts2)
            System.out.println(count);


    }
}
