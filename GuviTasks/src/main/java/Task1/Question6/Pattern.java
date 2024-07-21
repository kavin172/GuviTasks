package Task1.Question6;

import java.util.Scanner;

//A PROGRAM TO PRINT BELOW PATTERN BASED ON GIVEN INPUT, EG IF I GIVE INPUTS AS 5 IT SHOULD PRINT BELOW PATTERN
//55555
//54444
//54333
//54322
//54321
public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the number to print pattern");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>0;i--){
            int p = a;
            for(int j=a;j>0;j--){
                if(i<=j){
                    System.out.print(p--);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
