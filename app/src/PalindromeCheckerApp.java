public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string to check
        String input = "madam";

        // Assume palindrome until proven otherwise
        boolean isPalindrome = true;

        // Check palindrome by comparing characters from start and end
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
