// Register for read and write 
sChannel.register(key.selector(), 
    SelectionKey.OP_READ | SelectionKey.OP_WRITE); 
