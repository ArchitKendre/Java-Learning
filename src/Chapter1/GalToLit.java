package Chapter1;/*
    Try This 1-1
    This program converts gallon to liters
    Name this file GalToLit.java
 */

class GalToLit {
    public static void main(String[]args) {

        double gallon = 10, liters;
        liters = gallon * 3.7854; // 1 gallon = 3.7854 litres

        System.out.println(gallon + " gallons in liters is: "+ liters);
    }
}
