try { 
    // Wait indefinitely until someone interrupts the 
    // main thread 
    Thread.currentThread().join(); 
} catch (InterruptedException e) { 
    e.printStackTrace(); 
} 
