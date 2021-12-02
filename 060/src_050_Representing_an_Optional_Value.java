optionalList.stream()
            .map(p -> p.or(() -> Optional.of(0)))
            .forEach(System.out::println);

Optional[1]
Optional[0]
Optional[2]
Optional[0]
Optional[3]
