Supplier<Item> func1 = Item::new;
Function<String,Item> func2 = Item::new;
BiFunction<String,Double,Item> func3 = Item::new;
System.out.println(func1.get());
System.out.println(func2.apply("Apple"));
System.out.println(func3.apply("Apple", 0.75));

Constructor Item() called.
name = Unknown, price = 0.0
Constructor Item(String) called.
name = Apple, price = 0.0
Constructor Item(String, double) called.
name = Apple, price = 0.75
