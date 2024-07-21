package Task1.Question2;

import java.util.Scanner;

//A PROGRAM TO FIND WHETHER A GIVEN NUMBER IS POSITIVE OR NEGATIVE

public class NegativeOrPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number to validate");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Given number " + n + " is a positive number");
        } else if (n < 0) {
            System.out.println("Given number " + n + " is a negative number");
        } else {
            System.out.println("Given number " + n + " is neither positive nor negative");
        }
        sc.close();
    }
}
