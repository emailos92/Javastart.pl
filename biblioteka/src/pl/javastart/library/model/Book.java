package pl.javastart.library.model;

public class Book extends Publication{
    private String author;
    private int pages;
    private String isbn;

    public Book(String title, String publisher, int year,  String author, int pages, String isbn) {
        setTitle(title);
        setPublisher(publisher);
        setYear(year);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "; " +
                getAuthor() + "; " + getPages();
        if (getIsbn() != null) {
            info = info + "; " + getIsbn();
        }
        System.out.println(info);
    }
}
