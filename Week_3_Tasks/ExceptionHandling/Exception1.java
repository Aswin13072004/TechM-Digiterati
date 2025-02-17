package Week_3_Tasks.ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero " + e.getMessage());
        }
    }
}
