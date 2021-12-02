private static class ReadWriteHandler 
        implements CompletionHandler<Integer, Attachment> {
    @Override  
    public void 
    completed(Integer result, Attachment attach) {         
        if (result == -1) {                 
            try { 
                attach.client.close(); 
                System.out.format(
                    "Stopped listening to the client %s%n",
                    attach.clientAddr); 
            } catch (IOException ex) { 
                ex.printStackTrace(); 
            } 
            return; 
        }             
        if (attach.isRead) {     
            // A read to the client was completed  
            // Get the buffer ready to read from it 
            attach.buffer.flip(); 
            int limits = attach.buffer.limit(); 
            byte bytes[] = new byte[limits];                 
            attach.buffer.get(bytes, 0, limits); 
            Charset cs = Charset.forName("UTF-8"); 
            String msg = new String(bytes, cs); 
            // Print the message from the client 
            System.out.format(
                "Client at %s says: %s%n", 
                attach.clientAddr, msg); 
            // Let us echo back the same message to the 
            // client 
            attach.isRead = false; // It is a write 
            // Prepare the buffer to be read again 
            attach.buffer.rewind();              
            // Write to the client again 
            attach.client.write(attach.buffer, 
                attach, this); 
        } else { 
            // A write to the client was completed. 
            // Perform another read from the client. 
            attach.isRead = true; 
            // Prepare the buffer to be filled in 
            attach.buffer.clear();                 
            // Perform a read from the client 
            attach.client.read(attach.buffer, attach, 
                this); 
        } 
    } 
    @Override 
    public void 
    failed(Throwable e, Attachment attach) { 
        e.printStackTrace(); 
    } 
} 
