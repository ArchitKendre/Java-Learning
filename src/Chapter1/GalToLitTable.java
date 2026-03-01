package Chapter1;

/*
    Try This 1-2
 */
class GalToLitTable {
    public static void main(String[]args) {
        double gallon, liters;
        int counter;

        counter=0;
        for (gallon = 1; gallon <=100; gallon++) {
            liters = gallon * 3.7854;
            System.out.println(gallon + " gallons is "
                                + liters + " liters.");

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}