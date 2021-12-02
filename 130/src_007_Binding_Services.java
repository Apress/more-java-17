C:\jdk17book>jlink ^
    --module-path jmods;C:\java17\jmods ^
    --add-modules jdojo.prime.client --suggest-providers

... 
jdojo.prime file:///C:/jdk17book/jmods/
        jdojo.prime.jmod
    uses com.jdojo.prime.PrimeChecker 
jdojo.prime.client file:///C:/jdk17book/
    jmods/jdojo.prime.client.jmod 
jdojo.prime.faster file:///C:/jdk17book/
    jmods/jdojo.prime.faster.jmod 
jdojo.prime.probable file:///C:/jdk17book/
    jmods/jdojo.prime.probable.jmod 
... 
Suggested providers: 
  jdojo.prime provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
  jdojo.prime.faster provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
  jdojo.prime.probable provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
... 
