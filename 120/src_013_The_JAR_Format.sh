C:\jdk17book>jar --create ^
    --file mrjars\jdojo.mrjar2.jar ^
    -C jdojo.mrjar.jdk8\build\classes . ^
    --release 17 ^
    -C build\modules\jdojo.mrjar ^
    module-info.class ^
    -C build\modules\jdojo.mrjar ^
    com\jdojo\mrjar\TimeUtil.class 
