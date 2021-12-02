// Bind the channel to any available address automatically
channel.bind(null); 
// Bind the channel to "localhost" and port 8989 
InetSocketAddress sAddr = 
    new InetSocketAddress("localhost", 8989); 
channel.bind(sAddr); 
