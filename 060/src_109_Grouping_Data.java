Map<Person.Gender, List<String>> namesByGender =
    Person.persons()
          .stream()
          .collect(Collectors.groupingBy(Person::getGender,
              Collectors.mapping(
                  Person::getName, 
                  Collectors.toList())));
System.out.println(namesByGender);

{FEMALE=[Donna, Laynie], MALE=[Ken, Jeff, Chris, Li]}
