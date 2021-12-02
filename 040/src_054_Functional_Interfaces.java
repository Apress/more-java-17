@FunctionalInterface
public interface Processor {
    <T> void process(T[] list);    
}
