// Get the reference of a network interface named "eth1"
NetworkInterface interf = 
    NetworkInterface.getByName("eth1"); 
// Set the IP_MULTICAST_IF option 
client.setOption(StandardSocketOptions.IP_MULTICAST_IF, 
    interf); 
