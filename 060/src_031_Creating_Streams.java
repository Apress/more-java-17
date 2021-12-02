// Print the first 5 prime numbers
Stream.iterate(2L, n -> n + 1)
      .filter(PrimeUtil::isPrime)
      .limit(5)
      .forEach(System.out::println);

2
3
5
7
11
