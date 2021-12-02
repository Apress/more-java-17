Wrapper<Object> objectWrapper = 
    new Wrapper<Object>(new Object());
Wrapper<String> stringWrapper = 
    new Wrapper<String>("Hello");
WrapperUtil.copy(stringWrapper, objectWrapper); 
    // <- OK with the new copy() method
