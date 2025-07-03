package Day5_String;
public class NullPointerExceptionDemo {
    static void generateException() {
        String text = null;
        text.length();
    }

    static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}

