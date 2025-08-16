import java.time.LocalDate;

public class Loan {

    private int id;
    private Book borrowedBook;
    private LocalDate loanDate;
    private LocalDate devolutionDate;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBorrowedBook(Book book) {
        this.borrowedBook = book;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setLoanDate(LocalDate date) {
        this.loanDate = date;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }
}
