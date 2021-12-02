try { 
    InetAddress addr = InetAddress.getLocalHost(); 
    System.out.println("My computer name: " + 
        addr.getHostName()); 
    System.out.println("My computer IP address: " + 
        addr.getHostAddress());             
} catch (UnknownHostException e) { 
    e.printStackTrace(); 
} 
