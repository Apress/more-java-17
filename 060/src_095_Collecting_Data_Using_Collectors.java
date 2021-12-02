SortedSet<String> uniqueSortedNames= Person.persons()
    .stream()
    .map(Person::getName)
    .collect(Collectors.toCollection(TreeSet::new));
System.out.println(uniqueSortedNames);

[Chris, Donna, Jeff, Ken, Laynie, Li]
