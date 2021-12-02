package java.util;
@FunctionalInterface
public interface Comparator<T> {
    // An abstract method declared in the interface
    int compare(T o1, T o2);    
    // Re-declaration of the equals() method in the 
    // Object class
    boolean equals(Object obj);
    // Many more static and default methods that are 
    // not shown here.
}
