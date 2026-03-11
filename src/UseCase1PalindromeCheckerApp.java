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

    // UC2: Check whether a hardcoded string is a palindrome
    public static void checkHardcodedPalindrome() {
        String original = "madam";
        String reversed = "";

        // Reverse the string character by character
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("-------------------------------------------");
        System.out.println("   UC2: Hardcoded Palindrome Check");
        System.out.println("-------------------------------------------");
        System.out.println("   Word     : " + original);
        System.out.println("   Reversed : " + reversed);

        // Check if original equals reversed
        if (original.equals(reversed)) {
            System.out.println("   Result   : \"" + original + "\" is a Palindrome");
        } else {
            System.out.println("   Result   : \"" + original + "\" is NOT a Palindrome");
        }
        System.out.println("-------------------------------------------");
    }

    // UC3: Palindrome check using string reverse (loop + concatenation)
    // Demonstrates: for loop, String immutability, + concatenation, equals()
    public static void checkPalindromeUsingReverse(String word) {
        String reversed = "";

        // Reverse the string using a for loop
        // Note: String is immutable — each concatenation creates a new String object
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("-------------------------------------------");
        System.out.println("   UC3: Palindrome Check (String Reverse)");
        System.out.println("-------------------------------------------");
        System.out.println("   Original : " + word);
        System.out.println("   Reversed : " + reversed);

        // Using equals() to compare content, not == (which compares references)
        if (word.equals(reversed)) {
            System.out.println("   Result   : \"" + word + "\" is a Palindrome");
        } else {
            System.out.println("   Result   : \"" + word + "\" is NOT a Palindrome");
        }
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        // UC1: Welcome Message
        displayWelcomeMessage();

        // UC2: Hardcoded Palindrome Check
        checkHardcodedPalindrome();

        // UC3: Palindrome Check Using String Reverse
        checkPalindromeUsingReverse("racecar");
        checkPalindromeUsingReverse("hello");
    }
}
