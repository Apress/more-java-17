String names = Person
    .persons()              // The data source
    .parallelStream()       // Produces a parallel stream
    .filter(Person::isMale) // Processed in parallel
    .map(Person::getName)   // Processed in parallel
    .collect(Collectors.
        joining(", "));     // Processed in parallel
