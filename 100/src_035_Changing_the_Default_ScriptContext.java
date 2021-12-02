// Create a new context 
ScriptContext ctx = new SimpleScriptContext(); 
// Set the global scope Bindings for ctx the same as the
// Bindings for the manager 
ctx.setBindings(manager.getBindings(), 
    ScriptContext.GLOBAL_SCOPE); 
// Set ctx as the new default context for the engine 
engine.setContext(ctx); 
