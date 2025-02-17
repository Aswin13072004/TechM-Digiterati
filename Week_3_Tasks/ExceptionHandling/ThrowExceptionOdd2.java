package Week_3_Tasks.ExceptionHandling;

public class ThrowExceptionOdd2 {
    public static void main(String[] args) {
        try {
            checkEven(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            checkEven(10);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void checkEven(int number) throws Exception{
        if (number %2!=0) {
            throw new Exception("the number is odd "+ number);
        }
        else
            System.out.println("the number is even "+ number);
    }
}
