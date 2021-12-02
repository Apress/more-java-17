// "Bad" call (not if you know what you are doing) to 
// join. It waits forever until another thread interrupts 
// it.  
Thread.currentThread().join();
