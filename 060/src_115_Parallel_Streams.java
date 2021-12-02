String names = Person
    .persons()              // The data source
    .stream()               // Produces a sequential stream
    .filter(Person::isMale) // Processed in serial
    .map(Person::getName)   // Processed in serial
    .collect(Collectors.
        joining(", "));     // Processed in serial
