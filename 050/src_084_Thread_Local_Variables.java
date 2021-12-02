// Create an anonymous subclass ThreadLocal class and 
// override its initialValue()
// method to return 1000 as the initial value  
private static ThreadLocal<Integer> threadLocal = 
    new ThreadLocal<Integer>() {
        @Override
        public Integer initialValue() {
            return 1000;
        }
    };
