C:\Java9LanguageFeatures>javac --module-path ^
    dist\jdojo.annotation.jar ^
    --processor-module-path ^
    dist\jdojo.annotation.processor.jar;
    dist\jdojo.annotation.jar ^
    -d build\modules\jdojo.annotation.test
src\jdojo.annotation.test\classes\module-info.java
src\jdojo.annotation.test\classes\com\jdojo\annotation\
    test\VersionProcessorTest.java  
src\jdojo.annotation.test\classes\com\jdojo\annotation\
    test\VersionProcessorTest.java:7:
error: Version cannot be negative. major=-1 minor=2
public class VersionProcessorTest {
       ^
src\jdojo.annotation.test\classes\com\jdojo\annotation\
    test\VersionProcessorTest.java:13:
error: Version cannot be negative. major=-2 minor=1
    public void m2() {
                ^
2 errors
