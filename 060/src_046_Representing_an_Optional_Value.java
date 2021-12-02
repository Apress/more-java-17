// Create an Optional for the string "Hello"
Optional<String> str = Optional.of("Hello");
// Print the value in the Optional, if present
str.ifPresent(value ->
    System.out.println("Optional contains " + value));

Optional contains Hello
