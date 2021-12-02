Person.persons()
      .stream()
      .filter(Person::isMale)
      .filter(p -> p.getIncome() > 5000.0)
      .map(Person::getName)
      .forEach(System.out::println);

Ken
Jeff
