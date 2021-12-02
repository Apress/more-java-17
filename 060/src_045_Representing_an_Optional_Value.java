// Create an Optional for the string "Hello"
Optional<String> str = Optional.of("Hello");
// Print the value in Optional
if (str.isPresent()) {
    String value = str.get();
    System.out.println("Optional contains " + value);
} else {
    System.out.println("Optional is empty.");
}

Optional contains Hello
