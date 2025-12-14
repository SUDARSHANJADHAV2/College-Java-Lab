//Purpose: Ensures a block of code is always executed, even if an exception is thrown.
public class FinallyExample {
    public static void main(String[] args){
        try{
            int result =10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Caught an exception: "+e.getMessage());
        }
        
        finally{
            System.out.println("This block is always executed.");
        }
    }
}
