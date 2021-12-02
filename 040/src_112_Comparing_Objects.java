package java.util;
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
    /* Other methods are not shown. */
}
