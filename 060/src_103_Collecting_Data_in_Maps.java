Map<Person.Gender,String> genderToNamesMap = 
    Person.persons()
    .stream()
    .collect(Collectors.toMap(
            Person::getGender, 
            Person::getName,
            (oldValue, newValue) -> 
                String.join(", ", oldValue, newValue)));
System.out.println(genderToNamesMap);

{FEMALE=Donna, Laynie, MALE=Ken, Jeff, Chris, Li}
