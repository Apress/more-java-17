IntFunction<Long> factorialCalc = new IntFunction<Long>() {
    @Override
    public Long apply(int n) {
        if (n < 0) {
            String msg = "Number must not be negative.";
            throw new IllegalArgumentException(msg);
        }
        if (n == 0) {
            return 1L;
        } else {
            return n * this.apply(n - 1);
        }
    }
};
