package Classes;
import java.util.*;

public class Book {
    String title;
    String author;
    int pages;

    public Book(){

    }
    public Book(String name, String author, int pages){
        this.title = name;
        this.author = author;
        this.pages = pages;

    }
    public void inf(){
        System.out.println("Name " + this.title);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }
}
