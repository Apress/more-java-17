StringToIntMapper mapper = new StringToIntMapper() {
    @Override
    public int map(String str) {
        return str.length();
    }
};
String name = "Kristy";
int mappedValue = mapper.map(name);
System.out.println("name=" + name + 
    ", mapped value=" + mappedValue);

name=Kristy, mapped value=6
