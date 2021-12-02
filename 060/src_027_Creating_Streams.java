// Creates a stream of natural numbers
Stream<Long> naturalNumbers = 
    Stream.iterate(1L, n -> n + 1);
// Creates a stream of odd natural numbers
Stream<Long> oddNaturalNumbers = 
    Stream.iterate(1L, n -> n + 2);
