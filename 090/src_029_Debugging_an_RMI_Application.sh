C:\Java9APIsAndModules>java ^
--module-path ^
dist\jdojo.rmi.common.jar;dist\jdojo.rmi.server.jar ^
-Djava.rmi.server.logCalls=true ^
-Djava.security.policy=file:///C:/mypolicy/rmi.policy ^
-Djava.rmi.server.codebase=^
file:///C:/Java9APIsAndModules/dist/jdojo.rmi.common.jar ^
--module ^
jdojo.rmi.server/com.jdojo.rmi.server.RemoteServer 
