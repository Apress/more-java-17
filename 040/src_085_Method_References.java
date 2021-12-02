String greeting = "Hello";
String name = " Laynie";
// Uses a lambda expression
BiFunction<String,String,String> func1 = 
    (s1, s2) -> s1.concat(s2);
System.out.println(func1.apply(greeting, name));
// Uses an instance method reference on an unbound 
// receiver
BiFunction<String,String,String> func2 = String::concat;
System.out.println(func2.apply(greeting, name));

Hello Laynie
Hello Laynie
