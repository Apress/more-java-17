double sum = Person.persons()
   .parallelStream()
   .reduce(0.0,
       (Double partialSum, Person p) -> {
          double accumulated = partialSum + p.getIncome();
          System.out.println(
              Thread.currentThread().getName() +
              " - Accumulator: partialSum = " +                         
              partialSum + ", person = " + p +
              ", accumulated = " + accumulated);
         return accumulated;
       },
       (a, b) -> {
           double combined = a + b;
           System.out.println(
             Thread.currentThread().getName() +
             " - Combiner: a = " + a + ", b = " + b +
             ", combined = " + combined);
          return combined;
       });
System.out.println(sum);

ForkJoinPool.commonPool-worker-4 - 
  Accumulator: partialSum = 0.0, 
  person = (5, Laynie, FEMALE, 2012-12-13, 0.00), 
  accumulated = 0.0
ForkJoinPool.commonPool-worker-2 - 
  Accumulator: partialSum = 0.0, 
  person = (6, Li, MALE, 2001-05-09, 2400.00), 
  accumulated = 2400.0
ForkJoinPool.commonPool-worker-1 - 
  Accumulator: partialSum = 0.0, 
  person = (2, Jeff, MALE, 1970-07-15, 7100.00), 
  accumulated = 7100.0
ForkJoinPool.commonPool-worker-2 - 
  Combiner: a = 0.0, b = 2400.0, combined = 2400.0
ForkJoinPool.commonPool-worker-5 - 
  Accumulator: partialSum = 0.0, 
  person = (3, Donna, FEMALE, 1962-07-29, 8700.00), 
  accumulated = 8700.0
main - Accumulator: partialSum = 0.0, 
  person = (4, Chris, MALE, 1993-12-16, 1800.00),
  accumulated = 1800.0
ForkJoinPool.commonPool-worker-3 - 
  Accumulator: partialSum = 0.0, 
  person = (1, Ken, MALE, 1970-05-04, 6000.00), 
  accumulated = 6000.0
main - Combiner: a = 1800.0, b = 2400.0, 
  combined = 4200.0
ForkJoinPool.commonPool-worker-5 - 
  Combiner: a = 7100.0, b = 8700.0, combined = 15800.0
ForkJoinPool.commonPool-worker-5 - 
  Combiner: a = 6000.0, b = 15800.0, combined = 21800.0
ForkJoinPool.commonPool-worker-5 - 
  Combiner: a = 21800.0, b = 4200.0, combined = 26000.0
26000.0
