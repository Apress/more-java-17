Test<String> t = new Test<String>();
Wrapper<Integer> iw1 = 
    new Wrapper<Integer>(new Integer(201));
Wrapper<Integer> iw2 = 
    new Wrapper<Integer>(new Integer(202));
// Specify that Integer is the actual type for the type 
// parameter for m1()
t.<Integer>m1(iw1, iw2, "hello");
// Let the compiler figure out the actual type parameters 
// using types for iw1 and iw2
t.m1(iw1, iw2, "hello"); // OK
