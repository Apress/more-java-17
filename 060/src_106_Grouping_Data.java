Map<Person.Gender, Long> countByGender =
    Person.persons()
          .stream()
          .collect(Collectors.groupingBy(
              Person::getGender, 
              Collectors.counting()));
System.out.println(countByGender);

{MALE=4, FEMALE=2}
