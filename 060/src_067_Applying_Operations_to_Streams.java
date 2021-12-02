Stream.of(1, 5, 6, 2, 3, 4, 7)
      .dropWhile(e -> e < 5)
      .forEach(System.out::println);

5
6
2
3
4
7
