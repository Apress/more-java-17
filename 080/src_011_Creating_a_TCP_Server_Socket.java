ServerSocket serverSocket = ...; 
// <- create a server socket here; 
while(true) { 
    Socket activeSocket = serverSocket.accept(); 
    // Handle the client request on activeSocket here 
} 
