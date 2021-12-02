// Process the stream in parallel
long count = IntStream.rangeClosed(2, Integer.MAX_VALUE/10)
                      .parallel()
                      .filter(PrimeUtil::isPrime)
                      .count();
