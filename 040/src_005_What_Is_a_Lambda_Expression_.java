StringToIntMapper mapper = (String str) -> str.length();
String name = "Kristy";
int mappedValue = mapper.map(name);
System.out.println("name=" + name + 
    ", mapped value=" + mappedValue);

name=Kristy, mapped value=6
