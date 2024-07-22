package Task3.BookManagementSystem;

class Library {

    private final Book[] books;
    private int numBooks;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < books.length) {
            books[numBooks++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookID() == bookID) {
                System.arraycopy(books, i + 1, books, i, numBooks - i - 1);
                numBooks--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public Book searchBook(int bookID) {
        for (Book book : books) {
            if (book != null && book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayBooks() {
        if (numBooks == 0) {
            System.out.println("Library is empty.");
            return;
        }
        System.out.println("Books in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }

}