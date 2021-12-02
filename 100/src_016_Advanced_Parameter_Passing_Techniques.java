// Get the reader and writers from the script context 
Reader inputReader = ctx.getReader(); 
Writer outputWriter = ctx.getWriter(); 
Writer errWriter = ctx.getErrorWriter(); 
// Write all script outputs to an out.txt file 
Writer fileWriter = new FileWriter("out.txt"); 
ctx.setWriter(fileWriter); 
