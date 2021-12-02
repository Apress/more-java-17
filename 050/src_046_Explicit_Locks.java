public void updateResource() {
    // Acquire the lock and the lock will be released 
    // automatically by the JVM when your code exits the 
    // block  
    synchronized (this) {
        // Logic for updating/reading the shared 
        // resource goes here
    }
}
