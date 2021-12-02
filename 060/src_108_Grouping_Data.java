Map<Person.Gender, String> namesByGender =
    Person.persons()
          .stream()
          .collect(Collectors.groupingBy(Person::getGender,
             Collectors.mapping(
                 Person::getName, 
                 Collectors.joining(", "))));
System.out.println(namesByGender);

{MALE=Ken, Jeff, Chris, Li, FEMALE=Donna, Laynie}
