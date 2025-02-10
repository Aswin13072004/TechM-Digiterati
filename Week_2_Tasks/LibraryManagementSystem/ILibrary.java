package Week_2_Tasks.LibraryManagementSystem;

public interface ILibrary {
    void borrowBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException;
    void returnBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException;
    void reserveBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException;
    Book searchBook(String title);
}
