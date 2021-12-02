Wrapper nWrapper = new Wrapper<Integer>(101);    // #1
// Unchecked warning at compile-time and heap pollution 
// at runtime
Wrapper<String> sWrapper = nWrapper; // #2
String str = sWrapper.get();         // #3 
                                     // ClassCastException
