// Get the IP address of the yahoo web server 
InetAddress yahooAddress = InetAddress.
    getByName("www.yahoo.com"); 
// Get the loopback IP address 
InetAddress loopbackAddress = InetAddress.
    getByName(null); 
/* Get the address of the local host. Typically, a name 
   "localhost" is mapped to a loopback address. Here, we 
   are trying to get the IP address of the local computer
   where this code executes and not the loopback address. 
*/ 
InetAddress myComputerIPAddress = 
    InetAddress.getLocalHost(); 
