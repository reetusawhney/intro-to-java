package com.wipro.fundamentals;

public class JavaAssignment {
    public static void main(String[] args){
        int side = 6;

        if( side <=2) {
            System.out.println("not a polygon");
        }
        else if( side ==3) {
            System.out.println(" Triangle");
        }
        else if( side ==4) {
            System.out.println(" quadrilateral");
        }
        else if( side ==5) {
            System.out.println(" pentagon");
        }
        else  {
            System.out.println("not a triangle, quadrilateral, or pentagon");
        }

    }

}
