SocketChannel sChannel = (SocketChannel)key.channel();
String msg = 
    "message to be sent to remote client goes here"; 
ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes()); 
sChannel.write(buffer); 
