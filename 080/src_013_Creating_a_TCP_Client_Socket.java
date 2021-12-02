// Create a client socket, which is bound to the 
// localhost at any available port 
// connected to remote IP 192.168.1.2 at port 3456
Socket socket = new Socket("192.168.1.2", 3456); 

// Create an unbound client socket. bind it, and 
// connect it. 
Socket socket = new Socket(); 

socket.bind(new InetSocketAddress("localhost", 14101)); 
socket.connect(new InetSocketAddress("localhost", 12900));
