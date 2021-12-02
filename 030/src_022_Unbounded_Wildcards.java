// Cannot use <?> with new operator. It is a compile-time 
// error.
new Wrapper<?>("");
error: unexpected type
        new Wrapper<?>("");
                   ^
  required: class or interface without bounds
  found:    ?
1 error
