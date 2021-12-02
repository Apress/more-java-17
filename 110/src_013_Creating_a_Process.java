// Configure the ProcessBuilder inheriting parent's I/O
ProcessBuilder pb = 
    new ProcessBuilder(javaPath,  "--version") 
    .inheritIO(); 
