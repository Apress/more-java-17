// Prepare a ByteBufer to receive data 
ByteBuffer buffer = ByteBuffer.allocate(1024); 
// Wait to receive data from a remote host 
SocketAddress remoteAddress = channel.receive(buffer);
