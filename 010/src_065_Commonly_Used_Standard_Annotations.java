// Won't compile because m2() does not override any method
public class C extends A {
    @Override
    public void m2() {
    }
}
