Stream<Integer> nums = 
    Stream.iterate(1, n -> n <= 10, n -> n + 1);
