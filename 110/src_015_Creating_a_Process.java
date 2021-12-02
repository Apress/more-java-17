// Configure the ProcessBuilder 
ProcessBuilder pb = 
    new ProcessBuilder(javaPath, "--version") 
    .redirectOutput(
        ProcessBuilder.Redirect.to( 
            new File("java_product_details.txt"))); 
