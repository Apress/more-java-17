// Create an asynchronous server socket channel object 
AsynchronousServerSocketChannel server = 
    AsynchronousServerSocketChannel.open(); 
// Bind the server to the localhost and the port 8989 
String host = "localhost"; 
int port = 8989; 
InetSocketAddress sAddr = 
    new InetSocketAddress(host, port); 
server.bind(sAddr);             
