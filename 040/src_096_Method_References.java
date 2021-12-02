// Uses a lambda expression
IntFunction<int[]> arrayCreator1 = size -> new int[size];        
int[] empIds1 = arrayCreator1.apply(5); 
// <- Creates an int array of five elements
// Uses an array constructor reference
IntFunction<int[]> arrayCreator2 = int[]::new;        
int[] empIds2 = arrayCreator2.apply(5); 
// <- Creates an int array of five elements
