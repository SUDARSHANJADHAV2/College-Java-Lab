//Purpose: Specifies permitted subclasses of a sealed class.
sealed class Vehicle permits Car, Bike {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

final class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

final class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }
}

public class SealedExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
    }
}
