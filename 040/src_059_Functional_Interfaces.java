// Create two functions
Function<Long, Long> square = x -> x * x;
Function<Long, Long> addOne = x -> x + 1;        
// Compose functions from the two functions
Function<Long, Long> squareAddOne = square.andThen(addOne);
Function<Long, Long> addOneSquare = square.compose(addOne);
// Get an identity function
Function<Long, Long> identity = Function.<Long>identity();
// Test the functions
long num = 5L;
System.out.println("Number: " + num);
System.out.println("Square and then add one: " + 
    squareAddOne.apply(num));
System.out.println("Add one and then square: " + 
    addOneSquare.apply(num));
System.out.println("Identity: " + identity.apply(num));

Number: 5
Square and then add one: 26
Add one and then square: 36
Identity: 5
