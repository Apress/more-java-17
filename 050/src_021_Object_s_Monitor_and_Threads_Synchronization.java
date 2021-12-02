public class MultiLocks {
    public synchronized void method1() {
        // Some statements go here  
        this.method2();    
        MultiLocks.method3();
        // Some statements go here  
    }
    // Rest of the code remains the same as shown before  
}
