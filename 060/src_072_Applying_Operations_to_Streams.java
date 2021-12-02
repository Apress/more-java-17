double sum = Person.persons()
                   .stream()
                   .map(Person::getIncome)
                   .reduce(0.0, Double::sum);
System.out.println(sum);

26000.0
