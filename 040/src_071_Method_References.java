// Uses a lambda expression
BiFunction<Integer,Integer,Integer> func1 = 
    (x, y) -> Integer.sum(x, y);
System.out.println(func1.apply(17, 15));
// Uses a method reference
BiFunction<Integer,Integer,Integer> func2 = 
    Integer::sum;
System.out.println(func2.apply(17, 15));

32
32
