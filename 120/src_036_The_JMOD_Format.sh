C:\jdk17book>jmod describe jmods\jdojo.prime.jmod 

jdojo.prime@1.0 
exports com.jdojo.prime 
requires java.base mandated 
uses com.jdojo.prime.PrimeChecker 
provides com.jdojo.prime.PrimeChecker with 
    com.jdojo.prime.impl.genericprimechecker 
contains com.jdojo.prime.impl 
