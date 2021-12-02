// Get a stream of odd integers
Stream<Integer> oddNumbersStream = 
    numbersStream.filter(n -> n % 2 == 1);
