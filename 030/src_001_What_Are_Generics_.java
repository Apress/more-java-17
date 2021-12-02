ObjectWrapper stringWrapper = new ObjectWrapper("Hello");
stringWrapper.set("Another string");
String myString = (String) stringWrapper.get();
