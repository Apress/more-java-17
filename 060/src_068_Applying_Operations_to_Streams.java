// Create the list of integers
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
// Declare an accumulator called sum and initialize 
// (or seed) it to zero
int sum = 0;
for(int num : numbers) {
    // Accumulate the partial result in sum
    sum = sum + num;
}
// Print the result
System.out.println(sum);

15
