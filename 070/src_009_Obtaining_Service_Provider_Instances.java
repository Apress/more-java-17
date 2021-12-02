// Load the service providers for PrimeChecker 
ServiceLoader<PrimeChecker> loader = 
    ServiceLoader.load(PrimeChecker.class); 
// Iterate through all service provider instances 
Iterator<PrimeChecker> iterator = loader.iterator(); 
if (iterator.hasNext()) { 
   PrimeChecker checker = iterator.next(); 
   // Use the prime checker here... 
} 
