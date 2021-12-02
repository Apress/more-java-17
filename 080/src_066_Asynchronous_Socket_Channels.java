// Create an asynchronous socket channel 
AsynchronousSocketChannel channel = 
    AsynchronousSocketChannel.open(); 
// Connect the channel to the server 
String serverName = "localhost"; 
int serverPort = 8989; 
SocketAddress serverAddr = 
    new InetSocketAddress(serverName, serverPort);
Future<Void> result = channel.connect(serverAddr); 
System.out.println("Connecting to the server..."); 
// Wait for the connection to complete 
result.get(); 
// Connection to the server is complete now 
System.out.println("Connected to the server..."); 
