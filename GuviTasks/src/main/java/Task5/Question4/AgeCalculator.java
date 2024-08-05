package Task5.Question4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/****
 Q4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age java.time.LocalDate class.
 you have to help him to build this app using the
 Input : Enter your birthdate (yyyy-mm-dd): 1990-05-15
 Output: Your age is: 33 years, 4 months, and 13 days.
 ****/
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday (yyyy-mm-dd): ");
        String birthdayInput = scanner.nextLine();
        scanner.close();

        LocalDate birthday = LocalDate.parse(birthdayInput);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthday, currentDate);

        System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days");
    }
}


/****
 OUTPUT :
 Enter your birthday (yyyy-mm-dd): 1999-07-23
 Your age is: 25 years, 0 months, and 14 days
 ****/