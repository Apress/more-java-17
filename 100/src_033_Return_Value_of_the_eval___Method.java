Object result = null; 
// Assigns 3 to result 
result = engine.eval("1 + 2"); 
// Assigns 7 to result 
result = engine.eval("1 + 2; 3 + 4"); 
// Assigns 6 to result 
result = engine.eval("""1 + 2; 3 + 4; 
    def v = 5; v = 6"""); 
// Assigns 5 to result 
result = engine.eval("""1 + 2; 3 + 4; 
    def v = 5""");
// Assigns null to result 
result = engine.eval("println(1 + 2)"); 
