// Using a lambda expression
Supplier<ArrayList<String>> supplier = 
    () -> new ArrayList<>();
// Using a constructor reference
Supplier<ArrayList<String>> supplier = 
    ArrayList::new;
