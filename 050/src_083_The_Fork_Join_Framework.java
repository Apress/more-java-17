for(RecursiveTask<Long> subTask : forks) {
    result = result + subTask.join();
}
