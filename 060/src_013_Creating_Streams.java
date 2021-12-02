String str = "Hello";
// Stream s1 will have one element "Hello"
Stream<String> s1 = Stream.ofNullable(str);
str = null;
// Stream s2 is an empty stream because str is null
Stream<String> s2 = Stream.ofNullable(str);
