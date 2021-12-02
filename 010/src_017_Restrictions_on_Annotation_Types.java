// Won't compile
public @interface WrongVersion {
    int major() throws Exception; // Cannot have a 
                                  // throws clause
    int minor(); // OK
}
