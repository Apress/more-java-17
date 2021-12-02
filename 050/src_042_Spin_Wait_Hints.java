...
@Override
public void run() {
    // Wait in a loop until data is ready
    while (!dataReady) {
        // No code
    }
    processData();
}
private void processData() {
    // Data processing logic goes here
}
