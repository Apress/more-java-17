Wrapper<Object> objectWrapper = 
    new Wrapper<Object>(new Object());
WrapperUtil.printDetails(objectWrapper); // OK
Wrapper<String> stringWrapper = 
    new Wrapper<String>("Hello");
WrapperUtil.printDetails(stringWrapper); // A compile-time 
                                         // error
