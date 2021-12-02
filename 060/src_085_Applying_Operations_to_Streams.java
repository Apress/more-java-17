long personCount = Person.persons()
    .stream()
    .mapToLong(p -> 1L)
    .sum();
