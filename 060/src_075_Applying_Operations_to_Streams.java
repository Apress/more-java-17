double sum = Person.persons()
    .stream()
    .reduce(0.0, (partialSum, person) -> 
        partialSum + person.getIncome(),
        (a, b) -> {
            System.out.println(
                "Combiner called: a = " + a + "b = " + b );
            return a + b;
        });
System.out.println(sum);

26000.0
