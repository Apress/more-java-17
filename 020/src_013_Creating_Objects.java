Class<Person> cls = Person.class;
// Get the reference of the Person() constructor
Constructor<Person> noArgsCons = cls.getConstructor();
Person p = noArgsCons.newInstance();
