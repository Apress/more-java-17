public class WaitAndNotifyMethodCall {
    private Object objectRef = new Object();
    public synchronized void someMethod_1() {
        while (some condition is true) {
            this.wait();
        }
        if (some other condition is true) {
            // Notify all waiting threads      
            this.notifyAll();
        }
    }
    public static synchronized void someMethod_2() {
        while (some condition is true) {
            WaitAndNotifyMethodCall.class.wait();
        }
        if (some other condition is true) {
            // Notify all waiting threads  
            WaitAndNotifyMethodCall.class.notifyAll();
        }
    }

    public void someMethod_3() {
        synchronized(objectRef) {
            while (some condition is true) {
                objectRef.wait();
            }
            if (some other condition is true) {
                // Notify all waiting threads  
                objectRef.notifyAll();
            }
        }    
    }
}
