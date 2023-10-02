import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;

        System.out.println("Please enter in your first integer.");
        if (scan.hasNextInt()) {
            numOne = scan.nextInt();
            System.out.println("Please enter in your second integer");
        }
        else
            System.out.println("Invalid input.");
        if (scan.hasNextInt()) {
                numTwo = scan.nextInt();
                if (numOne > numTwo) {
                    System.out.println(numOne + " is greater than " + numTwo);
                }
                else if (numTwo > numOne) {
                    System.out.println(numTwo + " is greater than " + numOne);
                }
                else if (numTwo == numOne) {
                    System.out.println(numOne + " is equal to " + numTwo);
                }
            }
        else
            System.out.println("Invalid input.");
    }
}