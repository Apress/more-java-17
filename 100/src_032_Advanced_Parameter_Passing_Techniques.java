// Set a new Bindings for the global scope of engine1
Bindings newGlobalEngine1 = new SimpleBindings(); 
newGlobalEngine1.put("n5", 500); 
newGlobalEngine1.put("n6", 600); 
engine1.setBindings(newGlobalEngine1, 
    ScriptContext.GLOBAL_SCOPE); 
