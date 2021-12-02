public class GenericArrayTest<T> {
    private T[] elements;
    public GenericArrayTest(int howMany) {
        elements = new T[howMany]; // A compile-time error
    }
    // More code goes here
}
