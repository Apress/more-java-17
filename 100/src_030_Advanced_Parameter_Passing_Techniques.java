// Create a Bindings, add two key-value pairs to it, and
// set it as the new Bindings for the manager 
Bindings newGlobal = new SimpleBindings(); 
newGlobal.put("n3", 300); 
newGlobal.put("n4", 400); 
manager.setBindings(newGlobal); 
