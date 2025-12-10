// Write a program to perform following operations on double values. 
//* Maximum from two double values (input from user). 
import java.util.*;
class Operation{
    public static double findMax(double f, double s){
        if(f>s){
            return f;
        }
        else{
            return s;
        }
    }
}

public class FindMax {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st double value: ");
        double first = sc.nextDouble();
        System.out.println("Enter 2nd double value: ");
        double second = sc.nextDouble();
        System.out.println("Greater Element  : "+ Operation.findMax(first,second));
        }
}