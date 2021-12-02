static <T> Stream<T> iterate(
    T seed, 
    Predicate<? super T> hasNext, 
    UnaryOperator<T> next)
