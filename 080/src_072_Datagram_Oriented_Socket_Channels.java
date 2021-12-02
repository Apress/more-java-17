// Create a new datagram channel to send/receive datagram 
DatagramChannel channel = DatagramChannel.open(); 
// Create a datagram channel to receive datagrams from a 
// multicast group 
// that uses IPv4 address type 
DatagramChannel ipv4MulticastChannel = 
    DatagramChannel.open(StandardProtocolFamily.INET); 
// Create a datagram channel to receive datagrams from a 
// multicast group that uses IPv6 address type 
DatagramChannel iPv6MulticastChannel = 
    DatagramChannel.open(StandardProtocolFamily.INET6); 
