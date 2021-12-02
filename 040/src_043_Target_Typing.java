LambdaUtil2 util = new LambdaUtil2();
util.test((double x, double y) -> x + y); 
// <- OK. Will call test(Adder adder)
