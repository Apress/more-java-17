public class WrapperUtil {
    public static <T> void 
    copy(Wrapper<T> source, Wrapper<T> dest) {
        T value = source.get();
        dest.set(value);
    }
}
