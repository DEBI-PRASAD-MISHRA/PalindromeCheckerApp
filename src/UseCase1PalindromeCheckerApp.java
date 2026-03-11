public class UseCase1PalindromeCheckerApp {

    // UC1: Display welcome message and app details at startup
    public static void displayWelcomeMessage() {
        System.out.println("===========================================");
        System.out.println("   Welcome to Palindrome Checker App");
        System.out.println("===========================================");
        System.out.println("   Application Name : Palindrome Checker");
        System.out.println("   Version          : 1.0");
        System.out.println("   Developer        : Debi Prasad Mishra");
        System.out.println("===========================================");
        System.out.println("   App started successfully!");
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        // UC1: Welcome Message
        displayWelcomeMessage();
    }
}
