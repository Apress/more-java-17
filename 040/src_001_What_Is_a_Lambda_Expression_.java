// Takes an int parameter and returns the parameter value 
// incremented by 1
(int x) -> x + 1
// Takes two int parameters and returns their sum
(int x, int y) -> x + y
// Takes two int parameters and returns the maximum of 
// the two
(int x, int y) -> { int max = x > y ? x : y;
                    return max;
                  }
// Takes no parameters and returns void
() -> { }
// Takes no parameters and returns a string "OK"
() -> "OK"
// Takes a String parameter and prints it on the standard 
// output
(String msg) -> { System.out.println(msg); }
// Takes a parameter and prints it on the standard output
msg -> System.out.println(msg)
// Takes a String parameter and returns its length
(String str) -> str.length()
