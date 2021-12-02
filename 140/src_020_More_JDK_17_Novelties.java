// File Person.java
record Person(
    String firstName,
    String lastName,
    LocalDate birthDay,
    String socialSecurityNumber) 
{
    public Person {
      if(lastName == null ||
            "".equals(lastName.trim())) 
        throw new IllegalArgumentException(
          "lastName must not be empty");
    }        
}
