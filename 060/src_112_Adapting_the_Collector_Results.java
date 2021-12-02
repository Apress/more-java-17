List<String> names = Person.persons()
    .stream()
    .map(Person::getName)
    .collect(Collectors.collectingAndThen(
        Collectors.toList(),
        result -> 
            Collections.unmodifiableList(result)));
System.out.println(names);

[Ken, Jeff, Donna, Chris, Laynie, Li]
