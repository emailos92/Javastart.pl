package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka V0.3";

        Book book1 = new Book("James Bond - agent 007","Cornel Egmont",2019,412,
                "Dobra Książka","838231241");
        Book book2 = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352,
                "Helion", "9788324620845");
        Book book3 = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851,
                "McGraw-Hill Osborne Media");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
