private static class ConnectionHandler 
    implements CompletionHandler
               <AsynchronousSocketChannel, YourAnyClass> {
    @Override 
    public void 
    completed(AsynchronousSocketChannel client, 
            YourAnyClass attach) { 
        // Handle the new client connection here and again
        // start accepting a new client connection 
    } 
    @Override 
    public void 
    failed(Throwable e, YourAnyClass attach) { 
        // Handle the failure here 
    }         
} 
