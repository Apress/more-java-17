double sum = Person.persons()
    .stream()
    .reduce(0.0, (partialSum, person) -> 
        partialSum + person.getIncome(), Double::sum);
System.out.println(sum);

26000.0
