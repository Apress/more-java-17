// Get the script engine reference 
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName(
    "YOUR_ENGINE_NAME"); 
if (engine instanceof Compilable) { 
    System.out.println(
        "Script compilation is supported."); 
} else { 
    System.out.println(
        "Script compilation is not supported."); 
} 
