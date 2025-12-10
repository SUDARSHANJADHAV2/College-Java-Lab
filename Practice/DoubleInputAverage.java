// Accept 2 double values from User (using Scanner). Check data type. If arguments are not 
// doubles, supply suitable error message & terminate. If numbers are double values, print its 
// average. 
import java.util.*;
public class DoubleInputAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: The input is not a double.");
            return;
        }
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: The input is not a double.");
            return;
        }
        double num2 = sc.nextDouble();
        
        double average = (num1 + num2) / 2;
        System.out.println("The average is: " + average);
    }
}
