public class Test {
    public static void main(String[] args) {
        String msg = "Hello";
        // A compile-time error. The msg variable is 
        // already defined and the lambda parameter is 
        // attempting to redefine it.
        Printer printer = msg -> System.out.println(msg);        
    }
}
