System.out.printf("All processes PIDs:%n"); 
ProcessHandle.allProcesses()                     
    .map(ph -> ph.pid()) 
    .sorted()                 
    .forEach(System.out::println); 
