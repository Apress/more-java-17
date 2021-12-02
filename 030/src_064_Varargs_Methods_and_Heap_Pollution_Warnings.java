public static void process(Wrapper<Long>...nums) {
    Object[] obj = nums;               // Heap pollution
    obj[0] = new Wrapper<>("Hello");   // An array 
                                       // corruption
    Long lv = nums[0].get();       // A ClassCastException
    // Other code goes here
}
