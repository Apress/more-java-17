// Create a buffered reader and a buffered writer from 
// the socket's input and output streams, so that we can
// read/write one line at a time 
BufferedReader br = new BufferedReader(
    new InputStreamReader(activeSocket.
        getInputStream()));
BufferedWriter bw = new BufferedWriter(
    new OutputStreamWriter(activeSocket.
        getOutputStream())); 
