import java.util.Scanner;

class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input number from user
        int number = input.nextInt();

        // Check divisibility by 5
        boolean isDivisible = (number % 5 == 0);

        // Print result
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        // Close scanner
        input.close();
    }
}