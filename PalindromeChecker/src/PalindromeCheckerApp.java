public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string (String Literal)
        String word = "madam";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare start and end characters
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}
