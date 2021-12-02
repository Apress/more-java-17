List<String> sortedName = Person.persons()
    .stream()
    .map(Person::getName)
    .sorted()
    .collect(Collectors.toList());
System.out.println(sortedName);

[Chris, Donna, Jeff, Ken, Laynie, Li]
