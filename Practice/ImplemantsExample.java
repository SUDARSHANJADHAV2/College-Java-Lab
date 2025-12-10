interface Animal{
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barks : Woof Woof!");
    }
}

public class ImplemantsExample {
    public static void main(String[] args){
        Animal myDog=new Dog();
        myDog.makeSound();
    }
}
