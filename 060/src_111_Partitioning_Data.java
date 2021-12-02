Map<Boolean,String> partionedByMaleGender =
    Person.persons()
          .stream()
          .collect(Collectors.partitioningBy(
              Person::isMale,
              Collectors.mapping(Person::getName, 
                  Collectors.joining(", "))));
System.out.println(partionedByMaleGender);

{false=Donna, Laynie, true=Ken, Jeff, Chris, Li}
