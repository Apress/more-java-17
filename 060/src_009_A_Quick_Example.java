// Sum all integers in the stream
int sum = squaredNumbersStream.
    reduce(0, (n1, n2) -> n1 + n2);
