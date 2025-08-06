package Day1_OOPS;
class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It's a palindrome.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("madam");
        checker.displayResult();
    }
}
