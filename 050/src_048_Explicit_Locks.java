public interface ReadWriteLock {
    Lock readLock();
    Lock writeLock();
}
