// Prepare a message to send 
String msg = "Hello"; 
ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
// Pack the remote address and port into an object 
InetSocketAddress serverAddress = 
    new InetSocketAddress("localhost", 8989); 
// Send the message to the remote host 
channel.send(buffer, serverAddress); 
