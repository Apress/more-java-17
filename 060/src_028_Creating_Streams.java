// Creates a stream of the first 10 natural numbers
Stream<Long> tenNaturalNumbers = 
    Stream.iterate(1L, n -> n + 1).
    limit(10);
