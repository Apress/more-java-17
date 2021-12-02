public class Car {
  private var a = "Hello";
  // <- Won't compile
}

...

var a;
a = 3;
// <- Won't compile

...

var b = 3;
b = 5.9;
// <- Won't compile
