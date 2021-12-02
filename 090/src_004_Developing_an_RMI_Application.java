int port = 0; 
RemoteUtility remoteUtilityStub = (RemoteUtility) 
    UnicastRemoteObject.exportObject(remoteUtility, port);
