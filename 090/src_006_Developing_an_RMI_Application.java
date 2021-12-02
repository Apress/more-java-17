RemoteUtilityImpl remoteUtility = new RemoteUtilityImpl();
// No need to export the object 
// Locate the registry 
Registry registry = LocateRegistry.
    getRegistry("localhost", 1099); 
// Bind the exported remote reference in the registry 
String name = "MyRemoteUtility"; 
registry.rebind(name, remoteUtility); 
System.out.println("Remote server is ready..."); 
