Wrapper<Integer> idWrapper = 
    new Wrapper<Integer>(new Integer(101));
idWrapper.set(new Integer(897)); 
    // <- OK to pass an Integer
Integer id = idWrapper.get();
// A compile-time error. You can use idWrapper only 
// with an Integer.
idWrapper.set("hello");
