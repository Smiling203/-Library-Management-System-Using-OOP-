import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void showBooks() {
        System.out.println("\n📚 Library Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                b.issueBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId, int userId) {
        for (Book b : books) {
            if (b.getId() == bookId) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
