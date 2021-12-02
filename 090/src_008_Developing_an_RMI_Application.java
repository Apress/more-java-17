SecurityManager secManager = 
    System.getSecurityManager();
if (secManager == null) {
    System.setSecurityManager(
        new SecurityManager());
