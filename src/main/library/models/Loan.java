public class Loan {  
    private int id;  
    private Book book;  
    private Member member;  
    private LocalDate checkoutDate;  
    private LocalDate dueDate;  
    private LocalDate returnDate;  
    public Loan(int id, Book book, Member member, LocalDate checkoutDate, LocalDate dueDate) {
        this.id = id;
        this.book = book;
        this.member = member;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.returnDate = null; // Initially, the book is not returned
    }
}  
    public int getId() {
        return id;
    }   
    public Book getBook() {
        return book;
    }
    public Member getMember() {
        return member;
    }
    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    public boolean isReturned() {
        return returnDate != null;
    }
    public boolean isOverdue() {
        return returnDate == null && LocalDate.now().isAfter(dueDate);
    }

    