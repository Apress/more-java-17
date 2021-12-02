// You need to AND the returned value from the 
// getModifiers() method with appropriate value returned 
// from xxxModifiers() method of the Modifiers class
int mod = cls.getModifiers() & Modifier.classModifiers();
String modStr = Modifier.toString(mod);
