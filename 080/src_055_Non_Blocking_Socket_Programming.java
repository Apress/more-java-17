if (key.isConnectable()) { 
    try { 
        // Call to finishConnect() is in a loop as it is 
        // non-blocking for your channel 
        while(channel.isConnectionPending()) { 
            channel.finishConnect(); 
        } 
    } catch (IOException e) { 
        // Cancel the channel's registration with the 
        // selector 
        key.cancel(); 
        e.printStackTrace(); 
    } 
} 
