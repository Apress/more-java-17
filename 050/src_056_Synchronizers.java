public static void main(String[] args) {
    // Start with 0 registered party  
    Phaser phaser = new Phaser();
    // Let's start three tasks  
    final int TASK_COUNT = 3;
    // Initialize all tasks in one go  
    phaser.bulkRegister(TASK_COUNT);
    for(int i = 1; i <= TASK_COUNT; i++) {
        // Now create the task and start it  
        String taskName = "Task #" + i;
        StartTogetherTask task = 
            new StartTogetherTask(taskName, phaser);
        task.start();        
    }        
}
