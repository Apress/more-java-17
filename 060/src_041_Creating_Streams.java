String str = "5 apples and 25 oranges";
str.chars()
   .filter(n -> !Character.isDigit((char)n) 
                && !Character.isWhitespace((char)n))
   .forEach(n -> System.out.print((char)n));

applesandoranges
