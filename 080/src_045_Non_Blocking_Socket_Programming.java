// Register the server socket channel with the selector 
// for accept operation 
ssChannel.register(selector, SelectionKey.OP_ACCEPT); 
