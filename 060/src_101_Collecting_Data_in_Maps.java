Map<Long,String> idToNameMap = Person.persons()
    .stream()
    .collect(Collectors.toMap(Person::getId,
Person::getName));
System.out.println(idToNameMap);

{1=Ken, 2=Jeff, 3=Donna, 4=Chris, 5=Laynie, 6=Li}
