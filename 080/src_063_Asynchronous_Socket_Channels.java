class Attachment { 
    AsynchronousServerSocketChannel server; 
    AsynchronousSocketChannel client; 
    ByteBuffer buffer;     
    SocketAddress clientAddr; 
    boolean isRead; 
} 
