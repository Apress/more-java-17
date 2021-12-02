Map<Person.Gender, Long> countByGender = Person.persons()
    .stream()
    .collect(Collectors.toMap(
            Person::getGender, 
            p -> 1L,
            (oldCount, newCount) -> oldCount + 1));
System.out.println(countByGender);

{MALE=4, FEMALE=2}
