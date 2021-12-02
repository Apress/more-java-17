// Get the class object reference
Class<Test> cls = Test.class;
// Get all annotations on the class declaration    
Annotation[] allAnns = cls.getAnnotations();
System.out.println("Annotation count: " + allAnns.length);
// Print all annotations
for (Annotation ann : allAnns) {
    System.out.println(ann.toString());
}
