InetAddress localIPAddress = 
    InetAddress.getByName("192.168.11.101");
int localPort = 15900; 
DatagramSocket socket = 
    new DatagramSocket(localPort, localIPAddress); 
// Connect the socket to a remote address 
InetAddress remoteIPAddress = 
    InetAddress.getByName("192.168.12.115"); 
int remotePort = 17901; 
socket.connect(remoteIPAddress, remotePort); 
