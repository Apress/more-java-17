Stream.iterate(1L, n -> n + 2)
      .limit(5)
      .forEach(System.out::println);

1
3
5
7
9
