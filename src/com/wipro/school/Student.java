package com.wipro.school;

import java.util.ArrayList;

public class Student {

//    static final String STUDENT_NAME = "Carlos";
    String studentName ; // after being private,it cant access by other class
    double gpa; // grade point average
    ArrayList<Integer> grades = new ArrayList<>();

//    private int age = 25;
//public void  printStudentName(){
//       System.out.println("The Student's name is " + STUDENT_NAME);
//        static void  printStudentName(){
//           System.out.println("The Student's name is " + STUDENT_NAME);
 //   public void printStudentInfo(){
 //       System.out.println("The student's name is " +STUDENT_NAME);
 //       System.out.println("The student's gpa " +gpa);

    public void printStudentInfo(){
        System.out.println("The Student name is" + studentName);
        System.out.println("The Student GPA is" + gpa);
    }
    // method overloading ..same method name with diff parameter
    public void updateStudent(String studentName){
        this.studentName = studentName;
    }
    public void updateStudent(double gpa){
        this.gpa = gpa;

    }
    public void updateStudent(String studentName,double gpa){
        this.gpa=gpa;
    }

    // varargs-variableargumentlist..we dont know how many param. v r pasng

    public void  setStudentGrades(int ... grades){
        if(grades.length > 0){
            for(int grade : grades ){
                this.grades.add(grade);
            }
        }
        System.out.println("Student  grades :" + this.grades);
        System.out.println("Student  gpa :" + this.gpa);

    }
}
