// Create an empty Optional
Optional<String> empty = Optional.empty();
// Create an Optional for the string "Hello"
Optional<String> str = Optional.of("Hello");
// Create an Optional with a String that may be null
String nullableString = ""; 
// <- get a string that may be null...
Optional<String> str2 = Optional.of(nullableString);
