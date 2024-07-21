package Task1.Question5;

import java.util.Scanner;

/****
A PROGRAM TO FIND THE FINAL PAYABLE AMOUNT AFTER DISCOUNT
Note: The input is considered as Integer as no constraint was given
****/

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter purchase amount ");
        int amount = sc.nextInt();
        if (amount < 500) {
            System.out.println("Payable amount :" + amount);
            System.out.println("There won't be any discount for your purchase, since your purchase amount is less than 500");
        }
        else if(amount<=1000){
            double payable = amount * 0.90;;
            System.out.println("Payable amount after 10% discount:" + payable);
        }
        else{
            double payable = amount * 0.80;;
            System.out.println("Payable amount after 20% discount:" + payable);
        }
    }
}
