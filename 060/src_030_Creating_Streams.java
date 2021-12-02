Stream.iterate(2L, PrimeUtil::next)
      .limit(5)
      .forEach(System.out::println);

2
3
5
7
11
