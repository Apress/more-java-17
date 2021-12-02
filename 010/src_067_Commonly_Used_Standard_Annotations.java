@FunctionalInterface
public interface Job {
    void run();
    void abort();
}
