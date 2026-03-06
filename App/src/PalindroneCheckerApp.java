
public class UseCase10PalindromeCheckerApp {


    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // 1. Normalize string: Remove non-alphanumeric characters and convert to lowercase [cite: 6, 10, 12]
        // Regular expression [^a-zA-Z0-0] matches anything that is NOT a letter or number [cite: 10]
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // 2. Apply previous logic: Compare characters from both ends [cite: 7, 13]
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Output results as shown in the requirement
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}