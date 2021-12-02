// Uses an array constructor reference
Function<Integer,int[]> arrayCreator3 = int[]::new;        
int[] empIds3 = arrayCreator3.apply(5); 
// <- Creates an int array of five elements
