C:\Java17LanguageFeatures>java ^
--module-path build\modules\jdojo.reflection;build\modules\
    jdojo.reflection.model ^
--add-modules jdojo.reflection.model ^
--module ^
    jdojo.reflection/com.jdojo.reflection.IllegalAccess3
Exception in thread "main" java.lang.
    IllegalAccessException: class com.jdojo.reflection.
IllegalAccess3 (in module jdojo.reflection) cannot access 
    class com.jdojo.reflection.model.Phone (in module 
    jdojo.reflection.model) because module jdojo.
    reflection.model does not export com.jdojo.reflection.
    model to module jdojo.reflection
        at java.base/jdk.internal.reflect.Reflection.
           newIllegalAccessException
           (Reflection.java:361)
        at java.base/java.lang.reflect.AccessibleObject.
           checkAccess
           (AccessibleObject.java:589)
        at java.base/java.lang.reflect.Constructor.
           newInstance
           (Constructor.java:479)
        at jdojo.reflection/com.jdojo.reflection.
           IllegalAccess3.main
           (IllegalAccess3.java:15)
