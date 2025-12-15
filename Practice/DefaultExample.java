//Purpose: Specifies a default case in a switch statement.
public class DefaultExample {
    public static void main(String[] args){
        
        int number=10;
        switch(number){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;       
            default:
                System.out.println("Default case executed.");
        }
    }
}