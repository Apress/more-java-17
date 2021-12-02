synchronized (objectReference) {    
    // Trying to synchronize again on the same object is ok  
    synchronized(objectReference) {
        // Some statements go here  
    }
}
