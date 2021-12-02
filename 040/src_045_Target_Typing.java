LambdaUtil2 util = new LambdaUtil2();
Adder adder = (x, y) -> x + y;
util.test(adder); 
// <- OK. Will call test(Adder adder)
