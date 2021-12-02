// Return the second part of the current time as the 
// initial value
ThreadLocal<Integer> threadLocal = 
    ThreadLocal.withInitial(() -> 
        LocalTime.now().getSecond()
    );
