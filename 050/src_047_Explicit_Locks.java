Lock nonFairLock1 = new ReentrantLock();       
    // <- A non-fair lock (Default is non-fair)
Lock nonFairLock2 = new ReentrantLock(false);  
    // <- A non-fair lock  
Lock fairLock2 = new ReentrantLock(true);      
    // <- A fair lock  
