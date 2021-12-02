// Create a new ThreadGroup  
ThreadGroup myGroup = new ThreadGroup("My Thread Group");
// Make the new thread a member of the myGroup thread group
Thread t = new Thread(myGroup, "myThreadName");
