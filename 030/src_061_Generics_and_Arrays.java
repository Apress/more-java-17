Wrapper<String>[] a = (Wrapper<String>[]) Array.
    newInstance(Wrapper.class, 10);
Object[] objArray = (Object[]) a;
objArray[0] = new Object();  
    // <- Will throw a java.lang.
    // ArrayStoreExceptionxception
a[0] = new Wrapper<String>("Hello"); 
    // <- OK. Checked by compiler
