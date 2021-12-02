// Uses Integer.valueOf(int)
Function<Integer,Integer> func1 = Integer::valueOf;

// Uses Integer.valueOf(String)
Function<String,Integer> func2 = Integer::valueOf;

// Uses Integer.valueOf(String, int)
BiFunction<String,Integer,Integer> func3 = 
    Integer::valueOf;

System.out.println(func1.apply(17));
System.out.println(func2.apply("17"));
System.out.println(func3.apply("10001", 2));

17
17
17
