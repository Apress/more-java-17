// The run() method of a thread class  
public void run() {
    while(true) {
        // do some processing here...  
        Thread.yield(); // Let's yield to other threads  
    }
}
