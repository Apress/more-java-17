// Get the Groovy engine 
ScriptEngineManager manager = new ScriptEngineManager(); 
ScriptEngine engine = manager.getEngineByName(
    "Groovy");
// Make sure the script engine implements the Invocable
// interface 
if (engine instanceof Invocable) { 
    System.out.println(
        "Invoking procedures is supported."); 
} else { 
    System.out.println(
        "Invoking procedures is not supported."); 
} 
