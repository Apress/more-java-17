// Print five random integers
Stream.generate(new Random()::nextInt)
      .limit(5)
      .forEach(System.out::println);
