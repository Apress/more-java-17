long count = Stream.of("Ken", "Jeff", "Ellen")
           .map(name -> name.chars())
           .flatMap(intStream -> intStream.
               mapToObj(n -> (char)n))
           .filter(ch -> ch == 'e' || ch == 'E')
           .count();
System.out.println("Es count: " + count);

Es count: 4
