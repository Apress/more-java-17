long count = Person.persons()
    .stream()
    .count();
System.out.println("Persons count: " + count);

Persons count: 6
