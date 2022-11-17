package com.wipro.school;

public class ComputerScienceClassEncap {
    int classSize;
    String bookName, authorName;
    //Default constructor - created automatically
    //public ComputerScienceClassEncap(){}

    // Method overloading:same class name wid diff parameter
    public ComputerScienceClassEncap(int classSize) {
        //   this.classSize = classSize;
        //   bookName="Java Learning";

        // constructor chaining using this()
        this(classSize, "My java learning");
    }

    public ComputerScienceClassEncap(String bookName) {
//        this.bookName= bookName;
//        classSize=30;
//        authorName="Marco Cruz";

        this(30, bookName);

    }

    // Constructor chaining
    public ComputerScienceClassEncap(int classSize, String bookName) {
        this.bookName = bookName;
        this.classSize = classSize;
    }


    public static void main(String[] args) {
        // ComputerScienceClassEncap cs = new ComputerScienceClassEncap(40);
        //  ComputerScienceClassEncap cs1 = new ComputerScienceClassEncap(" newJava Learning");
        //  ComputerScienceClassEncap cs = new ComputerScienceClassEncap(30,"Java Learning");
        // System.out.println("This is the BookName " + cs.bookName);
        // System.out.println(cs.classSize);
        //   System.out.println("This is the authorName " + cs .authorName);/
}

// calling from StudentEncap class (by Encapsulation method)
        public void getStudent(){
            // Create new instance of StudentEncap class and call one of its method
            StudentEncap student1 = new StudentEncap();
            student1.setStudentName1("Tom");
        }


    }