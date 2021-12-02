Object s = "Hello";
...
if(s instanceof String) {
    String str = (String) s;
    if(str.equalsIgnoreCase("hello")) {
        System.out.println("Hello String!");
    }
}
