Person.persons()
      .stream()
      .filter(Person::isFemale)
      .map(Person::getName)
      .forEach(System.out::println);

Donna
Laynie
