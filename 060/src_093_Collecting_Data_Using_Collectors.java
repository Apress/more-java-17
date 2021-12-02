List<String> names = Person.persons()
    .stream()
    .map(Person::getName)
    .collect(Collectors.toList());
System.out.println(names);

[Ken, Jeff, Donna, Chris, Laynie, Li]
