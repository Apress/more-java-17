C:\Java9APIsAndModules>java --module-path ^
dist\jdojo.rmi.common.jar;dist\jdojo.rmi.server.jar ^
-Djava.security.policy=file:///C:/mypolicy/rmi.policy ^ 
-Djava.rmi.dgc.leaseValue=300000 ^
-Djava.rmi.server.codebase=^
file:///C:/Java9APIsAndModules/dist/jdojo.rmi.common.jar ^
--module ^
jdojo.rmi.server/com.jdojo.rmi.server.RemoteServer 

Remote server is ready... 
