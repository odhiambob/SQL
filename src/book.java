import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter book details
        System.out.print("Enter book ID: ");
        int bookId = input.nextInt();

        System.out.print("Enter book title: ");
        String bookTitle = input.next();

        System.out.print("Enter book author: ");
        String bookAuthor = input.next();

        System.out.print("Enter year of publication: ");
        int yearPublished = input.nextInt();

        // Display book details entered by the user
        System.out.println("Book ID: " + bookId);
        System.out.println("Book title: " + bookTitle);
        System.out.println("Book author: " + bookAuthor);
        System.out.println("Year of publication: " + yearPublished);
    }
}
