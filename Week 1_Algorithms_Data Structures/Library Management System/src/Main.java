public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(5);

        // Adding books
        lms.addBook(new Book("B001", "The Catcher in the Rye", "J.D. Salinger"));
        lms.addBook(new Book("B002", "To Kill a Mockingbird", "Harper Lee"));
        lms.addBook(new Book("B003", "1984", "George Orwell"));
        lms.addBook(new Book("B004", "Pride and Prejudice", "Jane Austen"));
        lms.addBook(new Book("B005", "The Great Gatsby", "F. Scott Fitzgerald"));

        // Linear search for a book by title
        System.out.println("Linear Search for '1984':");
        Book foundBook = lms.linearSearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found");

        // Sort books by title for binary search
        lms.sortBooksByTitle();

        // Binary search for a book by title
        System.out.println("\nBinary Search for 'Pride and Prejudice':");
        foundBook = lms.binarySearchByTitle("Pride and Prejudice");
        System.out.println(foundBook != null ? foundBook : "Book not found");
    }
}

