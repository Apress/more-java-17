Class<Test> cls = Test.class;    
// Get the instance of the Version annotation of Test 
// class
Version v = cls.getAnnotation(Version.class);
if (v == null) {
    System.out.println(
        "Version annotation is not present.");
} else {
    int major = v.major();
    int minor = v.minor();
    System.out.println("Version: major=" + major + 
        ", minor=" + minor);
}
