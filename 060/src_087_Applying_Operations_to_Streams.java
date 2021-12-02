long personCount = Person.persons()
    .stream()
    .reduce(0L, (partialCount, person) -> 
        partialCount + 1L,
        Long::sum);
