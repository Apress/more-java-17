public static interface Provider<S> extends Supplier<S> {
    // Returns a Class reference of the class of the 
    // service provider 
    Class<? extends S> type(); 
    @Override 
    S get(); 
} 
