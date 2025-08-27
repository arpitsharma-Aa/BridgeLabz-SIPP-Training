public class Q10_NullPointerDemo {
    public static void generateException() {
        String text = null;
        int length = text.length();
    }

    public static void handleException() {
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
