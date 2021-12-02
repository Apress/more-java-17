public void wrongSynchronizationMethod {
    // This objectRef is created every time a thread calls 
    // this method  
    Object objectRef = new Object();
    // It is a blunder to use objectRef for 
    // synchronization below  
    synchronized(objectRef) {
        // In fact, this block works as if there is no 
        // synchronization, because every thread  creates a 
        // new objectRef and acquires its monitor lock 
        // immediately.  
    }
}
