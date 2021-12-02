Person.persons()
      .stream()
      .filter(p -> p.isMale() && p.getIncome() > 5000.0)
      .map(Person::getName)
      .forEach(System.out::println);

Ken
Jeff
