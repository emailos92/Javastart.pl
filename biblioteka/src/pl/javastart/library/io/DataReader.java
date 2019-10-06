package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close(){
        sc.close();
    }

    public int getInt(){
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = getInt();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();

        return new Book(title, publisher, year, author, pages, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc: ");
        int month = getInt();
        System.out.println("Dzień: ");
        int day = getInt();
        System.out.println("Język: ");
        String language = sc.nextLine();

        return new Magazine(title, publisher, year, month, day, language);
    }


}
