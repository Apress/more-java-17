InetAddress serverIPAddress = 
    InetAddress.getByName("localhost"); 
int port = 19000; 
InetSocketAddress serverAddress = 
    new InetSocketAddress(serverIPAddress, port);
// Get a selector 
Selector selector = Selector.open(); 
// Create and configure a client socket channel 
SocketChannel channel = SocketChannel.open(); 
channel.configureBlocking(false); 
// Connect to the server 
channel.connect(serverAddress); 
// Register the channel for connect, read and write 
// operations 
int operations = SelectionKey.OP_CONNECT | 
    SelectionKey.OP_READ | 
    SelectionKey.OP_WRITE; 
channel.register(selector, operations); 
// Process the ready set of the selector here 
