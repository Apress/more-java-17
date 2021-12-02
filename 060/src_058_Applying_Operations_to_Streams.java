Stream.of(1, 2, 3)
      .map(n -> Stream.of(n, n * n))
      .forEach(e -> e.forEach(System.out::println));

1
1
2
4
3
9
