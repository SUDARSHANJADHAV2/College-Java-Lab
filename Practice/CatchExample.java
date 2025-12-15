//Purpose: Marks a block of code in a switch statement.
public class CatchExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zore: " + e.getMessage());
        }
    }
}