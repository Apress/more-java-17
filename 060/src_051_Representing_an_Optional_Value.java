// Print the values in all non-empty Optionals
optionalList.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .forEach(System.out::println);

1
2
3
