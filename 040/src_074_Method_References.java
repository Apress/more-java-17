Supplier<List<Person>> supplier = Person::getPersons;
List<Person> personList = supplier.get();
FunctionUtil.forEach(personList, 
    p -> System.out.println(p));

John Jacobs, MALE, 1975-01-20
Wally Inman, MALE, 1965-09-12
Donna Jacobs, FEMALE, 1970-09-12
