
// Write a program to calculate area and circumference of Circle. Radius should be initialized with fixed value. Use any editor to type the code and compile on command line.
import java.util.*;

class Operation {
    public double Area(double r) {
        return 3.14 * r * r;
    }

    public double circumference(double r) {
        return 2 * 3.14 * r;
    }
}

public class CirlceOperation {
    public static void main(String args[]) {
        Operation op = new Operation();
        double radius = 10.0;
        System.out.println("Area : " + op.Area(radius));
        System.out.println("Circumferance : " + op.circumference(radius));
    }
}
