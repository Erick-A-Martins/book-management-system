import java.util.List;
import java.util.ArrayList;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        return books;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> listAuthors() {
        return authors;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> listLoans() {
        return loans;
    }
}
