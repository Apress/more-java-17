List<Optional<String>> names = List.of(
    Optional.of("Ken"),
    Optional.empty(),
    Optional.of("Li"),
    Optional.empty(), 
    Optional.of("Toto"));
names.stream()
     .flatMap(/* Your code goes here */)
     .forEach(/* Your code goes here */);
