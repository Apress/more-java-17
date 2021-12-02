if (Task is small) {
    Solve the task directly.
} else {
    Divide the task into subtasks.
    Launch the subtasks asynchronously (the fork stage).
    Wait for the subtasks to finish (the join stage).
    Combine the results of all subtasks.
}
