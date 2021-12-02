List<Integer> numbers = List.of(1, 2, 3, 4, 5);
int sum = numbers.stream()
                 .filter(n -> n % 2 == 1)
                 .map(n -> n * n)
                 .reduce(0, Integer::sum);
