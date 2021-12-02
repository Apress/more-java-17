Stream.generate(new PrimeUtil()::next)
      .skip(100)
      .limit(5)
      .forEach(System.out::println);

547
557
563
569
571
