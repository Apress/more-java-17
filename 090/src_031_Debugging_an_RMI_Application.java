grant { 
    permission java.io.FilePermission 
        "c:\\rmilogs\\rmi.log", "write"; 
    permission java.util.logging.LoggingPermission 
        "control"; 
}; 
