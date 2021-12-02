// Get the Groovy engine 
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName(
    "Groovy"); 
// Do not instantiate SimpleBindings class directly. 
// Use the createBindings() method of the engine to create
// a Bindings. 
Bindings params = engine.createBindings(); 
// Work with params as usual 
