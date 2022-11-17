package com.wipro.fundamentals;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // two D Array

        int[][] quizGrades = {
                {95, 89, 110},
                {93, 81}
        };

        int first = quizGrades[0][0];
//        int first1= quizGrades[0][1];
//        int first2= quizGrades[0][2];
//        int second= quizGrades[1][0];
//        int second1= quizGrades[1][1];

        //       System.out.println(first);
//        System.out.println(first1);
//        System.out.println(first2);
//        System.out.println(second);
//        System.out.println(second1);


        //print the contents of the 2d array (in better way which is for loop)
//
//        for(int i =0;i < quizGrades.length;i++){ //checks how many rows r thr
//            for(int j=0 ; j <quizGrades[i].length;j++) // how many column r thr
//                System.out.println(quizGrades[i][j]);


        //3d Array
        int[][][] quizGrades2 = {
                {{95, 79, 73}, {85, 100, 65}},
                {{90, 50, 68}, {98, 94, 99}}
        };
        System.out.println(quizGrades2[0][1][2]);

    }
}
