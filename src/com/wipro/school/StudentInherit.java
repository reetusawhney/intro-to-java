package com.wipro.school;

import java.util.ArrayList;

// Single Inheritance.Java allow only single inheritance.
public class StudentInherit extends ScienceInherit  {
    private int studentId;
    int classSize;
    private String studentName;
    private double gpa;
    ArrayList<Integer> grades = new ArrayList<>();

    public StudentInherit(){
        super("My intro to java");
        //super keyword below used to access parent class variable
       super.classSize= 50;

    }

    // method overwriting.Cloned same method name from super class and return with super
    // keyword and appending  extra string with +
    //Overridden method
    public String getBookName(){
        return super.getBookName() + ". Author: Marco Cruz"; }

    public static void main(String[] args) {
        // this will check StudentInherit constructor first
        StudentInherit student = new StudentInherit();
        student.showClassInfo();
    }

    public void showClassInfo(){
        //classSize was protected so can be call like below.
        System.out.println("The class is " + super.classSize);
        // this bookName variable was private so v used encapsulation(get and set method)
     //   setBookName("Interesting Intro to java");
        String bookName = getBookName();
        System.out.println("The bookName is " + bookName);
     //   System.out.println("average is " + average);
    }


}
