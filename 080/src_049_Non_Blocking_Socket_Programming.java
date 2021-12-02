SelectionKey key = null; 
Iterator iterator = readySet.iterator(); 
while (iterator.hasNext()) { 
    // Get the next ready selection key object 
    key = (SelectionKey)iterator.next(); 
    // Remove the key from ready set 
    iterator.remove(); 
    // Process the key according to the operation 
    if (key.isAcceptable()) { 
        // Process new connection 
    } 
    if (key.isReadable()) { 
        // Read from the channel 
    } 
    if (key.isWritable()) { 
        // Write to the channel 
    } 
} 
