package com.wipro.fundamentals;

public class Person {
    int age;
    double height;

    public Person(){
        age=36;
        height=5.9;
        System.out.println("The age of the Person is " +age);
        System.out.println("The age of the Height is " +height);

    }

    public static void main(String[] args) {
        Person personObj = new Person();


    }
}

