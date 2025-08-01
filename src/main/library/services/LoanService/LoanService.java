publc interface LoanService {
public boolean checkoutBook(int memberId, int bookId);
public double returnBook(int loanId, LocalDate returnDate);
public double calculateFine(LocalDate dueDate, LocalDate returnDate) ;
// £1 per day overdue. Keep double to be able to change the fine rate in the future
}