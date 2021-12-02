Map<Month,String> dobCalendar = Person.persons()
    .stream()
    .collect(groupingBy(p -> p.getDob().getMonth(),
             mapping(Person::getName, joining(", "))));
dobCalendar.entrySet().forEach(System.out::println);

MAY=Ken, Li
DECEMBER=Chris, Laynie
JULY=Jeff, Donna
