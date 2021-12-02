try { 
    java.io.OutputStream os = 
        new java.io.FileOutputStream(
            "C:\\rmilogs\\rmi.log"); 
    java.rmi.server.RemoteServer.setLog(os); 
} catch (FileNotFoundException e) { 
    System.err.println(
        "Could not enable incoming calls logging."); 
    e.printStackTrace(); 
} 
