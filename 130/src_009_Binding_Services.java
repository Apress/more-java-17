C:\jdk17book>jlink ^
    --module-path jmods;C:\java17\jmods ^
    --add-modules jdojo.prime.client ^
    --launcher runprimechecker=
        jdojo.prime.client/com.jdojo.prime.client.Main ^
    --bind-services 
    --output image\primecheckerservice 
