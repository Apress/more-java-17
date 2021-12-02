ProcessBuilder pb = new ProcessBuilder("mycommand"); 
Map<String,String> env = pb.environment(); 
env.put("arg1", "value1"); 
env.put("arg2", "value2"); 
