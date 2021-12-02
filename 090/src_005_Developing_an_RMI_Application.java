Registry registry = 
    LocateRegistry.getRegistry("localhost", 1099);
String name = "MyRemoteUtility"; 
registry.rebind(name, remoteUtilityStub); 
