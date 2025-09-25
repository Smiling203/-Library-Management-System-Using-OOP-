import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "OOP in Depth", "Grady Booch"));
        library.addBook(new Book(3, "Data Structures", "Robert Lafore"));
        library.addBook(new Book(3, "MySQL", "Lafore"));

        library.addUser(new User(1, "Pallavi"));
        library.addUser(new User(2, "Aishwarya"));
        library.addUser(new User(1, "Patil"));
        library.addUser(new User(2, "Shruti"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    library.issueBook(issueId, userId);
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int returnUserId = sc.nextInt();
                    library.returnBook(returnId, returnUserId);
                    break;
                case 4:
                    System.out.println("Thank You... WelCome!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}

