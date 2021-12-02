ServerSocketChannel ssChannel = 
    (ServerSocketChannel)key.channel(); 
SocketChannel sChannel = (SocketChannel)ssChannel.accept();
sChannel.configureBlocking(false); 
// Register only for read. Your message is small and you 
// write it back to the client as soon as you read it. 
sChannel.register(key.selector(), SelectionKey.OP_READ); 
