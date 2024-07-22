package Task4.Q2_Voter;

import java.util.Scanner;
/****
 Q2. Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should throw a checked exception if age is less than 18.
The message of exception is "invalid age for voter "
 ****/

public class VoterManagementSystem {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Voter ID : ");
            int id = s.nextInt();
            System.out.print("Enter Name : ");
            String name = s.next();
            System.out.print("Enter Age : ");
            int age = s.nextInt();
            Voter voter1 = new Voter(id, name, age);
            System.out.println(voter1);

        } catch (AgeNotValidException e) {
            System.out.println("AgeNotValidException: " + e.getMessage());
        }
    }
}

/* Sample outputs

Enter Voter ID : 172
Enter Name : Kavin
Enter Age : 24
Voter{voterId=172, name='Kavin', age=24}

Enter Voter ID : 175
Enter Name : Kavinraj
Enter Age : 14
AgeNotValidException: Invalid age for voter
 */