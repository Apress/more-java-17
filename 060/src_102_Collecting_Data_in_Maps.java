Map<Person.Gender,String> genderToNamesMap = 
    Person.persons()
    .stream()
    .collect(Collectors.toMap(Person::getGender, 
                              Person::getName));

Exception in thread "main" 
java.lang.IllegalStateException: Duplicate key Ken ...
