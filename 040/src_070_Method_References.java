Function<Integer,Integer> func2 = Integer::sum; 
// <- A compile-time error

Error: incompatible types: invalid
        Function<Integer, Integer>
method sum in class Integer cannot
required: int,int
found: Integer
reason: actual and formal argument

method reference
func2 = Integer::sum;
be applied to given types

lists differ in length
