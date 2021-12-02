String str = 
    "jar:http://www.abc.com/myclasses.jar!/myfolder/" + 
    "Abc.class";
URL url = new URL(str); 
JarURLConnection connection = (JarURLConnection) 
    url.openConnection(); 
// Use the connection object to access any jar related 
// data. 
