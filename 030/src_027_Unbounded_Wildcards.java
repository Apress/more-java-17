public class WrapperUtil {
    public static void printDetails(Wrapper<?> wrapper) {
        // Can assign get() return value to an Object
        Object value = wrapper.get();
        String className = null;
        if (value != null) {
            className = value.getClass().getName();
        }
        System.out.println("Class: " + className);
        System.out.println("Value: " + value);
    }
}
