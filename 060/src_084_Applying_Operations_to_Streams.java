long personCount = Person.persons()
    .stream()
    .count();
System.out.println("Person count: " + personCount);

Person count: 6
