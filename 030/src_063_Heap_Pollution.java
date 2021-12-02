Wrapper<? extends Number> nW = new Wrapper<Long>(1L); // #1
// Unchecked cast and unchecked warning occurs when the
// following statement #2 is compiled. Heap pollution 
// occurs, when it is executed.
Wrapper<Short> sw = (Wrapper<Short>) nW; // #2
short s = sw.get();                      // #3 
    // ClassCastException
