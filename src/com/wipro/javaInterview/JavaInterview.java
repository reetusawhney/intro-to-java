package com.wipro.javaInterview;

public class JavaInterview {
        static int i = 1;
        public static void main(String args[]) {
            System.out.println(i++);
            myMethod(i);
            System.out.println(i);
        }
        public static void myMethod(int i) {
            i += 2;
        }
    }

