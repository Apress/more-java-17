public class MultiLocks {
    public synchronized void method1() {
        // Some statements go here  
        this.method2();
        // Some statements go here  
    }
    public synchronized void method2() {
        // Some statements go here  
    }
    public static synchronized void method3() {
        // Some statements go here  
        MultiLocks.method4();
        // Some statements go here  
    }
    public static synchronized void method4() {
        // Some statements go here  
    }
}
