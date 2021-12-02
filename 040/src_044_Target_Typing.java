LambdaUtil2 util = new LambdaUtil2();        
util.test((Adder)(x, y) -> x + y); 
// <- OK. Will call test(Adder adder)
