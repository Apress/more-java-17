Optional<Person> person = Person.persons()
    .stream()
    .max(Comparator.comparingDouble(Person::getIncome));
if (person.isPresent()) {
    System.out.println(
        "Highest earner: " + person.get());
} else {
    System.out.println(
        "Could not get the highest earner.");
}

Highest earner: (3, Donna, FEMALE, 1962-07-29, 8700.00)
