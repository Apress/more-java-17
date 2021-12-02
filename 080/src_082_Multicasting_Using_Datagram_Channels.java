String MULTICAST_IP = "239.1.1.1"; 
// Join the multicast group on interf interface 
InetAddress group = InetAddress.getByName(MULTICAST_IP); 
MembershipKey key = client.join(group, interf); 
