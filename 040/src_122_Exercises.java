public static void test() {
    int n = 100;
    Function<Integer,Integer> f = n -> n + 1;
    System.out.println(f.apply(100));
}
