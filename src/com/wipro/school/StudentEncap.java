package com.wipro.school;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentEncap {
   private String studentName1;
   private double gpa1;
   ArrayList<Integer> grades1 = new ArrayList<>();

   // Getter &Setter method->Encapsulation

    public String getStudentName1() {
        return studentName1;
    }

    public void setStudentName1(String studentName1) {
        this.studentName1 = studentName1;
    }

    public double getGpa1() {
        return gpa1;
    }

    public void setGpa1(double gpa1) {
        if(gpa1 >= 2.0){ // Guard condition
             this.gpa1 = gpa1;
        }
    }

    public ArrayList<Integer> getGrades1() {
        return grades1;
    }

    public void setGrades1(ArrayList<Integer> grades1) {
        this.grades1 = grades1;
    }
}
