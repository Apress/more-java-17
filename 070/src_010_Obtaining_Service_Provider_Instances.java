ServiceLoader<PrimeChecker> loader = 
    ServiceLoader.load(PrimeChecker.class); 
for (PrimeChecker checker : loader) { 
    // checker is your service provider instance 
} 
