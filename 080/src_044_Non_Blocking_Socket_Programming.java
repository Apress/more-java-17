InetAddress hostIPAddress = 
    InetAddress.getByName("localhost"); 
int port = 19000; 
ssChannel.bind(new InetSocketAddress(hostIPAddress, port));
