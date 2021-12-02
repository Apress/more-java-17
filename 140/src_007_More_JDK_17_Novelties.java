var a = 5;
switch(a) {
    case 4 -> System.out.println("4");
    default -> System.out.println("default: " + a);
}
var b = switch(a) {
    case 4 -> -1;
    default -> a;
};
var c = switch(a) {
    case 4 -> -1;
    default -> {
        var x9 = a*2;
        yield x9; // goes to c
    }
};
