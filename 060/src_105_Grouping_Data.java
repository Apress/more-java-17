Map<Person.Gender, List<Person>> personsByGender =
    Person.persons()
          .stream()
          .collect(Collectors.groupingBy(
                  Person::getGender));
System.out.println(personsByGender);

{FEMALE=[(3, Donna, FEMALE, 1962-07-29, 8700.00), 
  (5, Laynie, FEMALE, 2012-12-13, 0.00)],
MALE=[(1, Ken, MALE, 1970-05-04, 6000.00), 
  (2, Jeff, MALE, 1970-07-15, 7100.00),
  (4, Chris, MALE, 1993-12-16, 1800.00), 
  (6, Li, MALE, 2001-05-09, 2400.00)]}
