// Get the JRuby script engine 
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName("jruby");
// Must use the $ prefix in JRuby script 
String script = "puts($msg)"; 
// No $ prefix used in passing the msg parameter to the
// JRuby engine 
engine.put("msg", "Hello from Java"); 
// Execute the script 
engine.eval(script); 
