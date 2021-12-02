List<Person> personList = Person.getPersons();
// Maps each Person object to its first name
List<String> firstNameList = FunctionUtil.map(personList, 
    Person::getFirstName);
// Prints the first name list
FunctionUtil.forEach(firstNameList, System.out::println);

John
Wally
Donna
