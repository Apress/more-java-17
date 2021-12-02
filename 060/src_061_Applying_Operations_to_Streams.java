long count = Stream.of("Ken", "Jeff", "Ellen")
           .flatMap(name -> 
               IntStream.range(0, name.length())
               .mapToObj(name::charAt))
           .filter(ch -> ch == 'e' || ch == 'E')
           .count();
