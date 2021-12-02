CompletableFuture<ProcessHandle> future = handle.onExit();
// Print a message when process terminates 
future.thenAccept((ProcessHandle ph) -> { 
    System.out.printf(
        "Job (pid=%d) terminated.%n", ph.pid()); 
}); 
