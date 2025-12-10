interface Vehicle{
    void start();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car is starting.");
    }
}

public class InterfaceExample {
    public static void main(){
        Vehicle myCar=new Car();
        myCar.start();
    }
}
