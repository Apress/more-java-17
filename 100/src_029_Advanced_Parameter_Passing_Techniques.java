// Create a ScriptEngineManager and two ScriptEngines 
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine1 = manager.getEngineByName(
    "Groovy"); 
ScriptEngine engine2 = manager.getEngineByName(
    "Groovy"); 
// Add two key-value pairs to the manager 
manager.put("n1", 100); 
manager.put("n2", 200); 
