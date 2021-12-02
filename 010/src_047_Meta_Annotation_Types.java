// Version.java
package com.jdojo.annotation;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, 
    ElementType.METHOD})
public @interface Version {
    int major();
    int minor();
}
