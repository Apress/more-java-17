// Create a packet to receive 1024 bytes of data 
byte[] data = new byte[1024]; 
DatagramPacket packet = 
    new DatagramPacket(data, data.length); 
// Create a packet that a has buffer size of 1024, but it
// will receive data starting at offset 8 (offset zero 
// means the first element in the array) and it will 
// receive only 32 bytes of data. 
byte[] data2 = new byte[1024]; 
DatagramPacket packet2 = new DatagramPacket(data2, 8, 32);
// Create a packet to send 1024 bytes of data that has a 
// destination address of "localhost" and port 15900. 
// Will need to populate data3 array before sending the
// packet. 
byte[] data3 = new byte[1024];     
DatagramPacket packet3 = new DatagramPacket(data3, 1024,                      
    InetAddress.getByName("localhost"), 15900); 
// Create a packet to send 1024 bytes of data that has a
// destination address of "localhost" and port 15900. 
// Will need to populate data4 array before sending the 
// packet. The code sets the destination address by 
// calling methods on the packet instead of specifying 
// it in its constructor. 
byte[] data4 = new byte[1024];     
DatagramPacket packet4 = new DatagramPacket(data4, 1024);
packet4.setAddress(InetAddress.getByName("localhost")); 
packet4.setPort(15900); 
