public Printer test() {    
    String msg = "Hello";
    Printer printer = msg1 ->  {
        msg = "Hi " + msg1; // A compile-time error. 
                            // Attempting to modify msg.
        System.out.println(msg);
    };
    return printer;
}
