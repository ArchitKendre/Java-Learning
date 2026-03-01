package Chapter1;/*
    This program illustrates the differences
    between int and double.

    Call this file Example3.java
 */

class Example3 {
    public static void main(String[]args) {
        int v; // this declares an int variable
        double x; // this declares a floating-point variable

        v=10;
        x=10.0;

        System.out.println("The original value of v is: " + v);
        System.out.println("The original value of x is: " + x);
        System.out.println();

        v = v/4;
        x = x/4;
        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);
    }
}
