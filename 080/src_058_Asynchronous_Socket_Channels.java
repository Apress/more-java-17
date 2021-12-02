/* Using a Future Object */ 
// Get a server socket channel instance 
AsynchronousServerSocketChannel server = 
   ... /* get a server instance */; 
// Bind the socket to a host and a port 
server.bind(your_host, your_port); 
// Start accepting a new client connection. Note that the
// accept() method returns immediately by returning a 
// Future object 
Future<AsynchronousSocketChannel> result = server.accept();
// Wait for the new client connection by calling the get()
// method of the Future object. Alternatively, you can poll
// the Future object periodically using its isDone() method
AsynchronousSocketChannel newClient = result.get(); 
// Handle the newClient here and call the server.accept() 
// again to accept another client connection 

/* Using a CompletionHandler Object */ 
// Get a server socket channel instance 
AsynchronousServerSocketChannel server = 
   ... /* get a server instance */; 
// Bind the socket to a host and a port 
server.bind(your_host, your_port); 
// Start accepting a new client connection. The accept() 
// method returns immediately. The completed() or failed()
// method of the ConnectionHandler will be called upon 
// completion or failure of the requested operation 
YourAnyClass attach = ...; // Get an attachment 
server.accept(attach, new ConnectionHandler()); 
