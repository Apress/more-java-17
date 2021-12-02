String str  = "Ken,Jeff,Chris,Ellen";
// The stream will contain 4 elements: 
// "Ken", "Jeff", "Chris", and "Ellen"
Stream<String> stream = Stream.of(str.split(","));
