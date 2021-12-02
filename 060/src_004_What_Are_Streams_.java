// Get a list of integers from 1 to 5
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
...
// Get an iterator from the stream
Iterator<Integer> iterator = numbers.stream().iterator();

// That's not normally the way you'd use streams!
while(iterator.hasNext()) {
    int n = iterator.next();
    ...
}
