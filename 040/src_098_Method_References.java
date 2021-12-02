// Uses an array constructor reference
IntFunction<int[][]> TwoDimArrayCreator = int[][]::new;        
int[][] matrix = TwoDimArrayCreator.apply(5); 
// <- Creates an int[5][] array
