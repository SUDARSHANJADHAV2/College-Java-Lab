//Purpose: Prevents modification of variables, methods, or classes.
public class FinalExample {
    final int MAX_VALUE=100; //constant value
    final void displayMessage(){
        System.out.println("This method cannot be overridden.");
    }
    
    public static void main(String[] args){
        FinalExample example=new FinalExample();
        System.out.println("Max Value:"+example.MAX_VALUE);
    }
}
