URL baseURL = new URL ("your url string goes here"); 
Class[] c = new Class[] {
    String.class, 
    BufferedReader.class, 
    InputStream.class
}; 
Object content = baseURL.getContent(c); 
if (content == null) { 
    // Contents are not of any of the three kinds 
} else if (content instanceof String) { 
    // You got a string 
} else if (content instanceof BufferedReader) { 
    // You got a reader 
} else if (content instanceof InputStream) { 
    // You got an input stream 
} 
