public class WontCompile {
    // A compile-time error. Version annotation cannot 
    // be used on a field.
    @Version(major = 1, minor = 1)
    int id = 110;
}
