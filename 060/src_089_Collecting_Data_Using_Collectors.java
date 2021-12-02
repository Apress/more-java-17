// Using a lambda expression
BiConsumer<ArrayList<String>, String> accumulator = 
    (list, name) -> list.add(name);
// Using a method reference
BiConsumer<ArrayList<String>, String> accumulator = 
    ArrayList::add;
