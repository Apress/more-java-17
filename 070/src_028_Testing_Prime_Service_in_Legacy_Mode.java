C:\Java9LanguageFeatures>java ^
--class-path lib\jdojo.prime.jar;
    lib\jdojo.prime.client.jar;
    lib\jdojo.prime.faster.jar;
    lib\jdojo.prime.probable.jar ^
com.jdojo.prime.client.Main 

Using default service provider: 
3 is a prime. 
4 is not a prime. 
121 is not a prime. 
977 is a prime. 
Exception in thread "main" 
    java.util.ServiceConfigurationError: 
    com.jdojo.prime. 
PrimeChecker: 
com.jdojo.prime.faster.FasterPrimeChecker 
Unable to get public no-arg  constructor 
... 
   Caused by: java.lang.NoSuchMethodException: 
   com.jdojo.prime.faster. 
FasterPrimeChecker.<init>() 
... 
