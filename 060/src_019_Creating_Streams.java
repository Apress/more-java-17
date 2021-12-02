// Obtain a builder
Stream.Builder<String> builder = Stream.builder();
// Add elements and build the stream
Stream<String> stream = builder.add("Ken")
    .add("Jeff")
    .add("Chris")
    .add("Ellen")
.build();
