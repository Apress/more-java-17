public class WrapperUtil {
    // New definition of the copy() method
    public static <T> void 
    copy(Wrapper<T> source, Wrapper<? super T> dest){
        T value = source.get();
        dest.set(value);
    }
}
