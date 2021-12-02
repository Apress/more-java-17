ServerSocket serverSocket = ...; 
// <- create a server socket here; 
while(true) { 
    Socket activeSocket = serverSocket.accept(); 
    Runnable runnable = () -> { 
        // Handle the client request on the activeSocket 
        // here 
    }; 
    new Thread(runnable).start(); // start a new thread 
} 
