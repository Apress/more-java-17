Function<String,Integer> strLengthFunc = String::length;
String name = "Ellen";
// name is the receiver of String::length
int len = strLengthFunc.apply(name);
System.out.println("name = " + name + 
    ", length = " + len);
name = Ellen, length = 5
