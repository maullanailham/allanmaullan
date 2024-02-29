import java.util.Scanner;

public class LibrarySystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.print("""
                    === Library System ===
                    1. Login as Student
                    2. Login as Admin
                    3. Exit
                    Choose option(1-3):""");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    loginAsStudent();
                    break;
                case 2:
                    loginAsAdmin();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void loginAsStudent() {
        System.out.print("Enter your NIM: ");
        String identifier = scanner.next();
        User student = new Student(identifier);

        if (student.authenticate()) {
            System.out.println("Successful Login as Student");
            // Perform student-related tasks here
        } else {
            System.out.println("User Not Found");
        }
    }

    private static void loginAsAdmin() {
        System.out.print("Enter your username (admin): ");
        String identifier = scanner.next();
        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        User admin = new Admin(identifier, password);

        if (admin.authenticate()) {
            System.out.println("Successful Login as Admin");
            // Perform admin-related tasks here
        } else {
            System.out.println("Admin User Not Found!!");
        }
    }
}
