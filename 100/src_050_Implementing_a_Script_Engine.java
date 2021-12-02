// Create the JKScript engine
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName("JKScript");
if (engine == null) {
    System.out.println(
        "JKScript engine is not available. ");
    System.out.println(
        "Add jkscript.jar to CLASSPATH.");
else {
    // Evaluate your JKScript
}
