// Using a method reference
Function<Integer, String> func2 = 
    Integer::toBinaryString;
System.out.println(func2.apply(17));

10001
