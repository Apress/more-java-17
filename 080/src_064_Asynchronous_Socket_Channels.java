private static class ConnectionHandler 
    implements CompletionHandler
               <AsynchronousSocketChannel, Attachment> {
    @Override 
    public void 
    completed(AsynchronousSocketChannel client, 
            Attachment attach) { 
        try { 
            // Get the client address 
            SocketAddress clientAddr = 
                client.getRemoteAddress(); 
            System.out.format(
                "Accepted a connection from %s%n", 
                clientAddr); 
            // Accept another connection 
            attach.server.accept(attach, this); 
            // Handle the client connection by invoking an
            // asyn read 
            Attachment newAttach = new Attachment(); 
            newAttach.server = attach.server; 
            newAttach.client = client; 
            newAttach.buffer = ByteBuffer.allocate(2048); 
            newAttach.isRead = true; 
            newAttach.clientAddr = clientAddr;     
            // Create a new completion handler for reading
            // to and writing from the new client 
            ReadWriteHandler readWriteHandler = 
                new ReadWriteHandler(); 
            // Read from the client              
            client.read(newAttach.buffer, newAttach, 
                readWriteHandler);                 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
    @Override 
    public void failed(Throwable e, Attachment attach) { 
        System.out.println(
            "Failed to accept a connection."); 
        e.printStackTrace(); 
    }         
} 
