public class CriticalSection2 {
    public synchronized void someMethod10() {
        // Method code goes here. Only one thread can 
        // execute here at a time.  
    }
    public void someMethod11() {
        synchronized(this) {
            // Method code goes here. Only one thread 
            // can execute here at a time.  
        }
    }
    public void someMethod12() {
        // Some statements go here. Multiple threads can 
        // execute here at a time.  
        synchronized(this) {
            // Some statements go here. Only one thread 
            // can execute here at a time.
        }
        // Some statements go here. Multiple threads can 
        // execute here at a time.
    }
    public static synchronized void someMethod20() {
        // Method code goes here. Only one thread can 
        // execute here at a time.
    }
    public static void someMethod21() {
        synchronized(CriticalSection2.class) {
            // Method code goes here. Only one thread can 
            // execute here at a time.  
        }
    }
    public static void someMethod_22() {
        // Some statements go here: section_1. Multiple 
        // threads can execute here at a time.
        synchronized(CriticalSection2.class) {
            // Some statements go here: section_2. Only 
            // one thread can execute here at a time.
        }
        // Some statements go here: section_3.  Multiple 
        // threads can execute here at a time  
    }
}
