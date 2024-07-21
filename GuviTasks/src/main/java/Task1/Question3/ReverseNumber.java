package Task1.Question3;

import java.util.Scanner;

/****
 A PROGRAM TO REVERSE THE GIVEN NUMBER
Have considered negative inputs as well
Also, have considered the input as numbers only. So for 1000 as input 1 will be printed. Not 0001.
 ****/

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number to reverse");
        Scanner sc = new Scanner(System.in);
        boolean isNegative = false;
        int a = sc.nextInt();
        System.out.println("Number Before Reversing " + a);
        if (a < 0) {
            isNegative = true;
            a *= -1;
        }
        int b = 0;
        while (a > 0) {
            b = (b * 10) + (a % 10);
            a = a / 10;
        }
        if (isNegative) System.out.println("Number After Reversing " + -b);
        else System.out.println("Number After Reversing " + b);
        sc.close();
    }
}
