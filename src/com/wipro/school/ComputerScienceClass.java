package com.wipro.school;

public class ComputerScienceClass {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentGrades(80,67,90);
        student.updateStudent (98.5);
    }
    public void getStudent(){
        // Create new instance of Student class and call one of its method
        Student student = new Student();
        student.studentName = "tom";
// not able to access method from student class due to private

        //new way for static specifier.. we have changed private to static Student class
//        Student.printStudentName();
        // can also update value of student directly w/o object
  //      Student.STUDENT_NAME = "Julia";

    }}

