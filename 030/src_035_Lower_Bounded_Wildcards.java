Wrapper<Object> objectWrapper = 
    new Wrapper<Object>(new Object());
Wrapper<String> stringWrapper = 
    new Wrapper<String>("Hello");
WrapperUtil.copy(stringWrapper, objectWrapper); 
    // <- A compile-time error
