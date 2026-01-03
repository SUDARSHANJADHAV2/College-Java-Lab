// Write a program to calculate area and perimeter of Square. Side should be initialized with fixed value.  

class Operation {
    public double AreaS(double s) {
        return s * s;
    }

    public double PerimeterS(double s) {
        return 4 * s;
    }
}

public class SquareOperation {
    public static void main(String[] args) {
        Operation op = new Operation();
        double side = 10;
        System.out.println(op.AreaS(side));
        System.out.println(op.PerimeterS(side));
    }
}
