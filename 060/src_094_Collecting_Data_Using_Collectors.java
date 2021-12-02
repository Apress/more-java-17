Set<String> uniqueNames = Person.persons()
    .stream()
    .map(Person::getName)
    .collect(Collectors.toSet());
System.out.println(uniqueNames);

[Donna, Ken, Chris, Jeff, Laynie, Li]
