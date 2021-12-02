// Print the values in all non-empty Optionals
optionalList.stream()
            .flatMap(Optional::stream)
            .forEach(System.out::println);

1
2
3
