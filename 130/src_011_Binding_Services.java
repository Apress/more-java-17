C:\jdk17book>jlink ^
    --module-path jmods;C:\java17\jmods ^
    --add-modules jdojo.prime.client ^
    --compress 2 ^
    --strip-debug ^
    --launcher runprimechecker=
      jdojo.prime.client/com.jdojo.prime.client.Main ^
    --bind-services ^
    --limit-modules java.base,jdojo.prime,
      jdojo.prime.faster,jdojo.prime.probable ^
--output image\image\primecheckercompactservice 
