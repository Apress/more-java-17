Comparator<Person> lastFirstDobComp =
    Comparator.comparing(Person::getLastName)
              .thenComparing(Person::getFirstName)
              .thenComparing(Person::getDob);
