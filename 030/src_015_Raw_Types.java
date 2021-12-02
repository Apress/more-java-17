// Use the Wrapper<T> generic type as a raw type Wrapper
Wrapper rawType = new Wrapper("Hello"); // An unchecked 
                                        // warning
// Using the Wrapper<T> generic type as a parameterized 
// type Wrapper<String>
Wrapper<String> genericType = new Wrapper<String>("Hello");
// Assigning the raw type to the parameterized type
genericType = rawType; // An unchecked warning
// Assigning the parameterized type to the raw type
rawType = genericType;
