import java.util.Scanner;

// Library class
class Library {
    Book[] shelf = new Book[1000];   // collection of books
    int totalBooks = 0;

    Scanner sc = new Scanner(System.in);

    // Method to add book
    public void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book genre: ");
        String genre = sc.nextLine();

        Book book = new Book(totalBooks, title, genre); // ID assigned here
        shelf[totalBooks] = book;
        totalBooks++;

        System.out.println("Book added successfully!");
    }


    // Method to remove book using ID
    public void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        if (shelf[id] != null) {
            System.out.println("Removing Book:"+shelf[id].title);
            shelf[id]=null;
            System.out.println("Successfully Remove Book:");
        } else {
            System.out.println("Book not found.\n");
        }
    }

    // Method to display all books
    public void displayBooks() {
        System.out.println("Library Collection:");
        for (int i = 0; i < totalBooks; i++) {
            if (shelf[i] != null) {
                shelf[i].displayBook();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Library lb = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Books");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    lb.addBook();
                    break;
                case 2:
                    lb.removeBook();
                    break;
                case 3:
                    lb.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}

// Book class
class Book {
    int bookId;
    String title;
    String genre;

    public Book(int bookId, String title, String genre) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
    }

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("----------------------");
    }
}

