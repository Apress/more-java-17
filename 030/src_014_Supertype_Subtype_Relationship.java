// Now objectWrapper points to stringWrapper
objectWrapper = stringWrapper;
// We could store an Object in stringWrapper using 
// objectWrapper
objectWrapper.set(new Object());
// The following statement will throw a runtime 
// ClassCastException
String s = stringWrapper.get();
