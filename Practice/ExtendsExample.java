//Purpose: Indicates inheritance from a superclass.
class Parent{
    void display(){
        System.out.println("This is the parents class.");
    }
}
class Child extends Parent{
    @Override
    void display(){
        System.out.println("This is the child class.");
    }
}
public class ExtendsExample {
    public static void main(String[] args){
        Child obj=new Child();
        obj.display();
        Parent obj1=new Parent();
        obj1.display();
    }
}
