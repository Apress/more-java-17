long count = Person.persons()
    .stream()
    .collect(Collectors.counting());
System.out.println("Person count: " + count);

Person count: 6
