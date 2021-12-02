public Printer test() {
    // msg is not effectively final as it is changed later
    String msg = "Hello";
    // A compile-time error
    Printer printer = msg1 -> 
        System.out.println(msg + " " + msg1);        
    msg = "Hi"; 
    // <- msg is changed making it effectively non-final
    return printer;
}
