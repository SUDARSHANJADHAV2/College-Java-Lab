//Purpose: Restricts which classes can extend a class. (Available in Java 17 and later.)
sealed class Shape permits Circle, Rectangle {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}
final class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }
}
final class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class PermitsExample {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); 
    }
}
