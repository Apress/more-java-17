Stream.of(1, 2, 3)
      .flatMap(n -> Stream.of(n, n * n))
      .forEach(System.out::println);

1
1
2
4
3
9
