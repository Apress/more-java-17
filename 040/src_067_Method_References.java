// Using a lambda expression
Function<Integer,String> func1 = 
    x -> Integer.toBinaryString(x);
System.out.println(func1.apply(17));

10001
