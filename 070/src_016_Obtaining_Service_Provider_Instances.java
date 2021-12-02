String providerName = 
    "com.jdojo.prime.faster.FasterPrimeChecker";
Optional<Provider<PrimeChecker>> optional = 
    ServiceLoader.load(PrimeChecker.class) 
        .stream() 
        .filter((Provider p) -> 
            p.type().getName().equals(providerName))
        .findFirst(); 
