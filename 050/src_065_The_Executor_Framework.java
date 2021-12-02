// Get an executor instance.
Executor executor = Executors.newCachedThreadPool();
// Submit three tasks to the executor  
executor.execute(task1);
executor.execute(task2);
executor.execute(task3);
