import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
...
// Create and populate a set of strings
Set<String> names = Set.of("Ken", "jeff");
// Create a sequential stream from the set
Stream<String> sequentialStream = names.stream();
// Create a parallel stream from the set
Stream<String> parallelStream = names.parallelStream();
