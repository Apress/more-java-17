C:\Java17LanguageFeatures>java -Djava.security.manager
-Djava.security.policy=conf\myjava.policy --module-path 
    build\modules\jdojo.reflection
--module jdojo.reflection/com.jdojo.reflection.
    IllegalAccess2
Exception in thread "main" java.security.
    AccessControlException: access denied
("java.lang.reflect.ReflectPermission" 
    "suppressAccessChecks")
        at java.base/java.security.AccessControlContext.
           checkPermission
           (AccessControlContext.java:472)
        at java.base/java.security.AccessController. 
           checkPermission
           (AccessController.java:895)
        at java.base/java.lang.SecurityManager.
           checkPermission(SecurityManager.java:558)
        at java.base/java.lang.reflect.AccessibleObject.
           checkPermission
           (AccessibleObject.java:85)
        at java.base/java.lang.reflect.AccessibleObject.
           trySetAccessible
           (AccessibleObject.java:245)
        at jdojo.reflection/com.jdojo.reflection.
           IllegalAccess2.main
           (IllegalAccess2.java:26)
