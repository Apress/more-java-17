public interface PrimeChecker { 
    // Part of the service interface 
    boolean isPrime(long n); 
    // Part of the service 
    static PrimeChecker newInstance() { /*...*/ }; 
    static PrimeChecker newInstance(String providerName) {
        /*...*/ }; 
    static List<PrimeChecker> providers() { /*...*/ }; 
    static List<String> providerNames(/*...*/); 
 } 
