public class Book {
    String title;
    int publishingYear;
    long iSBN;
    String authorName;

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.publishingYear = " + book.publishingYear);
        System.out.println("book.iSBN = " + book.iSBN);

        book.title = "Java Book: The complete Reference" +
                "Twelfth Edition";
        book.authorName = "Herbert Schlidth ";
        book.publishingYear = 2021;
        book.iSBN = 1000123456123L;

        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.publishingYear = " + book.publishingYear);
        System.out.println("book.iSBN = " + book.iSBN);
    }
}
