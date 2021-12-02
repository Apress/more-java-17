Wrapper<Person> personWrapper = new Wrapper<Person>(
    new Person(1, "Chris"));
personWrapper.set(new Person(2, "Laynie"));
Person laynie = personWrapper.get();
