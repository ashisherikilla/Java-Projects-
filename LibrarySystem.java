import java.util.*;

class book {
    String title;
    String author;
    boolean availability;

    book(String title, String author) {
        this.title = title;
        this.author = author;
        this.availability = true;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Library Management System");
            System.out.println();
            System.out.println("1. Add Book\n2. Borrow Books\n3. Return Book\n4. View Books\n5. Exit");
            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1:
                    System.out.println("Enter the Book title: ");
                    String bookTitle = sc.nextLine();
                    System.out.println("Enter the book author: ");
                    String author = sc.nextLine();
                    books.add(new book(bookTitle, author));
                    System.out.println("Book added Succesfully!");

                    break;
                case 2:
                    System.out.println("Enter the Book title to borrow:");
                    bookTitle = sc.nextLine();
                    boolean found = false;
                    for (book book : books) {
                        if (book.title.equalsIgnoreCase(bookTitle) && book.availability) {
                            book.availability = false;
                            System.out.println("you've borrowed: " + bookTitle);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book is not available");
                        break;
                    }
                case 3:
                    System.out.println("ENter the Book title to return:");
                    bookTitle = sc.nextLine();
                    for (book book : books) {
                        if (book.title.equalsIgnoreCase(bookTitle) && !book.availability) {
                            book.availability = true;
                            System.out.println("Book has been returned Succesfully!");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Avialable Books:");
                    for (book book : books) {
                        System.out.println(book.title + "by" + book.author
                                + (book.availability ? " (Available)" : "(Not Available)"));
                    }
                    break;
                case 5:
                    System.out.println("Exiting.......");
                    return;
                default:
                    System.out.println("Invalid Choice.");

                    sc.close();

            }
        }

    }

}