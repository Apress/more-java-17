Object s = "Hello";
...
if(s instanceof String str) {
    // use local variable 'str', which
    // is of type String
}
...
if(s instanceof String str && 
        str.equalsIgnoreCase("hello")) {
    System.out.println("Hello String!");
}
