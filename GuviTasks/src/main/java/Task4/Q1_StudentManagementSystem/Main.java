package Task4.Q1_StudentManagementSystem;

import java.util.Scanner;

/****
 Q1. Ramesh is developing a student management system for a university. In this system, you have a Student class to represent student information.
You are asked to help Ramesh to handle exception which can be occurred into program according to following Scenarios:
class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.
 ****/

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Student Details");
            System.out.print("Enter Student Roll number : ");
            int rollNumber = s.nextInt();
            System.out.print("Enter Student Name : ");
            String name = s.next();
            System.out.print("Enter Student Age : ");
            int age = s.nextInt();
            System.out.print("Enter Student Course : ");
            String course = s.next();
            Student student1 = new Student(rollNumber, name, age, course);
            System.out.println(student1);

        } catch (AgeNotWithinRangeException e) {
            System.out.println("AgeNotWithinRangeException: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("NameNotValidException: " + e.getMessage());
        }
    }
}

/* Possible Outputs

Student Details
Enter Student Roll number : 178
Enter Student Name : Rahul*
Enter Student Age : 19
Enter Student Course : CSE
NameNotValidException: Name should not contain numbers or special symbols.

Student Details
Enter Student Roll number : 178
Enter Student Name : Rahul@
Enter Student Age : 19
Enter Student Course : CSE
NameNotValidException: Name should not contain numbers or special symbols.

Student Details
Enter Student Roll number : 178
Enter Student Name : Rahul178
Enter Student Age : 19
Enter Student Course : CSE
NameNotValidException: Name should not contain numbers or special symbols.

Student Details
Enter Student Roll number : 172
Enter Student Name : Kavin
Enter Student Age : 22
Enter Student Course : CSE
AgeNotWithinRangeException: Age should be between 15 and 21.

Student Details
Enter Student Roll number : 173
Enter Student Name : Yuvi*
Enter Student Age : 24
Enter Student Course : ECE
AgeNotWithinRangeException: Age should be between 15 and 21.

Student Details
Enter Student Roll number : 174
Enter Student Name : Raj
Enter Student Age : 19
Enter Student Course : CSE
Student	{rollNo=174, name='Raj', age=19, course='CSE'}

 */