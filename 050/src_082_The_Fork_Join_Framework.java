List<RecursiveTask<Long>> forks = new ArrayList<>();
for(int i = 0; i < this.count; i++) {
    RandomIntSum subTask = new RandomIntSum(1);
    subTask.fork(); // Launch the subtask
    // Keep the subTask references to combine the 
    // results at the end  
    forks.add(subTask);
}
