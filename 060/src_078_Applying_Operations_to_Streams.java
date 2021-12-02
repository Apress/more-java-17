Optional<Integer> max = Stream.of(1, 2, 3, 4, 5)
                              .reduce(Integer::max);
if (max.isPresent()) {
    System.out.println("max = " + max.get());
} else {
    System.out.println("max is not defined.");
}

max = 5
