package Task4.Q3_WeekDays;

import java.util.Scanner;

/****
 Q3. Store name of weekdays in an array (starting from "Sunday" at 0 index). Ask day position from user and print day name.
 Handle array index out of bound exception and give proper message if user enters day index outside range (0-6).
 ****/

public class WeekDays {
    public static void main(String[] args) {

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter the day position (0-6): ");
            int dayPosition = scanner.nextInt();

            if (dayPosition < 0 || dayPosition > 6) {
                throw new ArrayIndexOutOfBoundsException("The number which you have entered is not in a valid range, please enter the number between 0 to 6");
            }

            System.out.println("Day name: " + weekdays[dayPosition]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/* sample outputs

Please enter the day position (0-6): 7
Array Index Out of Bounds Exception: The number which you have entered is not in a valid range, please enter the number between 0 to 6

Please enter the day position (0-6): 5
Day name: Friday

 */
