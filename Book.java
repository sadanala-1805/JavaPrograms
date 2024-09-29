public class Book {
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN Number: " + isbnNumber + "\n" +
               "Author Name: " + authorName + "\n" +
               "Publisher: " + publisher;
    }

    public static void main(String[] args) {
        Book myBook = new Book("The Great Gatsby", "978-0743273565", "F. Scott Fitzgerald", "Scribner");
        System.out.println(myBook.getBookInfo());

        myBook.setBookName("1984");
        System.out.println("\nUpdated Book Info:\n" + myBook.getBookInfo());
    }
}
