// Create a FileWriter 
FileWriter writer = new FileWriter("output.txt"); 
// Get the default context of the engine 
ScriptContext defaultCtx = engine.getContext(); 
// Set the output writer for the default context of the
// engine 
defaultCtx.setWriter(writer); 
