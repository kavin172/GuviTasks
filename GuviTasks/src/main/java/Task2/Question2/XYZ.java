package Task2.Question2;

import java.util.Scanner;

/****
 Q2. Create class Product (pid, price, quantity) with parameterized constructor. Create a main function in different class (say XYZ) and perform following task:
a. Accept five product information from user and store in an array
b. Find Pid of the product with the highest price.
c. Create method (with array of product's object as argument) in XYZ class to
calculate and return the total amount spent on all products. (amount spent on
single product=price of product * quantity of product
****/

public class XYZ {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter Total Number of the Products : ");
        int n = s.nextInt();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product " + (i + 1) + " information : ");

            System.out.print("Product ID: ");

            int productId = s.nextInt();

            System.out.print("Price: ");
            double price = s.nextDouble();

            System.out.print("Quantity: ");
            int quantity = s.nextInt();

            products[i] = new Product(productId, price, quantity);
        }

        int maxPricePid = pidOfMaxPriceProduct(products);
        System.out.println("Product ID with the highest price: " + maxPricePid);

        double totalAmountSpent = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        s.close();

    }

    public static int pidOfMaxPriceProduct(Product[] products) {

        double maxPrice = 0.0;

        int maxPricePid = -1;

        for (Product product : products) {

            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePid = product.productId;
            }
        }

        return maxPricePid;
    }

    public static double calculateTotalAmount(Product[] products) {

        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.price * product.quantity;
        }
        return totalAmountSpent;
    }

}