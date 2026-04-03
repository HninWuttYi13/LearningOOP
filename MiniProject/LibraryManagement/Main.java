import java.util.ArrayList;
import java.util.Date;
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable = true;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public String getIsbn () {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void borrowBook() {
        if(!isAvailable) {
            System.out.println(title + "is not available");
            return;
        }
        isAvailable = false;
    }
    public void returnBook() {
        if(isAvailable) {
            System.out.println(title + " is already available");
            return;
        }
        isAvailable = true;
    }
    public void displayBook () {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed") );
    }
}
class LibraryMember {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;
    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
    public void borrowBook(Book book) {
    borrowedBooks.add(book);
}
public void returnBook(Book book) {
    borrowedBooks.remove(book);
}
public ArrayList<Book>getBorrowedBooks() {
    return borrowedBooks;
}
    public void displayBorrowedBooks() {
        System.out.println(name + " 's " + "Borrowed Books:");
        for(Book book: borrowedBooks) {
            System.out.println(book.getTitle() + " - " + book.getIsbn());
        }
    }
}
class Loan {
    private Book book;
    private LibraryMember member;
    private Date borrowDate;
    private Date dueDate;
    public Loan(Book book, LibraryMember member) {
        this.book = book;
        this.member = member;
        this.borrowDate = new Date();
        this.dueDate = new Date(this.borrowDate.getTime() + 14 * 24 * 60 * 60 * 1000);
    }
}
class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    private ArrayList<Loan> bookLoans;
    public Library() {
        this.books = new ArrayList<Book>();
        this.members = new ArrayList<LibraryMember>();
        this.bookLoans = new ArrayList<Loan>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully");
    }
    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Member added successfully");
    }
    public void loanBook(Book book, LibraryMember member) {
    if(!book.isAvailable()) {
        System.out.println("Book is not available");
        return;
    }
    if(member.getBorrowedBooks().size() >= 3 ){
    System.out.println("Member reached max limit");
    return;
 }
 book.borrowBook();
 member.borrowBook(book);
 Loan loan = new Loan(book, member);
 bookLoans.add(loan);
 System.out.println("Book loaned successfully");
 }
 public void returnBook(Book book, LibraryMember member) {
    if(!book.isAvailable()) {
        book.returnBook();
        member.returnBook(book);
        System.out.println("Book returned successfully");
    } else {
        System.out.println("This member didn't borrow this book");
    }
 }

}
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        //create books 
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "978-0747532699");
        //add books to library
        library.addBook(book1);
        //create members
        LibraryMember member1 = new LibraryMember("Hermonie Granger", "M001");
        //add members to library
        library.addMember(member1);
        //loan books
        library.loanBook(book1, member1);
        member1.displayBorrowedBooks();
        library.returnBook(book1, member1);
        member1.displayBorrowedBooks();

        
    }
}