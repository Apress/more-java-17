ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName(
    "Groovy"); 
// Get the default context of the ScriptEngine 
ScriptContext defaultCtx = engine.getContext(); 
// Work with defaultCtx here 
// Create a new context 
ScriptContext ctx = new SimpleScriptContext(); 
// Configure ctx here 
// Set ctx as the new default context for the engine
engine.setContext(ctx); 
