// Get a stream of the squares of odd integers
Stream<Integer> squaredNumbersStream = 
    oddNumbersStream.map(n -> n * n);
