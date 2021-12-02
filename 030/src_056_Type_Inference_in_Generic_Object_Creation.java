// A compile-time error in JDK8, but allowed in JDK9.
Callable<Integer> c = new Callable<>() {
    @Override
    public Integer call() {
        return 100;
    }
};
