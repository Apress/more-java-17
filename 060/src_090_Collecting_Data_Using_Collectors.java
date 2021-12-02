// Using a lambda expression
BiConsumer<ArrayList<String>, 
           ArrayList<String>> combiner =
    (list1, list2) -> list1.addAll(list2);
// Using a method reference
BiConsumer<ArrayList<String>, 
           ArrayList<String>> combiner = 
    ArrayList::addAll;
