// Create some predicates
Predicate<Integer> greaterThanTen = x -> x > 10;
Predicate<Integer> divisibleByThree = x -> x % 3 == 0;
Predicate<Integer> divisibleByFive = x -> x % 5 == 0;
Predicate<Integer> equalToTen = Predicate.isEqual(null);
// Create predicates using NOT, AND, and OR on other 
// predicates
Predicate<Integer> lessThanOrEqualToTen = 
    greaterThanTen.negate();
Predicate<Integer> divisibleByThreeAndFive = 
    divisibleByThree.and(divisibleByFive);
Predicate<Integer> divisibleByThreeOrFive = 
    divisibleByThree.or(divisibleByFive);
// Test the predicates
int num = 10;
System.out.println("Number: " + num);
System.out.println("greaterThanTen: " + 
    greaterThanTen.test(num));
System.out.println("divisibleByThree: " + 
    divisibleByThree.test(num));
System.out.println("divisibleByFive: " + 
    divisibleByFive.test(num));
System.out.println("lessThanOrEqualToTen: " + 
    lessThanOrEqualToTen.test(num));
System.out.println("divisibleByThreeAndFive: " + 
    divisibleByThreeAndFive.test(num));
System.out.println("divisibleByThreeOrFive: " + 
    divisibleByThreeOrFive.test(num));
System.out.println("equalsToTen: " + 
    equalToTen.test(num));

Number: 10
greaterThanTen: false
divisibleByThree: false
divisibleByFive: true
lessThanOrEqualToTen: true
divisibleByThreeAndFive: false
divisibleByThreeOrFive: true
equalsToTen: false
