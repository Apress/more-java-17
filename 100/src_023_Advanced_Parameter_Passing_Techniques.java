// Create a ScriptEngineManager 
ScriptEngineManager manager = new ScriptEngineManager();
// Create three ScriptEngines using the same 
// ScriptEngineManager 
ScriptEngine engine1 = manager.getEngineByName(
    "Groovy"); 
ScriptEngine engine2 = manager.getEngineByName(
    "Groovy"); 
ScriptEngine engine3 = manager.getEngineByName(
    "Groovy"); 
