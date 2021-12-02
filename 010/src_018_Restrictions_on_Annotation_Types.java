public @interface GoodOne {
    Class element1();                 
      // <- Any Class type
    Class<Test> element2();           
      // <- Only Test class type
    Class<? extends Test> element3(); 
      // <- Test or its subclass type
}
