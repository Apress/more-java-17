// Square the input, add one to the result, and square 
// the result
Function<Long, Long> chainedFunction = 
    ((Function<Long, Long>)(x -> x * x))
                        .andThen(x -> x + 1)
                        .andThen(x -> x * x);
System.out.println(chainedFunction.apply(3L));

100
