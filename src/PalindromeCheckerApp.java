
public class PalindromeCheckerApp {
     public static void main (String[] args){
         System.out.println("Welcome to Palindrome Cheker Management System");
         System.out.println("Version 1.0");
         System.out.println("System Initialized Succesfully");
         int o=0;
         String input="madam";
         for (int i = 0; i < input.length() / 2; i++) {
             if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                 System.out.println("False");
                 o=1;
                 break;

             }

         }
         if (o==0){
             System.out.println("True");
         }

     }
}