package Task4.Q4_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/****
 Q4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers).
 Create methods to add a new student, remove a student, and Display up a student's grade by name.
 ****/
public class HashMapExercise {
    private final Map<String, Integer> studentGrades;

    public HashMapExercise() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student "+ name +" has added to the Hashmap");
        System.out.println("----------------------------------------------------------------");
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
        System.out.println("Student "+ name +" has removed from the Hashmap");
        System.out.println("----------------------------------------------------------------");
    }

    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println(name + "'s grade: " + grade);
            System.out.println("----------------------------------------------------------------");
        } else {
            System.out.println("Student not found.");
            System.out.println("----------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMapExercise studentGrades = new HashMapExercise();

        while (true) {
            System.out.println("\nPlease choose one of the following options to perform relevant operations:");
            System.out.println("Student Grade System: \n1. Add Student\t2. Remove Student\t3. Display Student Grade\t4. Exit");
            System.out.print("Which operation would you like to perform? ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    studentGrades.addStudent(name, grade);
                }
                case 2 -> {
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.next();
                    studentGrades.removeStudent(removeName);
                }
                case 3 -> {
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.next();
                    studentGrades.displayGrade(displayName);
                }
                case 4 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }
}


/* Sample Output
Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 1
Enter student name: Naruto
Enter student grade: 98
Student Naruto has added to the Hashmap
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 1
Enter student name: Ithachi
Enter student grade: 99
Student Ithachi has added to the Hashmap
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 1
Enter student name: Sasuke
Enter student grade: 97
Student Sasuke has added to the Hashmap
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 1
Enter student name: Kakashi
Enter student grade: 95
Student Kakashi has added to the Hashmap
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 3
Enter student name to display grade: Ithachi
Ithachi's grade: 99
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 2
Enter student name to remove: Sasuke
Student Sasuke has removed from the Hashmap
----------------------------------------------------------------

Please choose one of the following options to perform relevant operations:
Student Grade System:
1. Add Student	2. Remove Student	3. Display Student Grade	4. Exit
Which operation would you like to perform? 4
Exiting program.
 */