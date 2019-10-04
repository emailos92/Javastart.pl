package pl.javastart.library.app;

import org.w3c.dom.ls.LSOutput;
import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka V0.8";

        Book[] books = new Book[1000];
        DataReader dataReader = new DataReader();

        books[0] = new Book("James Bond - agent 007", "Cornel Egmont", 2019, 412,
                "Dobra Książka", "838231241");
        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352,
                "Helion", "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851,
                "McGraw-Hill Osborne Media");
        books[3] = dataReader.readAndCreateBook();


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        books[3].printInfo();

        System.out.println("System może przechowywać do " + books.length + " książek");

 
        
    }
}