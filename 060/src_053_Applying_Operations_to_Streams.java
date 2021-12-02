int sum = Stream.of(1, 2, 3, 4, 5)
    .peek(e -> System.out.println("Taking integer: "
         + e))
    .filter(n -> n % 2 == 1)
    .peek(e -> System.out.println("Filtered integer: " 
         + e))
    .map(n -> n * n)
    .peek(e -> System.out.println("Mapped integer: " 
         + e))
    .reduce(0, Integer::sum);
System.out.println("Sum = " + sum);

Taking integer: 1
Filtered integer: 1
Mapped integer: 1
Taking integer: 2
Taking integer: 3
Filtered integer: 3
Mapped integer: 9
Taking integer: 4
Taking integer: 5
Filtered integer: 5
Mapped integer: 25
Sum = 35
