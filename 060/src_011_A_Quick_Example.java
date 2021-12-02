// Sum the squares of all odd integers in the numbers list
int sum = numbersList.stream()
                     .filter(n -> n % 2 == 1)
                     .map(n -> n * n)
                     .reduce(0, Integer::sum);
