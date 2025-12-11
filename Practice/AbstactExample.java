//Purpose: Specifies that a class or method will be implemented later in a subclass.
import java.util.*;
abstract class Animal{
    abstract void makeSound(); 
    void eat(){
        System.out.println("This animal eats food");
    }
}



class Dog extends Animal{
    @Override
    void makeSound(){
        System.err.println("Dog bards : Woof Woof");
    }
}

public class AbstactExample {
    public static void main(String [] args){
        Animal myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
    }
}
