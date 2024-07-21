package Task2.Question1;

import java.util.Scanner;

/****
Q1. Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person
****/
public class Person {

    private final String name;
    private final int age;

    public Person(String name) {
        this.name = name;
        this.age = 18; // Default age
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Person Name : ");
        String name = s.next();

        System.out.print("Enter Person Age : ");
        int age = s.nextInt();

        Person person1 = new Person(name); // To demonstrate default value
        Person person2 = new Person(name, age); // Actual Flow

        System.out.println("Person name with default age 18"); // Just to demonstrate I have added this line.
        person1.displayInfo();

        System.out.println("Person name with given age"); // Actual Flow
        person2.displayInfo();

        s.close();

    }

}