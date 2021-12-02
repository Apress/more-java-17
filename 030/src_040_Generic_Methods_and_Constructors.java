public static <T> void copy(Wrapper<T> source, 
        Wrapper<? super T> dest) {
    T value = source.get();
    dest.set(value);
}
