package Task3.BookManagementSystem;

import java.util.Scanner;

/****
Q1.Management System
a.Design a Java program that uses OOP principles to model the Book.Create two classes: Book and Library.
The Book class should have attributes such as bookID, title, author, and isAvailable.
The Library class should include an array to store book objects.
b.Provide methods to add books, remove book ,search books (using id)and display books. Write a Java program that demonstrates the use of these classes and methods by allowing the
user to interact with the library system.
 ****/


public class BookManagementSystem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the book capacity in the library: ");
        int n = s.nextInt();
        s.nextLine();

        Library library = new Library(n);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book ID: ");
                    int id = s.nextInt();
                    s.nextLine();
                    System.out.print("Enter book title: ");
                    String title = s.nextLine();
                    System.out.print("Enter author name: ");
                    String author = s.nextLine();
                    Book newBook = new Book(id, title, author, true);
                    library.addBook(newBook);
                }
                case 2 -> {
                    System.out.print("Enter book ID to remove: ");
                    int removeId = s.nextInt();
                    library.removeBook(removeId);
                }
                case 3 -> {
                    System.out.print("Enter book ID to search: ");
                    int searchId = s.nextInt();
                    Book foundBook = library.searchBook(searchId);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                }
                case 4 -> library.displayBooks();
                case 5 -> {
                    System.out.println("Exiting program.");
                    System.exit(0);
                }
                default -> System.out.println("Please enter a number from 1 to 5.");
            }
        }
    }
}