Optional<Integer> max = Stream.<Integer>empty()
                              .reduce(Integer::max);
if (max.isPresent()) {
    System.out.println("max = " + max.get());
} else {
    System.out.println("max is not defined.");
}

max is not defined.
