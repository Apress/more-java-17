URL url = new URL("your URL string goes here");     
// Get a connection object 
URLConnection connection = url.openConnection(); 
// Indicate that you will be writing to the connection 
connection.setDoOutput(true); 
// Get output/input streams to write/read data 
OutputStream ous = connection.getOutputStream(); 
InputStream ins = connection.getInputStream(); 
// <- Caution. Read below 
