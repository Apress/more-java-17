// Get the packet's buffer, offset, and length 
byte[] dataBuffer = receivedPacket.getData(); 
int offset = receivedPacket.getOffset(); 
int length = receivedPacket.getLength(); 
// Copy the received data using offset and length to 
// receivedData array, which will hold all good data 
byte[] receivedData = new byte[length]; 
System.arraycopy(dataBuffer, offset, 
    receivedData, 0, 
    length); 
