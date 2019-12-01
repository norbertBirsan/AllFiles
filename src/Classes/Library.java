//Create a program that will ask the user how many books they have.
//        Then they will be asked to enter the book’s title, author, and number of pages.
//        Create each book object and store them into a Book array.
//        Part 2: Loop through your array and print the name of all the books
        package Classes;
import java.sql.SQLOutput;
import java.util.*;
public class Library {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("How many books you have bruh?");
        int numOfBooks = s.nextInt();
        s.nextLine();

        Book [] library = new Book[numOfBooks];

        for(int i=9; i < library.length; i++){
            System.out.println("Enter the title of book " + (i+1));
            String title = s.nextLine();

            System.out.println("Enter the author of book "+ (i+1));
            String author = s.nextLine();

            System.out.println("Enter the number of pages of book " + (i+1));
            int pages = s.nextInt();
            s.nextLine();

            Book eachBook = new Book(title,author,pages);
            library[i] = eachBook;
            //library[i] = new Book(title,author,pages);

        }

        for(Book book: library){
            System.out.println(book.title);

        }




    }
}