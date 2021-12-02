// Declare an accumulator called sum and initialize 
// it to zero
double sum = 0.0;
for(Person person : Person.persons()) {
    // Map the Person to his income double
    double income = person.getIncome();
    // Accumulate the partial result in sum
    sum = sum + income;
}
System.out.println(sum);
