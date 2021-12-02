C:\jdk17book>jlink ^
    --module-path jmods;C:\java17\jmods ^
    --add-modules ^
    jdojo.prime.client,jdojo.prime.faster,
    jdojo.prime.probable ^
    --launcher runprimechecker=
    jdojo.prime.client/com.jdojo.prime.client.Main ^
    --output image\primechecker 
