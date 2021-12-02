public Printer test() {
    String msg = "Hello"; // msg is effectively final
    Printer printer = msg1 -> 
        System.out.println(msg + " " + msg1);        
    return printer;
}
