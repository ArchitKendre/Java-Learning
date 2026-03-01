package Chapter1;

class InchToMetreTable {
    public static void main(String[]args) {
        double inch, meter, counter;

        // 1m = 39.37 inches
        counter = 0;
        for (inch=1; inch<=144; inch++) {
            meter = inch/39.37;
            System.out.println(inch+ " inches in meters is "+ meter + " meters.");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter=0;
            }
        }
    }
}