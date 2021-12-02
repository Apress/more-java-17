// Get the reference of the global script object calc
Object calc = engine.get("calculator"); 
// Get the implementation of the Calculator interface
Calculator calculator = 
    inv.getInterface(calc, Calculator.class); 
