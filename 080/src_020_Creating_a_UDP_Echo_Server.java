DatagramSocket socket = 
    new DatagramSocket(15900); 
DatagramPacket packet = 
    new DatagramPacket(new byte[1024], 1024); 
while(true) { 
    // Receive the packet 
    socket.receive(packet); 
    // Send back the same packet to the sender 
    socket.send(packet); 
} 
