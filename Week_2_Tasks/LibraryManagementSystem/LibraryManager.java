package Week_2_Tasks.LibraryManagementSystem;

public class LibraryManager extends LibrarySystem {
    private static final int MAX_BOOKS_ALLOWED = 3;

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void borrowBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException, MaxBooksAllowedException {
        User user = findUser(userID);
        if (user.getBorrowedBooks().size() >= MAX_BOOKS_ALLOWED) {
            throw new MaxBooksAllowedException("User has reached the maximum book limit.");
        }

        Book book = findBook(isbn);
        user.borrowBook(book);
        books.remove(book);
        System.out.println("Book borrowed successfully by " + user.getName());
    }

    @Override
    public void returnBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException {
        User user = findUser(userID);
        Book book = findBookInUser(isbn, user);
        user.returnBook(book);
        books.add(book);
        System.out.println("Book returned successfully by " + user.getName());
    }

    @Override
    public void reserveBook(String isbn, String userID) throws BookNotFoundException, UserNotFoundException {
        System.out.println("Book reserved by " + findUser(userID).getName());
    }

    @Override
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    private Book findBook(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book not found.");
    }

    private User findUser(String userID) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUserID().equals(userID)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    private Book findBookInUser(String isbn, User user) throws BookNotFoundException {
        for (Book book : user.getBorrowedBooks()) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("User has not borrowed this book.");
    }
}
