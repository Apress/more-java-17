// Grant to all codebase 
grant { 
    // Permission to connect with 192.168.10.123 
    // at port 5000 
    permission java.net.SocketPermission 
        "192.168.10.123:5000", "connect"; 
    // Connect permission to any host at port 80 
    permission java.net.SocketPermission 
        "*:80", "connect"; 
    // All socket permissions to on port >= 1024 
    // on the localhost 
    permission java.net.SocketPermission 
        "localhost:1024-", "listen, accept, connect";
}; 
