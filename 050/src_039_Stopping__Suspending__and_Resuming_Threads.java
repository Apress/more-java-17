while (keepRunning) {
    try {
        someBlockingMethodCall();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
