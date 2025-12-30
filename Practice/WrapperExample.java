public class WrapperExample {

    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(5); // Boxing (Explicit)
        Double doubleObj = Double.valueOf(5.5);
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println(intObj); // Output: 10
        System.out.println(doubleObj); // Output: 5.5
        System.out.println(boolObj); // Output: true
    }
}
