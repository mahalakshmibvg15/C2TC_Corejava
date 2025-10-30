package day12;
public class InvalidMarksException extends Exception {
    private static final long serialVersionUID = 1L; // ✅ Fixes the warning

    public InvalidMarksException() {
        super();
    }

    public InvalidMarksException(String message) {
        super(message);
    }
}
