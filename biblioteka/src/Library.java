public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka V0.2";

        Book book1 = new Book();

        book1.title = "James Bond - agent 007";
        book1.author = "Cornel Egmont";
        book1.releaseDate = 2019;
        book1.pages = 412;
        book1.publisher = "Dobra Książka";
        book1.isbn = "838231241";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
