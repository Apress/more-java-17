Wrapper<Integer> intWrapper = 
    new Wrapper<Integer>(new Integer(10));
Wrapper<? extends Number> numberWrapper = intWrapper; 
    // <- OK
numberWrapper.set(new Integer(1220)); 
    // <- A compile-time error
numberWrapper.set(new Double(12.20)); 
    // <- A compile-time error
