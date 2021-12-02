C:\Java9APIsAndModules>java ^
--module-path ^
dist\jdojo.rmi.common.jar;dist\jdojo.rmi.client.jar ^
-Djava.rmi.server.codebase=^
file:///C:/Java9APIsAndModules/dist/jdojo.rmi.common.jar ^
-Djava.security.policy=file:///C:/mypolicy/rmi.policy ^
--module ^
jdojo.rmi.client/com.jdojo.rmi.client.RemoteClient 

Reply: Hello from the RMI client.
