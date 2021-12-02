// Configure the ProcessBuilder inheriting parent's I/O 
ProcessBuilder pb = 
    new ProcessBuilder(javaPath, "--version")
        .redirectInput(ProcessBuilder.Redirect.INHERIT) 
        .redirectOutput(ProcessBuilder.Redirect.INHERIT) 
        .redirectError(ProcessBuilder.Redirect.INHERIT); 

