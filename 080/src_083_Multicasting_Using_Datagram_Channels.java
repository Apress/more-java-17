// Prepare a buffer to receive the message from the 
// multicast group 
ByteBuffer buffer = ByteBuffer.allocate(1048); 
// Wait to receive a message from the multicast group 
client.receive(buffer); 
