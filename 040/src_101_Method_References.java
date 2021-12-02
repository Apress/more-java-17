import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
...
Function<String[],List<String>> asList = 
    Arrays::<String>asList;
String[] namesArray = {"Jim", "Ken", "Li"};
List<String> namesList = asList.apply(namesArray);
for(String name : namesList) {
    System.out.println(name);
}

Jim
Ken
Li
