java –Djava.rmi.server.codebase=^
"http://www.myurl.com/rmiclasses" ^ 
     -Djava.rmi.server.useCodebaseOnly=true ^
     <other-options> ^
     com.jdojo.rmi.RemoteServer 
