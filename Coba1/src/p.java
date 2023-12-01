import java.util.Scanner;

public class p {
    static Scanner in = new Scanner(System.in);
    static String[] usernames = new String[100];
    static String[] passwords = new String[100];
    static String[] fullNames = new String[100];

    static int userCount = 0;

    static String userLogin() {
        System.out.print("Username: ");
        return in.nextLine();
    }

    static String pwLogin() {
        System.out.print("Password: ");
        return in.nextLine();
    }

    static void registration() {
        // Registration logic
    }

    static void addUser(String username, String fullName, String password) {
        // Add user logic
    }

    static void login() {
        System.out.println("========================================");
        System.out.println("||                Login               ||");
        System.out.println("========================================");

        boolean match = false;
        int attempts = 3;

        while (attempts > 0) {
            String inputUsername = userLogin();
            String inputPassword = pwLogin();

            for (int j = 0; j < userCount; j++) {
                if (inputUsername.equals(usernames[j]) && inputPassword.equals(passwords[j])) {
                    match = true;
                    System.out.println("Welcome, " + fullNames[j]);
                    return;
                }
            }

            attempts--;
            System.out.println("Incorrect username or password. Remaining attempts: " + attempts);
        }

        System.out.println("You have reached the maximum login attempts. Exiting...");
        System.exit(0);
    }

    public static void main(String[] args) {
        registration(); 
    }
}
