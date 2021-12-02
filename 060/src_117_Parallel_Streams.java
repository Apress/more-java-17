String names = Person
    .persons()              // The data source
    .stream()               // Produces a sequential stream
    .filter(Person::isMale) // Processed in serial
    .parallel()             // Produces a parallel stream
    .map(Person::getName)   // Processed in parallel
    .collect(Collectors.
        joining(", "));     // Processed in parallel
