// ClassNamePrinter.java
package com.jdojo.generics.exercises;
public class ClassNamePrinter {
    public static void main(String[] args) {
        ClassNamePrinter.print(10);
        ClassNamePrinter.print(10L);
        ClassNamePrinter.print(10.2);
    }
    public static <T extends Number> void 
            print(T obj) {
        String className = obj.getClass().
            getSimpleName();
        System.out.println(className);
    }
}
