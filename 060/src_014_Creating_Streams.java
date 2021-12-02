import java.util.stream.Stream;
...
// Compute the sum of the squares of all odd integers in 
// the list
int sum = Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
System.out.println("Sum = " + sum);

Sum = 35
