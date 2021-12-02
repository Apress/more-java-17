// Cast the engine reference to the Invocable type 
Invocable inv = (Invocable) engine; 
// Get the reference of the Calculator interface 
Calculator calc = inv.getInterface(Calculator.class); 
if (calc == null) { 
    System.err.println(
        "Calculator interface implementation not found.");
} else { 
    // Use calc to call add() and subtract() methods 
} 
