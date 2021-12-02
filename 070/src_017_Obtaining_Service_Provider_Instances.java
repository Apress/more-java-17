// FasterPrimeChecker.java 
package com.jdojo.prime.faster; 
import com.jdojo.prime.PrimeChecker; 
public class FasterPrimeChecker implements PrimeChecker { 
    // No provider constructor 
    private FasterPrimeChecker() { 
        // No code 
    } 
    // Define a provider method 
    public static FasterPrimeChecker provider() { 
        return new FasterPrimeChecker(); 
    } 
    @Override 
    public boolean isPrime(long n) { 
        // More code goes here 
    } 
} 
