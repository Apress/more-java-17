static List<PrimeChecker> startsWith(String prefix) { 
    return ServiceLoader.load(PrimeChecker.class) 
            .stream() 
            .filter((Provider p) -> 
                p.type().getName().startsWith(prefix)) 
            .map(Provider::get) 
            .collect(Collectors.toList()); 
} 
