C:\Java9Revealed>java ^
--class-path lib\com.jdojo.prime.jar;
    lib\com.jdojo.prime.client.jar;
    lib\com.jdojo.prime.faster.jar;
    lib\com.jdojo.prime.generic.jar;
    lib\com.jdojo.prime.probable.jar ^
com.jdojo.prime.client.Main 

Using default service provider: 
Exception in thread "main" java.lang.NullPointerException
        at com.jdojo.prime.client.Main.checkPrimes
            (Main.java:39) 
        at com.jdojo.prime.client.Main.main
            (Main.java:14) 
