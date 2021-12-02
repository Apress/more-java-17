optionalList.stream()
        .forEach(p -> p.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empty")));

1
Empty
2
Empty
3
