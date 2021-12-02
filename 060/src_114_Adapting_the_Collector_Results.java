Map<Person.Gender, List<Person>> makingOver8000 = 
    Person.persons()
    .stream()
    .collect(groupingBy(
        Person::getGender,
        filtering(p -> 
            p.getIncome() > 8000.00, toList())));
System.out.println(makingOver8000);

{MALE=[], FEMALE=[(3, Donna, FEMALE, 1962-07-29, 8700.00)]}
