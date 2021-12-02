// Process the stream in serial
long count = IntStream.rangeClosed(2, Integer.MAX_VALUE/10)
                      .filter(PrimeUtil::isPrime)
                      .count();
