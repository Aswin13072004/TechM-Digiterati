package Week_2_Tasks.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        // Adding Books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));

        // Adding Users
        library.addUser(new User("Alice", "U001"));
        library.addUser(new User("Bob", "U002"));
        

        // Simulating Borrow and Return
        try {
            library.borrowBook("9780743273565", "U001");
            library.returnBook("9780743273565", "U001");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
