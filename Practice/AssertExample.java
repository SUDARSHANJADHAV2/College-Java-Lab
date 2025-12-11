//Purpose: Ensures that a condition is true at runtime; used primarily for debugging.

import java.util.*;

public class AssertExample {
    public static void main() {
        int age = 20;
        assert age >= 18 : "Age must be 18 or older to proceed!";
        System.out.println("Program runs if assertion is true.");
    }
}
