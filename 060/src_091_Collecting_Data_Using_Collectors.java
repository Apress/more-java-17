List<String> names = Person.persons()
    .stream()
    .map(Person::getName)
    .collect(ArrayList::new, 
             ArrayList::add, 
             ArrayList::addAll);
System.out.println(names);

[Ken, Jeff, Donna, Chris, Laynie, Li]
