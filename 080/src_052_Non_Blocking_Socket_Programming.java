SocketChannel sChannel = (SocketChannel) key.channel();
ByteBuffer buffer = ByteBuffer.allocate(1024); 
int bytesCount = sChannel.read(buffer); 
String msg = ""; 
if (bytesCount > 0) { 
    buffer.flip(); 
    Charset charset = Charset.forName("UTF-8"); 
    CharsetDecoder decoder = charset.newDecoder(); 
    CharBuffer charBuffer = decoder.decode(buffer); 
    msg = charBuffer.toString(); 
    System.out.println("Received Message: " + msg); 
} 
