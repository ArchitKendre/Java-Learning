package Chapter2;

class Cal_Average {
    public static void main(String[] args) {
        double math = 100, science = 100, sst = 95, eng = 95, hindi = 85, ai = 100,
                sum = math + science + sst + eng + hindi + ai, percentage, total = 600;

        percentage = sum / total * 100;
        System.out.println("The total marks are: " + sum);
        System.out.println("The percentage is: " + percentage);
        System.out.println();

        if (percentage >= 90) {
            System.out.println("Your grade is A.");
        } else if (percentage >= 80) {
            System.out.println("Your grade is B");
        } else if (percentage >= 70) {
            System.out.println("Your grade is C");
        } else if (percentage >= 60) {
            System.out.println("Your grade is D");
        } else if (percentage >= 50) {
            System.out.println("Your grade is E");
        } else if (percentage >= 34) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Fail");
        }
    }
}
