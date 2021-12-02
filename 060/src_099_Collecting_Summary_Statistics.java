DoubleSummaryStatistics incomeStats =
    Person.persons()
          .stream()
          .map(Person::getIncome)
          .collect(DoubleSummaryStatistics::new,
                   DoubleSummaryStatistics::accept,
                   DoubleSummaryStatistics::combine);
System.out.println(incomeStats);

DoubleSummaryStatistics{count=6, sum=26000.000000, 
min=0.000000, average=4333.333333,
max=8700.000000}
