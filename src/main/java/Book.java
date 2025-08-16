import java.time.LocalDate;

public class Book {

    private int id;
    private String bookTitle;
    private Author author;
    private boolean available;
    private LocalDate registerDate;
    private LocalDate updateDate;

    public Book(int id, String bookTitlem, Author author, boolean available, LocalDate registerDate, LocalDate updateDate) {
        this.id = id;
        this.bookTitle = bookTitlem;
        this.author = author;
        this.available = available;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBookTitle(String title) {
        this.bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }
}
