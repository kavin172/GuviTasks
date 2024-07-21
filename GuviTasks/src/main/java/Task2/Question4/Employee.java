package Task2.Question4;

import java.util.Scanner;

/****
 Q4. Define a base class Person with attributes name and age.
Create a subclass Employee that inherits from Person and adds attributes like employeeID and salary.
Use the super keyword to initialize the Person attributes in the Employee constructor.
****/

public class Employee extends Person {
    private final int employeeID;

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    private final double salary;

    public Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.employeeID = id;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Details Below");

        System.out.print("Enter Employee Name : ");
        String name = s.next();

        System.out.print("Enter Employee Age : ");
        int age = s.nextInt();

        System.out.print("Enter Employee ID : ");
        int id = s.nextInt();

        System.out.print("Enter Employee Salary : ");
        double salary = s.nextDouble();

        Employee employee = new Employee(name, age, id, salary);

        System.out.println("Name : " + employee.getName());
        System.out.println("Age : " + employee.getAge());
        System.out.println("Employee ID : " + employee.getEmployeeID());
        System.out.println("Salary : " + employee.getSalary());

        s.close();

    }

}