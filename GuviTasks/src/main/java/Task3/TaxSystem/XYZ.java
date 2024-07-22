package Task3.TaxSystem;

import java.util.Scanner;

/****
 Q2.Create Interface Taxable with members sales Tax=7% and income Tax=10.5%. create abstract method calcTax().
a. Create class Employee(empId,name, salary) and implement Taxable to calculate income Tax on yearly salary.
b. Create class Product(pid,price,quantity) and implement Taxable to calculate sales Tax on unit price of product.
c. Create class for main method(Say XYZ), accept employee information and a product information from user and print
income tax and sales tax respectively
 ****/


public class XYZ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee information:");

        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Employee Name: ");
        String empName = scanner.next();

        System.out.print("Employee Salary: ");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("\nEnter product information:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();

        System.out.print("Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(pid, price, quantity);

        employee.calcTax();
        product.calcTax();

        System.out.println("\nIncome Tax for an employee with details: " + employee);
        System.out.println("Sales Tax for products with details: " + product);

        scanner.close();

    }
}

