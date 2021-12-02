public void run() {
    while (Thread.currentThread().isInterrupted())) {
        try {
            // Do the processing  
        } catch (InterruptedException e) {
            // Stop the thread by exiting the loop  
            break;
        }
    }
}
