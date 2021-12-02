public Printer test() {
    // A compile-time error. The msg variable is not 
    // declared yet.
    Printer printer = msg1 -> 
        System.out.println(msg + " " + msg1);
    String msg = "Hello";  // msg is effectively final
    return printer;
}
