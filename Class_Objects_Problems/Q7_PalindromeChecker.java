class Q7_PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Q7_PalindromeChecker pc = new Q7_PalindromeChecker();
        pc.text = "Madam";
        pc.displayResult();
    }
}
