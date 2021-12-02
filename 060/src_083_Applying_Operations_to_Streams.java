OptionalDouble income = Person.persons()
    .stream()
    .mapToDouble(Person::getIncome)
    .max();
if (income.isPresent()) {
    System.out.println(
        "Highest income: " + income.getAsDouble());
} else {
    System.out.println(
        "Could not get the highest income.");
}

Highest income: 8700.0
