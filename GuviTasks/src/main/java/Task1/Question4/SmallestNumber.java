package Task1.Question4;

import java.util.Scanner;

//A PROGRAM TO FIND THE SMALLEST OF THREE NUMBERS
public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("Enter the third number :");
        int c = sc.nextInt();
        if (a < b && a < c) {
            System.out.println(a + " is the smallest among 3");
        } else if (b < c) {
            System.out.println(b + " is the smallest among 3");
        } else {
            System.out.println(c + " is the smallest among 3");
        }
        sc.close();
    }
}
