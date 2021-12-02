double sum = Person.persons()
                   .stream()
                   .reduce(0.0, Double::sum);

error: no suitable method found for 
    reduce(double,Double::sum)
    .reduce(0.0, Double::sum);
    ^
    method Stream.reduce(Person,BinaryOperator
    <Person>) is not applicable
      (argument mismatch; 
    double cannot be converted to Person) ...
