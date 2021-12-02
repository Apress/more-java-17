// Create a server socket at port 12900, with 100 as the 
// wait queue size at the localhost loopback address 
ServerSocket serverSocket = 
    new ServerSocket(12900, 100, InetAddress. 
getByName("localhost")); 
