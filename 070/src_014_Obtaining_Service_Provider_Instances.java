static PrimeChecker newInstance(String providerName) { 
    // Try to find the first service provider with the 
    // specified providerName 
    Optional<Provider<PrimeChecker>> optional = 
        ServiceLoader.load(PrimeChecker.class) 
            .stream() 
            .filter((Provider p) -> 
                p.type().getName().equals(providerName)) 
            .findFirst(); 
    PrimeChecker checker = null; 
    // Instantiate the provider if we found one 
    if (optional.isPresent()) { 
        Provider<PrimeChecker> provider = optional.get();
        checker = provider.get(); 
    } 
    return checker; 
} 
