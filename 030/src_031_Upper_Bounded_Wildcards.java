public static double sum(Wrapper<? extends Number> n1, 
        Wrapper<? extends Number> n2) {
    Number num1 = n1.get();
    Number num2 = n2.get();
    double sum = num1.doubleValue() + num2.doubleValue();
    return sum;
}
