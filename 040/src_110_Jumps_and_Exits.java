public void test() {
    for(int i = 0; i < 5; i++) {
        Consumer<Integer> evenIdPrinter = id -> {
            if (id < 0) {
                // A compile-time error. Attempting to 
                // break out of the lambda body
                break;
            }
        };
    }
}
