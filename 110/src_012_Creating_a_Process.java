// Configure the ProcessBuilder 
ProcessBuilder pb = 
    new ProcessBuilder(javaPath, "-version")
    .redirectErrorStream(true); 

