ProcessBuilder pb = new ProcessBuilder() 
    .command("/opt/jdk17/bin/java", 
        "--module-path", 
        "myModulePath", 
        "--module", 
        "myModule/className"); 

