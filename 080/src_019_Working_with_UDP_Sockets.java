// Create a UDP socket bound to a port number 15900 at 
// localhost
DatagramSocket socket = 
    new DatagramSocket(15900, 
        InetAddress.getByName("localhost")); 
// Send a packet assuming that you have a datagram packet
// in p 
socket.send(p); 
// Receive a packet 
DatagramPacket p2 = 
    new DatagramPacket(new byte[1024], 1024); 
socket.receive(p2); 
