public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java threads!");
    }
}

// Creating an instance:
Runnable aRunnableObject = new HelloRunnable();
