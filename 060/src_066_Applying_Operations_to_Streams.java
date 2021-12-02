Stream.of(1, 2, 3, 4, 5, 6, 7)
             .dropWhile(e -> e < 5)
             .forEach(System.out::println);

5
6
7
