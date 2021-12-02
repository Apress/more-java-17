// Create an object called cs1
CriticalSection cs1 = new CriticalSection();
// Execute the synchronized instance method. Before this 
// method execution starts, the thread that is executing 
// this statement must acquire the monitor lock of the cs1 
// object
cs1.someMethod_1();
