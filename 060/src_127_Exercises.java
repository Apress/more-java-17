Map<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "One");
map.put(3, null);
map.put(4, "Two");
map.entrySet()
   .stream()
   .flatMap(/* Your code goes here */)
   ./* Your code goes here */
   .forEach(System.out::println);
