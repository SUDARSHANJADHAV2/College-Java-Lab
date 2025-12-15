// Create a class Complex having 2 fields as real and imag. Write one init method to initialize 
// the real and imag. Create an instance in main and call that init method. Pass 2 command line 
// arguments to use it to initialize your real and imag. (hint - keep init() method as parameterized). 
class Complex{
    private double real, imag;
    public void init(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public void display(){
        System.out.println("Complex No.: "+ real +"+"+imag + "i");
    }
}

public class CompexOperation {
    public static void main(String[] args){
        if(args.length !=2) {
            return;
        }
        
            double r=Double.parseDouble(args[0]);
            double i=Double.parseDouble(args[1]);
            Complex complexNumber=new Complex();
            complexNumber.init(r,i);
            complexNumber.display();
        }
    }

