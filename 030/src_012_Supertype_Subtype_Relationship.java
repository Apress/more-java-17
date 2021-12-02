Wrapper<String> stringWrapper = 
    new Wrapper<String>("Hello");
stringWrapper.set("a string");
Wrapper<Object> objectWrapper = 
    new Wrapper<Object>(new Object());
objectWrapper.set(new Object());
// Use a String object with objectWrapper
objectWrapper.set("a string"); // OK
