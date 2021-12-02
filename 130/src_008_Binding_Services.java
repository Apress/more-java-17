C:\jdk17book>jlink ^
    --module-path jmods;C:\java17\jmods ^
    --add-modules jdojo.prime.client ^
    --suggest-providers ^
    com.jdojo.prime.PrimeChecker 
Suggested providers: 
  jdojo.prime provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
  jdojo.prime.faster provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
  jdojo.prime.probable provides com.jdojo.prime.
      PrimeChecker used by jdojo.prime 
