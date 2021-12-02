// Need to use INET protocol family for an IPv4 addressing
// scheme 
DatagramChannel client = 
    DatagramChannel.open(StandardProtocolFamily.INET); 

// Need to use INET6 protocol family for an IPv6 
// addressing scheme 
DatagramChannel client = 
    DatagramChannel.open(StandardProtocolFamily.INET6);
