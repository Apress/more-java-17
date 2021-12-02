public @interface A {
    String value();
    int id() default 10;
}
// Same as @A(value="Hello", id=10)
@A("Hello")
public class Test {
    // Code goes here
}
// Won't compile. Must use only one value to omit the 
// element name
@A("Hello", id=16)
public class WontCompile {
    // Code goes here
}
// OK. Must use name=value pair when passing more than 
// one value
@A(value="Hello", id=16)
public class Test {
    // Code goes here
}
