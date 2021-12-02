// Create an unbound server socket 
ServerSocket serverSocket = new ServerSocket(); 
// Create a socket address object 
InetSocketAddress endPoint = new InetSocketAddress(
    "localhost", 12900); 
// Set the wait queue size to 100 
int waitQueueSize = 100; 
// Bind the server socket to localhost at port 12900 
// with a wait queue size of 100 
serverSocket.bind(endPoint, waitQueueSize); 
