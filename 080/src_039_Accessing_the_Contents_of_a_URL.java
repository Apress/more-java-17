// Incorrect – 1. Get input and output streams 
// you must get the output stream first 
InputStream ins = connection.getInputStream(); 
OutputStream ous = connection.getOutputStream(); 
// Incorrect – 2. Get output and input streams 
// you must get the output stream and finish writing 
// before you should get the input stream 
OutputStream ous = connection.getOutputStream(); 
InputStream ins = connection.getInputStream(); 
// Correct. Get output stream and get done with it. 
// And, then get the input stream and read data. 
OutputStream ous = connection.getOutputStream(); 
// Write logic to write data using ous object here. 
// Make sure you are done writing data before you 
// call the getInputStream() method as shown below 
InputStream ins = connection.getInputStream();
// Write logic to read data
