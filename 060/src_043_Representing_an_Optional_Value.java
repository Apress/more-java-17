Person ken = new Person(1, "Ken", Person.Gender.MALE, 
    null, 6000.0);
int year = ken.getDob().getYear(); 
// <- Throws a NullPointerException
System.out.println("Ken was born in the year " + year);
