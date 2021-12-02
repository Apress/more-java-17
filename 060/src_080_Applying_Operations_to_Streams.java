Optional<Person> person = Person.persons()
    .stream()
    .reduce((p1, p2) -> 
        p1.getIncome() > p2.getIncome() ? p1 : p2);
if (person.isPresent()) { 
    System.out.println(
        "Highest earner: " + person.get());
} else {
    System.out.println(
        "Could not get the highest earner.");
}

Highest earner: (3, Donna, FEMALE, 1962-07-29, 8700.00)
