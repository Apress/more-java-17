// Specify the actual type parameter for the constructor 
// as Double
Test<Number> t1 = new <Double>Test<Number>(
    new Double(12.89));
// Let the compiler figure out that we are using Integer 
// as the actual type parameter for the constructor
Test<Number> t2 = new Test<Number>(new Integer(123));
