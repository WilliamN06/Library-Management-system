public class Book {  
    private int id;  
    private String title;  
    private String author;  
    private String isbn;  
    private BookStatus status; // Enum: AVAILABLE, BORROWED  
    public Book(int id, String title, String author, String isbn, BookStatus status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.status = status;
    }
    public int getId() {
        return id;
    }       
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;  
    }
    public String getIsbn() {   
        return isbn;

    }
    public BookStatus getStatus() {
        return status;

    }
    public void setStatus(BookStatus status) {
        this.status = status;
    }









}  