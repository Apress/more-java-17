import java.util.function.ToIntFunction;
...
ToIntFunction<String> lengthFunction = str -> 
    str.length();
String name = "Ellen";
int len = lengthFunction.applyAsInt(name);
System.out.println("Name = " + name + 
    ", length = " + len);

Name = Ellen, length = 5
